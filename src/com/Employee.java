package com;

public class Employee 
{
	String id;
	String name;
	static int count=101; 									//has only 1 COPY hence has to use STATIC
	Employee(String name)
	{
		this.id="A"+count;
		this.name=name;
		count++;
	}

	public static void main(String[] args) 
	{
		Employee e1=new Employee("Tom");
		System.out.println(e1.id+" "+e1.name);
			
		Employee e2=new Employee("Depp");
		System.out.println(e2.id+" "+e2.name);

		Employee e3=new Employee("Jonny");
		System.out.println(e3.id+" "+e3.name);

		Employee e4=new Employee("Amber");
		System.out.println(e4.id+" "+e4.name);

	}

}
