


import java.util.*;
public class Main {

	public static void main(String[] args) {
		

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = in.nextInt();
		}
		int c = 0;
		for (int i = 0; i < n; i ++) {
			if ((a[i] == 0 && a[k - 1] == 0)) continue;
			if (a[i] >= a[k - 1] ) c++;
		}

		System.out.println(c);


	}
}