package Set;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;

public class HashSet {

	public static void main(String[] args) {
		
		Set<Integer> s = new java.util.HashSet<Integer>();
		s.add(10);
		s.add(40);
		s.add(2);
		s.add(5);
		s.add(9);
		s.add(11);
		
		System.out.println("set "+s);
		System.out.println("remove "+s.remove(2));
		System.out.println("size "+s.size());
		
//		no set , no get
		
		Object[] ob= s.toArray();
		System.out.println(Arrays.toString(ob));
		
		for(int i=0; i<ob.length; i++) {
			System.out.println(ob[i]);
		}
		
//		second way geting
		
		Iterator<Integer> it =  s.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
