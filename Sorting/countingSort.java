
import java.util.*;

class countingSort{


    static int findMax(int[] a){
        int max = 0;
        for (int i = 0; i < a.length; i++){
            if (a[i] > max){
                max = a[i];
            }
        }
        return max;
    }

    static void show(int[] a, int n){
        for (int i = 0; i < n; i++){
            System.out.print(a[i] + " ");
        
        }
        System.out.println();

    }
    public static void main(String[] args) {
        
        int[] a = {2, 2, 1, 4, 3, 2};
        int n = a.length;
        
        int[] c = new int[findMax(a)];

        for (int i = 0; i < c.length; i++){
            c[a[i]] += 1;

        }
        show(c, c.length);
        


    }
}