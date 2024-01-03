import java.util.*;

public class subsequencesSumK {

    static int Sum = 2;
    static int n = 3;

    static void print(ArrayList<Integer> a){
        for (int i = 0; i < a.size(); i++){
            System.out.print(a.get(i));
        }
        System.out.println();
    }

    static void f(int[] arr, int i, ArrayList<Integer> d, int s){

        if (i == n){
            if (s == Sum){
                print(d);
            }
            return ;
        }
        d.add(arr[i]);
        s += arr[i];

        f(arr, i + 1, d, s);
        
        s -= arr[i];
        d.remove(d.size() - 1);
        f(arr, i + 1, d, s);


    }

    public static void main(String[] args) {
    
        int[] arr = { 1, 2, 1 };
        
        

        ArrayList<Integer> seq = new ArrayList<>();

        f(arr, 0, seq, 0);

    }
    
}
