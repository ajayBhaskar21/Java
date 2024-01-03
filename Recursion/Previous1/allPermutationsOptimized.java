
/*
 * nums = [1, 2, 3]
 * output:
 * [[1, 2, 3], [1, 3, 2], [2, 1, 3], [2, 3, 1], [3, 1, 2], [3, 2, 1]]
 * Note: Can be in any order.
 */

 // In this space is optimized.


public class allPermutationsOptimized {

    static void swap(int a, int b, int[] nums){
        int t = nums[a];
        nums[a] = nums[b];
        nums[b] = t;
    }
    
    static void show(int[] a){
        for (int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    static void f(int ind, int[] nums){
        if (ind == nums.length){
            show(nums);
            return ;
        }
        for (int i = ind; i < nums.length; i++){
            swap(ind, i, nums);
            f(ind + 1, nums);
            swap(ind, i, nums);
        }
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3 };
        int n = 3;
        f(0, nums);
    }


}
