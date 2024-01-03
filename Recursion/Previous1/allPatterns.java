import java.util.ArrayList;

class allPatterns {

    static int c;
    static void printS(int ind, ArrayList<Integer> ds, int s, int sum, int[] a, int n){
        c++;
        if (ind == n){
            if (s == sum){
                System.out.println(ds);
            }
            return ;
        }
        // pick
        ds.add(a[ind]);
        s += a[ind];
        printS(ind + 1, ds, s, sum, a, n);

        s -= a[ind];
        ds.remove(ds.size() - 1);
        printS(ind + 1, ds, s, sum, a, n);

    }
    public static void main(String[] args) {
        
        int n = 3;
        int[] a = {1, 2, 1};
        int sum = 2;
        ArrayList<Integer> ds = new ArrayList<Integer>();

        printS(0, ds, 0, sum, a, n);

        System.out.println("count = " + c);
    }
}