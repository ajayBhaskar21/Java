import java.util.*;


public class subsetSum1 {

    static int prev;

    static void f(int ind, int[] a, int n, int sum, ArrayList<Integer> sol){

        if (ind == n){
            
            return;
        }

        // pick
        sum += a[ind];
        sol.add(sum);
        f(ind + 1, a, n, sum, sol);


        // not pick
        
        f(ind + 1, a, n, sum, sol);

    }

    public static void main(String[] args) {
        int[] a = {5, 2, 1};
        int n = 3;

        ArrayList<Integer> sol = new ArrayList<Integer>();

        f(0, a, n, 0, sol);

    }
    
}
