

class Main {


	public static void main(String[] args) {
		

		String s = "abciiidef";
		char[] a = s.toCharArray();
		int k = 3;
		int maxS = 0;
		for (int i = 0; i < k; i ++) {
			if ((a[i] == 'a') || (a[i] == 'e') || (a[i] == 'i') ||
				(a[i] == 'o') || (a[i] == 'u'))
				maxS += 1;
		}
		int cSum = maxS;
		for (int i = k; i < s.length(); i++) {
			if ( (a[i - k] == 'a') || (a[i - k] == 'e') || (a[i - k] == 'i') ||
				(a[i - k] == 'o') || (a[i - k] == 'u') ) {
				cSum -= 1;
			}
			if ((a[i] == 'a') || (a[i] == 'e') || (a[i] == 'i') ||
				(a[i] == 'o') || (a[i] == 'u')) {
				cSum += 1;
			}

			maxS = Math.max(cSum, maxS);

		}
		System.out.println(maxS);
	}
}