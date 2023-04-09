package sdms;

import java.util.Scanner;

import customException.InvalidChoiceException;

public class Solution {

	public static void main(String[] args) 
	{
		Scanner ip=new Scanner(System.in);
		StudentManagementSystem smsimpl=new StudentManagementSystemImpl();			//UPCASTED REFERENCE VARIABLE

		while(true)
		{
			System.out.println("==================================================================");
			System.out.println("=====Welcome To Student DB Project====\n1:Add student\n2:Display Student\n3:Display All Students\n4:Remove Student\n5:Remove All Students");
			System.out.println("6:Update Student\n7:Count Student\n8:Sort Student\n9:Get Student With HighestMarks\n10:Get Student With HighestMarks\n11:Exit");
			System.out.println("==================================================================");
			System.out.println("Choose One Option");
			int choice=ip.nextInt();
			switch(choice)
			{
			case 1:smsimpl.addStudent();
			break;
			case 2:smsimpl.displayStudent();
			break;
			case 3:smsimpl.displayAllStudent();
			break;
			case 4:smsimpl.removeStudent();
			break;
			case 5:smsimpl.removeAllStudent();
			break;
			case 6:smsimpl.updateStudent();
			break;
			case 7:smsimpl.countStudent();
			break;
			case 8:smsimpl.sortStudent();
			break;
			case 9:smsimpl.getStudentWithHighestMarks();
			break;
			case 10:smsimpl.getStudentWithLowestMarks();
			break;
			case 11:System.out.println("Thank You");
			System.exit(0);
			break;
			default:try {
				System.out.println("Test code ");
				System.out.println("i am adding in the new branch ");
				throw new InvalidChoiceException("Invalid Choice,Kindly Enter Valid Choice");
			}
			catch(Exception e){
				System.out.println(e.getMessage());
			}

			}
		}
		


	}

}
