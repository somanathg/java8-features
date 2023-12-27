package streams_java8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FilterDemo {
	public static void main(String[] args) {
		List<String>list=new ArrayList<String>();
		list.add("jaipur");
		list.add("mumbai");
		list.add("delhi");
		list.add("pune");
		
		//by traditional mehtod loop and condition
//		for (String string : list) {
//			if (!string.startsWith("j")) {
//				System.out.println(string);
//			}
//		}
		
		//by stream api-filter interface
	//	list.stream().forEach((t)->System.out.println(t.startsWith("j")));
		
		//condition-print if list start with j
		list.stream().filter((t)->t.startsWith("j")).forEach(t->System.out.println(t));
		

		Map<Integer, String>map=new HashMap<Integer, String>();
		map.put(1, "Jaipur");
		map.put(2, "mumbai");
		map.put(3, "delhi");
		map.put(4, "pune");
		
		
		//print if key is even only
		map.entrySet().stream().filter((t)->t.getKey()%2==0).forEach((obj->System.out.println(obj)));;
		
		
		
		
		
		
		
		
		
	}
}
