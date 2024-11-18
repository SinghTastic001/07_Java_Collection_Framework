package List;

import java.util.Stack;

public class StackClass {

	public static void main(String[] args) {
		
		Stack<Integer> st = new Stack<Integer>();
//		st.add(1);
//		st.add(2);
//		System.out.println(st);
//		it work
		
		
		st.push(1);
		st.push(90);
		st.push(30);
		st.push(100);
		st.push(500);
		System.out.println(st);
		System.out.println(st.pop());
		System.out.println(st.peek());
		System.out.println(st.size());
//		System.out.println(st.remove(0));
		
		for(int i=0; i<st.size(); i++) {
			System.out.println(st.get(i));
		}
	}
}
