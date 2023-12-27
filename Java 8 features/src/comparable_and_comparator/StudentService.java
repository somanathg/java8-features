package comparable_and_comparator;

import java.awt.print.Book;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentService {

	
	public List<Student>getAllStudents(){
		List<Student> students = new StudentDao().getStudents();
		Collections.sort(students,( o1, o2)-> o1.getName().compareTo(o2.getName()));
		return students;
	}
	
	
	public static void main(String[] args) {
	
		System.out.println(new StudentService().getAllStudents());
	}
}




//****Traditional approach **********
//Approach1 bycreating seperate interface
//public List<Student>getAllStudents(){
//	List<Student> students = new StudentDao().getStudents();
//	Collections.sort(students,new MyComparator());
//	return students;
//}
//
//
//public static void main(String[] args) {
//
//	System.out.println(new StudentService().getAllStudents());
//}
//}
//class MyComparator implements Comparator<Student>{
//
//@Override
//public int compare(Student o1, Student o2) {
//	// TODO Auto-generated method stub
//	return o1.getName().compareTo(o2.getName());
//}

//****approach 2
//public List<Student>getAllStudents(){
//	List<Student> students = new StudentDao().getStudents();
//	Collections.sort(students,new Comparator<Student>() {
//
//		@Override
//		public int compare(Student o1, Student o2) {
//			// TODO Auto-generated method stub
//			return o1.getName().compareTo(o2.getName());
//		}
//	});
//	return students;
//}
//
//
//public static void main(String[] args) {
//
//	System.out.println(new StudentService().getAllStudents());
//}

