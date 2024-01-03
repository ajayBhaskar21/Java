// Bubble Sort Algorithm



class Main {


	static void bubbleSort(int[] a, int n) {

		for (int j = 0; j < n; j++) { // repeat below steps for n times
			for (int i = 0; i < n - 1; i++) {
				// compare ele with adjacent ele and swap accordingly
				if (a[i] > a[i + 1]) {
					int temp = a[i];
					a[i] = a[i + 1];
					a[i + 1] = temp;
				}
			}
		}

		
	}

	public static void main(String[] args) {
		
		int[] a = {2, 1, 3, 5, 4};
		bubbleSort(a, a.length);
		for (int i : a) System.out.print(i + " ");

	}
} 
