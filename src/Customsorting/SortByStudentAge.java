package Customsorting;

import java.util.Comparator;

import sdms.Student;

public class SortByStudentAge implements Comparator<Student>
{
	@Override
	public int compare(Student x,Student y)
	{
		return x.getAge()-y.getAge();
	}
}
