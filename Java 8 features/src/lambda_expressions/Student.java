package lambda_expressions;

public class Student {

	public static void main(String[] args) {
		Marks marks=(m)->m+1;
		System.out.println(marks.adMarks(100));
	}
}
@FunctionalInterface
interface Marks{
	abstract int adMarks(int marks);
}