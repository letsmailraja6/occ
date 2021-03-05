package eg1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Demo1 {

	public static void main(String[] args) {
		//Delete all the key value pairs whose key is null or whose value is null or whose key is multiples of 10;
		
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
		hm.put(22	, "jse");
		hm.put(222	, "jee");
		hm.put(122	, "spring");
		System.out.println("map before deletion : ");
		System.out.println(hm);
		
		Iterator<Entry<Integer, String>> i=hm.entrySet().iterator();  //this syntax is for Map
		//if it is Set or List or Queue then the syntax will be 
		//Iterator<Object(which your list or set or queue is holding)>i=listobj or setobj or qobj.iterator()
		//Iterator<Player> i=playerList.iterator();
		
//		for(Entry<Integer, String> e:hm.entrySet()) {
//			if(e.getKey()==null || e.getValue()==null || e.getKey()%10==0) {
//				hm.remove(e.getKey());
//			}
//		}
		
		while(i.hasNext()) {
			Entry<Integer, String> e=i.next();  //read and post increment
			if(e.getKey()==null || e.getValue()==null || e.getKey()%10==0) {
				i.remove();
			}
		}
		
		System.out.println("\n\nmap after deletion : ");
		System.out.println(hm);

	}

	/*
	 * Enumerator -> read operation from top to bottom
	 * Iterator -> read and remove operation from top to bottom
	 * ListIterator -> add, read, remove operations and is bidirectional but applicable only on Collection List
	 */
}
