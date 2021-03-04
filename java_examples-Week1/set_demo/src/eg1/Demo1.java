package eg1;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Demo1 {

	public static void main(String[] args) {
		
		Set<String> hs=new HashSet<>();
		hs.add("hello");
		hs.add("hello");
		hs.add("hey");
		hs.add("java");
		hs.add("jee");
		hs.add("java");
		hs.add("vinay");
		hs.add(null);
		hs.add(null);
		hs.add("blueee");
		System.out.println("hs : "+hs);
		
		Set<String> lhs=new LinkedHashSet<>();
		lhs.add("hello");
		lhs.add("hello");
		lhs.add("hey");
		lhs.add("java");
		lhs.add("jee");
		lhs.add("java");
		lhs.add("vinay");
		lhs.add(null);
		lhs.add(null);
		lhs.add("blueee");
		System.out.println("lhs : "+lhs);
		
		
		//Set<String> ts=new TreeSet<>(); //ascending
		Set<String> ts=new TreeSet<>(Collections.reverseOrder()); //descending
		ts.add("hello");
		ts.add("hello");
		ts.add("hey");
		ts.add("java");
		ts.add("jee");
		ts.add("java");
		ts.add("vinay");
	//	ts.add(null);
	//	ts.add(null);
		ts.add("blueee");
		System.out.println("ts : "+ts);
		
		System.out.println(ts.contains("vinay"));
		System.out.println(ts.contains("raj"));
		System.out.println(ts.size());
		ts.remove("vinay");
		System.out.println(ts);
		
		for(String s:ts) {
			System.out.println(s);
		}
		

	}

}
