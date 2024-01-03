


class Main {



	static int findMin(int[] a, int start) {
		int min = Integer.MAX_VALUE;
		for (int i = start; i < a.length; i ++) 
			if (min > a[i]) 
				min = a[i];
		for (int i = start; i < a.length; i++) 
			if (a[i] == min) return i;
		return 0;
	}

	static void selectionSort(int[] a) {

		for (int i = 0; i < a.length - 1; i++) {
			// find minimum element
			int j = findMin(a, i);
			int temp = a[i];
			a[i] = a[j];
			a[j] = temp;
		}

	}

	public static void main(String[] args) {
		

		int[] a = {2, 1, 3, 5, 4};

		selectionSort(a);

		for (int i : a) {
			System.out.print(i +  " ");
		}
		System.out.println();

	}
}