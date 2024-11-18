package Set;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSets {

	public static void main(String[] args) {
		
		LinkedHashSet<Integer> li = new LinkedHashSet<Integer>();
		li.add(12);
		li.add(4);
		li.add(10);
		li.add(15);
		li.add(16);
		li.add(17);
		li.add(60);
		
		System.out.println("set "+li);
//		System.out.println("remove "+li.removeFirst());
//		System.out.println("remove last"+ li.removeLast());
		System.out.println("size "+li.size());
		
		Object[] ob=li.toArray();
		System.out.println(Arrays.toString(ob));
		
		for(int i=0; i<ob.length; i++) {
			System.out.println(ob[i]);
		}
		
		Iterator<Integer> it = li.iterator();
		while(it.hasNext()) {
			System.out.println(it.next() );
		}
	}
}
