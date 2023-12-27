package streams_java8.example;

import java.util.List;
import java.util.stream.Collectors;

public class EmployeeService {

	public static List<Employee> taskUsers() {
		// return Database.getEmployee().stream().filter(emp -> emp.getSalary() >
		// 40000).collect(Collectors.toList());
		return Database.getEmployee().stream().filter((emp) -> emp.getSalary() > 40000).collect(Collectors.toList());
	}

	public static void main(String[] args) {
		System.out.println(taskUsers());
	}
}
