package sdms;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import customException.InvalidChoiceException;
import customException.StudentNotFoundException;

public class StudentManagementSystemImpl implements StudentManagementSystem 
{
	Scanner ip=new Scanner(System.in);
	Map<String,Student> db=new LinkedHashMap<String,Student>();
	@Override
	public void addStudent() 
	{
		System.out.println("Enter Student Age: ");
		int age=ip.nextInt();								//accept age,name,marks
		System.out.println("Enter Student Name: ");
		String name=ip.next();								//create student instance
		System.out.println("Enter Student Marks: ");
		int marks=ip.nextInt();							//add student instance into db -> db -> map->put() ->key is id value is student

		Student std=new Student(age,name,marks);
		db.put(std.getId(), std);
		System.out.println("Student record inserted succefully");
		System.out.println("Student ID is: "+std.getId());
	}
	@Override
	public void displayStudent() 
	{
		System.out.println("Enter Student ID ");
		String id=ip.next();    			//String id=ip.next().toUppercase();
		id=id.toUpperCase();
		if(db.containsKey(id))					//containsKey check whether db contains id or not
		{
			Student std=db.get(id);
			System.out.println("ID :"+std.getId());
			System.out.println("Name :"+std.getName());
			System.out.println("Age :"+std.getAge());
			System.out.println("Marks :"+std.getMarks());

		}
		else
		{
			try {
				throw new StudentNotFoundException("Student ID is not found");
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
		}
	}
	@Override
	public void displayAllStudent() 
	{
		if(db.size()!=0)
		{
			System.out.println("Student ID are as follows: ");
			System.out.println("============================");
			Set<String> keys=db.keySet();						//Map(db) into set -> keyset()
			for(String key:keys)								//for each loop traverse keys
			{													//db,get(key) -> value(Student,Object) -> toString() ->print
				System.out.println(key+db.get(key));		//or Student value=db.get(key);	
			}												// System.out.println(value);
		}
		else
		{
			try {
				String message="Student Database is empty,Nothing To Display";
				throw new StudentNotFoundException(message);
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
		}

	}
	@Override
	public void removeStudent() 
	{
		System.out.println("Enter Student Id: ");
		String id=ip.next();
		id=id.toUpperCase();
		if(db.containsKey(id))
		{
			System.out.println("Student Record Found");
			System.out.println(db.get(id));
			db.remove(id);
			System.out.println("Student record removed successfully");
		}
		else {
			try {
				throw new StudentNotFoundException("Student Id is not found");
			}
			catch(Exception e){
				System.out.println(e.getMessage());
			}
		}

	}
	@Override
	public void removeAllStudent() 
	{
		if(db.size()!=0)
		{
			System.out.println("No of Student Records Are :"+db.size());
			db.clear();
			System.out.println("All Students Records Are Deleted Successfully");
		}
		else {
			try {
				String message="Student Database is Empty,Nothing To Delete";
				throw new StudentNotFoundException(message);
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
	@Override
	public void updateStudent() 
	{
		System.out.println("Enter Student Id");
		String id=ip.next().toUpperCase();
		if(db.containsKey(id))
		{
			Student std=db.get(id);
			System.out.println(" 1:Update Age\n2:Update Name\n3:Update Marks");
			int choice=ip.nextInt();
			switch(choice)
			{
			case 1:System.out.println("Enter Age: ");
			int age=ip.nextInt();
			std.setAge(age);
			break;
			case 2:System.out.println("Enter Name: ");
			String name=ip.next();
			std.setName(name);
			break;
			case 3:System.out.println("Enter Marks: ");
			int marks=ip.nextInt();
			std.setMarks(marks);
			break;
			default : try {
				throw new InvalidChoiceException("Invalid Choice");
			   }
			catch(Exception e){
				System.out.println(e.getMessage());
				updateStudent();
			   }
			}
		}
		else {
			try {
				throw new StudentNotFoundException("Student Record Not Found");
			}
			catch(Exception e){
				System.out.println(e.getMessage());
			}
		}
	}
	@Override
	public void countStudent() 
	{
		System.out.println("No of Student Records: "+db.size());

	}
	@Override
	public void sortStudent() 
	{
		

	}
	@Override
	public void getStudentWithHighestMarks() 
	{

	}
	@Override
	public void getStudentWithLowestMarks() 
	{

	}

}
