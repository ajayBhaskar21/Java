import java.util.*;

class climbStairs{


    static void f(int sum, int n, ArrayList<Integer> ds){

        if (sum > n){
            
            return ;
        }
        if (sum == n){
            System.out.println(ds);
            return ;
        }

        // pick 1
        ds.add(1);
        f(sum + 1, n, ds);
        
        // not pick 1 and pick 2
        ds.remove(ds.size() - 1);
        ds.add(2);
        f(sum + 2, n, ds);
        ds.remove(ds.size() - 1);
    }

    public static void main(String[] args) {
        int n = 3;
        
        
        ArrayList<Integer> ds = new ArrayList<Integer>();

        f(0, n, ds);

    }
}