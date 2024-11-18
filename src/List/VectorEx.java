package List;

import java.util.Vector;

public class VectorEx {

	public static void main(String[] args) {
		
		Vector<Integer> vc = new Vector<Integer>();
		vc.add(1);
		vc.add(10);
		vc.add(15);
		vc.add(100);
		vc.add(1000);
		vc.add(500);
		vc.add(2);
		
		System.out.println(vc);
		System.out.println(vc.get(2));
		System.out.println(vc.size());
		System.out.println(vc.remove(0));
		System.out.println(vc.set(1, 20000));
		
		System.out.println("vector "+vc);
		
		for(int i=0; i<vc.size(); i++) {
			System.out.println(vc.get(i));
		}
	}
}
