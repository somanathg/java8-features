package streams_java8.example;

import java.util.ArrayList;
import java.util.List;

public class Database {
//Dao layer
	public static List<Employee> getEmployee() {
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee(1, "somanath", "qa", 50000));
		employees.add(new Employee(2, "amar", "dev", 45000));
		employees.add(new Employee(3, "monu", "test", 55000));
		employees.add(new Employee(1, "aman", "ba", 60000));
		return employees;
	}
}
