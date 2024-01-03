import java.util.ArrayList;

public class onlyOneSubseqSum {

    static boolean printS(int ind, ArrayList<Integer> ds, int s, int sum, int[] a, int n) {

        if (ind == n) {
            if (s == sum) {
                System.out.println(ds);
                return true;
            }

            return false;
        }

        // pick
        ds.add(a[ind]);
        s += a[ind];
        if (printS(ind + 1, ds, s, sum, a, n) == true) {
            return true;
        }

        s -= a[ind];
        ds.remove(ds.size() - 1);
        if(printS(ind + 1, ds, s, sum, a, n) == true){
            return true;
        }
        return false;
    }


    public static void main(String[] args) {
        int n = 3;
        int[] a = { 1, 2, 1 };
        int sum = 2;
        ArrayList<Integer> ds = new ArrayList<Integer>();

        printS(0, ds, 0, sum, a, n);
    }
    
}
