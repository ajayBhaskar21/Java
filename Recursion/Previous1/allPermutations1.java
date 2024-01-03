/*
 * nums = [1, 2, 3]
 * output:
 * [[1, 2, 3], [1, 3, 2], [2, 1, 3], [2, 3, 1], [3, 1, 2], [3, 2, 1]]
 * Note: Can be in any order.
 */

import java.util.ArrayList;

public class allPermutations1 {


    static void f(ArrayList<Integer> ds, int[] map, int n, int[] a){

        if (ds.size() == n){
            System.out.println(ds);
            return ;
        }
        for (int i = 0; i < n; i++){
            if (map[i] == 0){
                ds.add(a[i]);
                map[i] = 1;
                f(ds, map, n, a);

                ds.remove(ds.size() - 1);
                map[i] = 0;
                
            }
        }


        
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        int n = 3;

        int[] map = new int[n];

        ArrayList<Integer> ds = new ArrayList<>();
        //for (int i = 0; i < n; i++){
        f(ds, map, n, nums);
        
        

    }
}
