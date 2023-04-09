package Customsorting;

import java.util.Comparator;

import sdms.Student;

public class SortByStudentMarks implements Comparator<Student>
{
	@Override
	public int compare(Student x, Student y)
	{
		return x.getMarks()-y.getMarks();
	}
}
