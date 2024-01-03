
import java.util.*;

class Main {

	public static int fun (int ind, int[] heights, int[] dp) {
		if (ind == 0) return 0;
		if (dp[ind] != -1) return dp[ind];
		int left = fun (ind - 1, heights, dp) + Math.abs(heights[ind] - heights[ind - 1]);
		int right = Integer.MAX_VALUE;
		if (ind > 1)
			right = fun (ind - 2, heights, dp) + Math.abs(heights[ind] - heights[ind - 2]);
		dp[ind] = Math.min(left, right);
		return Math.min(left, right);
	}

	public static int frogJump (int n, int[] heights) {
		int[] dp = new int[n];
		for (int i = 0; i < n; i ++) dp[i] = -1;
		return fun(n - 1, heights, dp);
	}

	public static void main(String[] args) {
		
		System.out.println(frogJump(6, new int[] {30, 10, 60, 10, 60, 50}));

	}
}