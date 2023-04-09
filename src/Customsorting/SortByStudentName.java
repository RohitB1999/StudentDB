package Customsorting;

import java.util.Comparator;

import sdms.Student;

public class SortByStudentName implements Comparator<Student>
{
	@Override
	public int compare(Student x,Student y)
	{
		return x.getName().compareTo(y.getName());
	}
}
