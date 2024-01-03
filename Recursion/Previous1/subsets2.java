
/*
 * nums = [1, 2, 2]
 * output: [[], [1], [1, 2], [1, 2, 2], [2], [2, 2]]
 * 
 * Can be in any order.
 * Note: duplicates not allowed. 
 */

import java.util.ArrayList;
import java.util.HashSet;

class subsets2{


    static void f(int ind, int[] a, HashSet<ArrayList<Integer> > ds, ArrayList<Integer> list){

        if (ind == a.length){
            System.out.println(list);
            ds.add(new ArrayList<>(list));
            return ;
        }

        // pick

        list.add(a[ind]);
        f(ind + 1, a, ds, list);

        // not pick

        list.remove(list.size() - 1);
        f(ind + 1, a, ds, list);

    }

    public static void main(String[] args) {
        
        int[] a = {1, 2, 2};
        int n = 3;

        ArrayList<Integer> list = new ArrayList<>();
        HashSet<ArrayList<Integer> > ds = new HashSet<ArrayList<Integer>>();

        f(0, a, ds, list);
        System.out.println(ds);

    }
}