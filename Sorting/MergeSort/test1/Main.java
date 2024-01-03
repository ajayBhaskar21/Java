import java.util.Scanner;

public class Main {

    static void merge(int[] a, int low, int high, int mid) {
        int size1 = mid - low + 1;
        int size2 = high - mid;
        int[] a1 = new int[size1];
        int[] a2 = new int[size2];
        
        for (int i = 0; i < size1; i++) {
            a1[i] = a[low + i];
        }
        for (int i = 0; i < size2; i++) {
            a2[i] = a[mid + 1 + i];
        }
        
        int i = 0, j = 0, k = low;
        
        while (i < size1 && j < size2) {
            if (a1[i] < a2[j]) {
                a[k++] = a1[i++];
            } else {
                a[k++] = a2[j++];
            }
        }
        
        while (i < size1) {
            a[k++] = a1[i++];
        }
        
        while (j < size2) {
            a[k++] = a2[j++];
        }
    }

    static void mergeSort(int[] a, int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;
            mergeSort(a, low, mid);
            mergeSort(a, mid + 1, high);
            merge(a, low, high, mid);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int[] a = new int[] {2, 1, 4, 5, 3};
        int n = a.length;
        mergeSort(a, 0, n - 1); // ar, low, high
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
