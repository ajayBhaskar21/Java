
/*
 * c = [2, 3, 6, 7], target = 7
 * output: [[2, 2, 3], [7]]
 * 
 * 
 * one element can be picked more than once.
 * 
 */


import java.util.ArrayList;

public class combinationSum {

    static void subsum(int ind, int target, int[] a, int n, ArrayList<Integer> ds, ArrayList< ArrayList<Integer>> sol){

        if (target == 0) {
            System.out.println(ds);
            ArrayList<Integer> ans = new ArrayList<>(ds);

            sol.add(ans);
            return;
        }
        if (ind == n){ 
            return ;
        }
        if (target > 0 && (target < a[ind])){
            return ;
        }
        


        // pick
        ds.add(a[ind]);
        target -= a[ind];
        subsum(ind, target, a, n, ds, sol);

        // not pick
        target += ds.get(ds.size() - 1);
        ds.remove(ds.size() - 1);
        subsum(ind + 1, target, a, n, ds, sol);

    }

    public static void main(String[] args) {
        
        int[] a = {2, 3, 6, 7};
        int n = 4;
        int target = 7;
        ArrayList< ArrayList<Integer>> sol = new ArrayList<ArrayList<Integer>>();

        ArrayList<Integer> ds = new ArrayList<Integer>();
        subsum(0, target, a, n, ds, sol);

        System.out.println(sol);

    }
    
}
