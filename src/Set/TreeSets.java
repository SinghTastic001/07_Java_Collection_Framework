package Set;

import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSets {

	public static void main(String[] args) {
		
		TreeSet<Integer> tr = new TreeSet<Integer>();
		
		tr.add(12);
		tr.add(3);
		tr.add(5);
		tr.add(10);
		tr.add(1);
		tr.add(6);
		tr.add(8);
		
		System.out.println(tr);
		System.err.println(tr.size());
		
		System.out.println(tr.remove(3));
		System.out.println(tr);
		
		Object[] ob= tr.toArray();
		System.out.println(Arrays.toString(ob));
		
		for(int i=0; i<ob.length; i++) {
			System.out.println(ob[i]);
		}
		
		Iterator<Integer> it= tr.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
