

/*
	ip : [[1], [1], [2,2], [2, 2]]

	op : [[1], [2, 2]]

*/


import java.util.*;

public class test1 {

	static void construct(ArrayList<ArrayList<Integer>> a, Scanner in) {
		for (int i = 0; i < 4; i ++) {
			System.out.print("Enter size : ");
			int n = in.nextInt();
			ArrayList<Integer> a1 = new ArrayList<>();
			System.out.println("Enter elements : ");
			while(n -- > 0) {
				a1.add(in.nextInt());
			}	
			a.add(a1);
		}
	}
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		ArrayList<ArrayList<Integer>> a = new ArrayList<> ();

		construct(a, in);
		System.out.println(a);

		HashSet<String> set = new HashSet<>();
		System.out.println(a.get(0).toString().length());

		for (int i = 0; i < 4; i++) {
			set.add(a.get(i).toString());
		}
		System.out.println(set);


	}
}



