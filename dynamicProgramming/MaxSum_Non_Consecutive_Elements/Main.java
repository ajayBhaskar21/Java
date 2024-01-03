/*

ip = [2, 1, 7, 9]
op = 11  // Maximum non adjacent sum

*/

import java.util.*;

class Main {


	static int fun (int ind, ArrayList<Integer> a, int[] dp) {

		if (ind == 0) return a.get(0);
		if (ind < 0) return 0;
		if (dp[ind] != -1) return dp[ind];
		// pick
		int pick = a.get(ind) + fun (ind - 2, a, dp);
		// not pick
		int notPick = fun(ind - 1, a, dp);
		dp[ind] = Math.max(pick, notPick);
		return Math.max(pick, notPick);

	}

	static int fun (ArrayList<Integer> a, int ind, int[] dp) {
		if (ind == a.size() - 1) return a.get(a.size() - 1);
		if (ind >= a.size()) return 0;
		if (dp[ind] != -1) return dp[ind];
		// pick
		int pick = a.get(ind) + fun (a, ind + 2, dp);
		// not pick
		int notPick = fun(a, ind + 1, dp);
		dp[ind] = Math.max(pick, notPick);
		return Math.max(pick, notPick);
	}

	public static int maximumNonAdjacentSum(ArrayList<Integer> a) {
		int[] dp = new int[a.size()];
		for (int i = 0; i < a.size(); i ++) dp[i] = -1;
		return fun(a, 0, dp);
	}

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<>();
		a.add(2);
		a.add(1);
		a.add(7);
		a.add(9);
		System.out.println(maximumNonAdjacentSum(a));
	}
}