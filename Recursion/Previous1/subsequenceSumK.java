import java.util.*;
class subsequenceSumK {

    static void print(ArrayList<Integer> a){
        for (int i = 0; i < a.size(); i++){
            System.out.print(a.get(i) + " ");
        }
        System.out.println();
    }

    static void f(int[] arr, int n, int i, int sum, int targetSum, ArrayList<Integer> seq){
        if (i >= n){
            return;
        }
        if (sum == targetSum){
            print(seq);
        }
        // pick
        seq.add(arr[i]);
        f(arr, n, i + 1, sum + arr[i], targetSum, seq);
        // not pick
        seq.remove(arr[i]);
        f(arr, n, i + 1, sum, targetSum, seq);

    }


    public static void main(String[] args) {
        
        int[] arr = {1, 2, 1};
        int n = 3;
        int Tsum = 2;

        ArrayList<Integer> seq = new ArrayList<>();

        f(arr, n, 0, 0, Tsum, seq);

    }
}