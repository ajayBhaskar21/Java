
import java.util.*;

class J {

	static void p(String s) {
		System.out.println(s);
	}
	static void p(ArrayList<Integer> s) {
		System.out.println(s);
	}

	static void p() {
		System.out.println();
	}

	public static void main(String[] args) {
		

		ArrayList<Integer> a = new ArrayList<>();
		a.add(11);
		p(a);
		ArrayList<Integer> c = new ArrayList<>();
		c.add(100);
		c.add(11);
		c.add(11);
		c.add(100);
		ArrayList<Integer> b = a;
		p(b);
		c.removeAll(b);
		p(c);
		p(b);
	}
}












