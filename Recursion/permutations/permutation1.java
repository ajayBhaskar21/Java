


import java.util.*;

class permutation1 {

	/*
	static void permutations(char[] str, ArrayList<Character> ds, int[] map) {


		if (ds.size() == str.length) {
			System.out.println(ds);
			return;
		}

		for (int i = 0; i < str.length; i++) {
			if (map[i] == 0) {
				ds.add(str[i]);
				map[i] = 1;
				permutations(str, ds, map);
				ds.remove(ds.size() - 1);
				map[i] = 0;
			}
		}

	}
*/
	static void permutations(String str, ArrayList<Character> ds, int[] map, ArrayList<String> sol) {


		if (ds.size() == str.length()) {
			//System.out.println(ds);

			String s = "";
			for (Character c : ds) {
				s += c;
			}
			sol.add(s);
			return;
		}

		for (int i = 0; i < str.length(); i++) {
			if (map[i] == 0) {
				ds.add(str.charAt(i));
				map[i] = 1;
				permutations(str, ds, map, sol);
				ds.remove(ds.size() - 1);
				map[i] = 0;
			}
		}

	}

	static ArrayList<String> permutation(String S)
    {
        //Your code here
        
    	ArrayList<String> answer = new ArrayList<>();

    	// Sort the string first

    	char[] out = S.toCharArray();
    	Arrays.sort(out);

    	permutations( new String(out)  , new ArrayList<>(), new int[S.length()], answer);
        return answer;
        
        
    }



	public static void main(String[] args) {
		


		//char[] str = {'A', 'A', 'A'};
		String str = "ACB";
		//permutations(str, new ArrayList<>(), new int[str.length()]);

		ArrayList<String> sol = new ArrayList<>();

		sol = permutation("ABC");
		System.out.println(sol);


	}
}