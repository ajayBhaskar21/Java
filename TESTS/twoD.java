



import java.util.*;


class twoD {



	public static void main(String[] args) {
		

		ArrayList<ArrayList<Integer>> ta = new ArrayList<>();


		ArrayList<Integer> a = new ArrayList<>();

		a.add(1);
		a.add(2);

		System.out.println(a);
		ta.add(a);			

		System.out.println(ta);

		a.clear();
		a.add(200);
		a.add(20);

		System.out.println(ta);


	}
}



