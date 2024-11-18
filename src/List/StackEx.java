package List;

import java.util.List;
import java.util.Stack;

public class StackEx {

	public static void main(String[] args) {
		
		List<Integer> li = new Stack<Integer>();
		li.add(2);
		li.add(3);
		li.add(10);
		li.add(11);
		
		System.out.println(li);
		System.out.println(li.get(0));
		System.out.println(li.remove(2));
		
//		same as array
	}
}
