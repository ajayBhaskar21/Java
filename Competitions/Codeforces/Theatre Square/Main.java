
import java.util.*;

public class Main {


	public static void main(String[] args) {
			
		Scanner in = new Scanner (System.in);
		long n = in.nextLong();
		long m = in.nextLong();
		long a = in.nextLong();
		


		long a1 = n / a;
		long a2 = m / a;

		if (n % a != 0) a1 ++;
		if (m % a != 0) a2 ++;
		System.out.println(a1 * a2);

	}
}