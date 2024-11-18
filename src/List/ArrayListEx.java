package List;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx {
	
	public static void main(String[] args) {
		
		List<Integer> li = new ArrayList<Integer>();
		li.add(12);
		li.add(6);
		li.add(2);
		li.add(1);
		li.add(100);
		li.add(50);
		
		System.out.println("list"+li);
		System.out.println(li.get(3));
		System.out.println("size "+li.size());
		System.out.println("remove "+li.remove(0));
		System.out.println("list "+li);
		System.out.println(li.set(1,100));
		System.out.println(li);
		
		for(int i=0; i<li.size(); i++) {
			System.out.println(li.get(i));
		}
	}

}
