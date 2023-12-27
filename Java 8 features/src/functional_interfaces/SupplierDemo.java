package functional_interfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierDemo {

	public static void main(String[] args) {
	//	Supplier<String> sup =() -> "Hello java" ;
		// Supplier<Integer> sup=() -> 5*5;
	//	System.out.println(sup.get());
		
		List<String>l1=Arrays.asList("A","E","I","O","U");
		System.out.println(l1.stream().findAny().orElseGet(() -> "Hello java"));
	}

}

//supplier always return string

//*****traditional approach
//@Override
//public String get() {
//	// TODO Auto-generated method stub
//	return "Hello java";
//}
//
//public static void main(String[] args) {
//	Supplier<String> sup=new SupplierDemo();
//	System.out.println(sup.get());
//}