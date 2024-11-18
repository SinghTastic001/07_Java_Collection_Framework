package List;

import java.util.LinkedList;

public class LinkedListEx {

	public static void main(String[] args) {
		
		LinkedList<String> li = new LinkedList<String>(); 
		li.add("mango");
		li.add("apple");
		li.add("banana");
		li.add("orange");
		li.add("grapes");
		
		System.out.println("list "+li);
		System.out.println(li.get(0));
		System.out.println(li.remove(2));
		System.out.println(li.remove());
		System.out.println(li.set(0, "coconut0"));
		System.out.println(li.size());
		
		for(int i=0; i<li.size(); i++) {
			System.out.println(li.get(i));
		}
	}
}
