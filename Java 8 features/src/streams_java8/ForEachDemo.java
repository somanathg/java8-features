package streams_java8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class ForEachDemo {
public static void main(String[] args) {
	
//	List<String>list=new ArrayList<String>();
//	list.add("jaipur");
//	list.add("mumbai");
//	list.add("delhi");
//	list.add("pune");
//	
//	
//	//**tradional approach
//	//using for loop
//	System.out.println("Using for loop");
//	for (int i = 0; i < list.size(); i++) {
//		System.out.println(list.get(i));
//	}
//	//using Iterator interface
//	System.out.println("Using Iterator interface");
//	for (Iterator iterator = list.iterator(); iterator.hasNext();) {
//		String string = (String) iterator.next();
//		System.out.println(string);
//		
//	}
//	
//	//using for each loop
//	System.out.println("Using for each loop");
//	for(String l:list) {
//		System.out.println(l);
//	}
//	
//	//use forEach method of stream api
//	System.out.println("Using stream api -foreach method ");
//	list.stream().forEach(l1->System.out.println(l1));
	
	Map<Integer, String>map=new HashMap<Integer, String>();
	map.put(1, "Jaipur");
	map.put(2, "mumbai");
	map.put(3, "delhi");
	map.put(4, "pune");
	
//	for (Entry<Integer, String> entry : map.entrySet()) {
//        System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
//    }
	//by using iteration
	map.forEach((k,v)->System.out.println("Key: "+k+" Value "+v));
	//using pipeline method from stream class
	map.entrySet().forEach(obj->System.out.println(obj));
}
}
