package functional_interfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {

	public static void main(String[] args) {
		Consumer<Integer> cn = i -> System.out.println("printing: " + i);
		cn.accept(12);

		List<Integer> list = Arrays.asList(10, 14, 5, 8, 85, 81, 6, 65, 78, 5, 4);
		list.stream().forEach(i -> System.out.println("printing: " + i));
	}
}
