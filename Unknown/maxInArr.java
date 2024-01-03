import java.util.*;


public class maxInArr {
    

    static int max(int a, int b){
        
        if (a >= b)
            return a;
        return b;
    }
    
    static int maxArr(int[] a, int i, int n){

        
        if (i < n){
             maxArr(a, i + 1, n);
        }

        if (i == n){
            return a[i];
        }


        
        
    }

    public static void main(String[] args) {
        
        int[] a = {3, 2, 1, 5, 4};
        int n = 5;

        maxArr(a, 0, n - 1);


    }    
}
