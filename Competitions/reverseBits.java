
import java.util.*;
import java.io.*;

class reverseBits {



	static long reverseBits(int n) {
		int[] a = new int[32];
		int last = 31;
		while (n > 0) {
			a[last--] = n % 2;
			n /= 2;
		}
		long sol = 0;
		for (int i = 0; i < 32; i++) {
			sol += Math.round(Math.pow(2, i)) * a[i];
		}
		return sol;
	}


	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a num: ");
		int n = in.nextInt();
		// 4 - [0, 0, 0 , ....... 1, 0, 0] = 32 bits.
		// reverse bits and then convert into number then print it.
		// [0, 0, 1, 0, 0, 0, 0, ...... ] = 32 bits.

		System.out.println("solution = " + reverseBits(n));

	}
}