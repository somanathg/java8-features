package functional_interfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo {

//	@Override
//	public boolean test(Integer t) {
//		
//		if (t%2==0) {
//			return true;
//		}
//		return false;
	// }
	public static void main(String[] args) {
//		Predicate<Integer>predicate=new PredicateDemo();
//		System.out.println(predicate.test(14));

		Predicate<Integer> predicate1 = t -> t % 2 == 0;
	//	System.out.println(predicate1.test(14));
		
		List<Integer>list=Arrays.asList(10,14,5,8,85,81,6,65,78,5,4);
		list.stream().filter(predicate1).forEach(i->System.out.println("printing even: "+i));
		list.stream().filter(t -> t % 2 != 0).forEach(i->System.out.println("printing Odd: "+i));
	}

}
