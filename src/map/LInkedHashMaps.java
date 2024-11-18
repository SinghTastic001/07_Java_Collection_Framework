package map;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class LInkedHashMaps {

	public static void main(String[] args) {
		
		LinkedHashMap<Integer, String> m = new LinkedHashMap<Integer, String>();
		m.put(1, "ridhi");
		m.put(2, "suman");
		m.put(3, "somaya");
		m.put(4, "rahul");
		m.put(5, "ankita");
		m.put(6, "smy");
		
		System.out.println(m);
		System.out.println(m.size());
		System.out.println(m.get(2));
		System.out.println(m.remove(1));
		System.out.println(m.keySet());
		System.out.println(m.values());
		
		for(Integer i :m.keySet()) {
			System.out.println(m.get(i));
		}
		
		for(Entry<Integer, String> mk : m.entrySet()) {
			System.out.println(mk);
		}

	}
}
