package eg1;

import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Demo1 {

	public static void main(String[] args) {
		
		Map<Integer, String> hm=new HashMap<>();
		hm.put(100, "java");
		hm.put(100, "java updated");
		hm.put(null, "java");
		hm.put(101, "java");
		hm.put(999, "java");
		hm.put(900, null);
		hm.put(901, null);
		hm.put(300, null);
		hm.put(null, null);
		System.out.println("hm : "+hm);
		
		Map<Integer, String> lhm=new LinkedHashMap<>();
		lhm.put(100, "java");
		lhm.put(100, "java updated");
		lhm.put(null, "java");
		lhm.put(101, "java");
		lhm.put(999, "java");
		lhm.put(900, null);
		lhm.put(901, null);
		lhm.put(300, null);
		lhm.put(null, null);
		System.out.println("lhm : "+lhm);
		
		//Map<Integer, String> tm=new TreeMap<>(); //ascending for key
		Map<Integer, String> tm=new TreeMap<>(Collections.reverseOrder()); //descending for key
		tm.put(100, "java");
		tm.put(100, "java updated");
		//tm.put(null, "java");
		tm.put(101, "java");
		tm.put(999, "java");
		tm.put(900, null);
		tm.put(901, null);
		tm.put(300, null);
		//tm.put(null, null);
		System.out.println("tm : "+tm);
		
		Map<Integer, String> ht=new Hashtable<>();
		ht.put(100, "java");
		ht.put(100, "java updated");
		//ht.put(null, "java");
		ht.put(101, "java");
		ht.put(999, "java");
		//ht.put(900, null);
		//ht.put(901, null);
		//ht.put(300, null);
		//ht.put(null, null);
		System.out.println("ht : "+ht);
		
		System.out.println(ht.size());
		System.out.println(ht.containsKey(12));
		System.out.println(ht.containsKey(100));
		System.out.println(ht.containsValue("java"));
		System.out.println(ht.containsValue("jee"));
		
		System.out.println(ht.get(100));
		System.out.println(ht.get(10000));
		
		ht.remove(100);
		System.out.println(ht);
		
		System.out.println(ht.keySet()); //just keys
		System.out.println(ht.values()); //just values
		
		Set<Integer> set=ht.keySet();
		System.out.println("\n\nIterating on Map using keySet()");
		for(Integer i:set) {
			System.out.println("key is : "+i+" value is : "+ht.get(i));
		}
		System.out.println("\n\nIterating on Map using entrySet()");
		for(Entry<Integer, String> e:ht.entrySet()) {
			System.out.println("key -> "+e.getKey()+" value -> "+e.getValue());
		}
		

	}

}
