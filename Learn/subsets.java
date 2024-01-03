import java.util.ArrayList;

public class subsets {



    static void f(int ind, int[] a, int n, ArrayList<Integer> subset){

        if (ind >= n){
            System.out.println(subset);
            return ;
        }

        subset.add(a[ind]);
        // pick
        f(ind + 1, a, n, subset);
        // not pick
        subset.remove(ind);
        f(ind + 1, a, n, subset);
    
    }
    public static void main(String[] args) {
        

        int[] a = {3, 1, 2};
        int n = 3;
        ArrayList<Integer> subsets = new ArrayList<>();

        f(0, a, n, subsets);
    }    
}
