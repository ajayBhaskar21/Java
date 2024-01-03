

public class reverseArr {
    

    static void show(int a[]){

        for (int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();

    }

    static void revArr(int a[], int i, int j){

        
        
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
        i++;
        j--;
        if (i > j)
            return;
        revArr(a, i, j);
    }

    public static void main(String[] args) {
        
        int[] a = {1, 2, 3, 4};
        int n = 4;
        show(a);
        revArr(a, 0, n - 1);
        show(a);
    }
}
