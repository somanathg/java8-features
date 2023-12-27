package comparable_and_comparator;

import java.util.ArrayList;
import java.util.List;

public class StudentDao  {

	public List<Student>getStudents(){
		List<Student >student=new ArrayList<Student>();
		student.add(new Student(1,"John",95));
		student.add(new Student(2,"Stock",92));
		student.add(new Student(85, "Aman", 88));
	
		return student;
	}
}
