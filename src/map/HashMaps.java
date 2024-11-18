package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMaps {

	public static void main(String[] args) {
		
		
		Map<Integer, String> mp = new HashMap<Integer, String>();
		
		mp.put(1, "mango");
		mp.put(2,"grapes");

		mp.put(3, "orange");
		mp.put(4, "apple");
		mp.put(5, "kiwi");
		mp.put(6, "guava");
		
		System.out.println(mp);
		System.out.println(mp.size());
		System.out.println(mp.keySet());
		System.out.println(mp.values());
		
		System.out.println(mp.remove(1));
		System.out.println(mp);
		
		for(Integer i:mp.keySet()) {
			System.out.println(mp.get(i));
		}
		
		for(Entry<Integer, String> m : mp.entrySet()) {
			System.out.println(m);
		}
	}
}
