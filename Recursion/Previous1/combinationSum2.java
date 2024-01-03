
/*
 * candidate = [10, 1, 2, 7, 6, 1, 5], target = 8
 * output:
 * [
 * [1, 1, 6],
 * [1, 2, 5],
 * [1, 7],
 * [2, 6]
 * ]
 * 
 * -> One element can be picked only once
 * Note: The solution set must not contain duplicate combinations
 */


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class combinationSum2 {


    static void subsum(int ind, int target, int[] a, int n, ArrayList<Integer> ds, 
    ArrayList<ArrayList<Integer>> sol){
        
        if (ind == n){
            if (target == 0) {
                
                sol.add(new ArrayList<>(ds));
                return;
            }
            return ;
        }
        
        if (a[ind] <= target){
            ds.add(a[ind]);
            subsum(ind + 1, target - a[ind], a, n, ds, sol);
            ds.remove(ds.size() - 1);

        }
        subsum(ind + 1, target, a, n, ds, sol);

    }
    
    public static void main(String[] args) {
        

        int[] a = {10, 1, 2, 7, 6, 1, 5}; 
        int n = a.length;
        int target = 8;
        Arrays.sort(a);
        HashSet<ArrayList<Integer> > set = new HashSet<ArrayList<Integer>>();
        
        ArrayList<Integer> ds = new ArrayList<>();
        ArrayList< ArrayList<Integer>> sol = new ArrayList<ArrayList<Integer>>();

        subsum(0, target, a, n, ds, sol);

        System.out.println(sol);

        LinkedHashSet< ArrayList<Integer>> solf = new LinkedHashSet<>(sol);

        System.out.println(solf);

        
    }
}
