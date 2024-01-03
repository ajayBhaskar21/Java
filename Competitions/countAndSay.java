
import java.util.ArrayList;
import java.util.Scanner;
class countAndSay {

    static void print(ArrayList<Integer> a){
        String s = new String();
        for (int i = 0; i < a.size(); i++){
            s += a.get(i);
        }
        System.out.println(s);

    }

    static void countSay(int n, ArrayList<Integer> a){

        int c = 0;
        int val;
        int i;
        int j;
        ArrayList<Integer> sol = new ArrayList<>();

        while (n-- > 0){
            print(a);
            for (i = 0; i < a.size(); ){

                val = a.get(i);
                c++;
                j = i + 1;
                while (j < a.size() && val == a.get(j)){
                    c++;
                    j++;
                }
                sol.add(c);
                sol.add(val);
                i = i + c;
                c = 0;

            }
            a.removeAll(a);
            a.addAll(sol);
            sol.removeAll(sol);

        }

        
    }

    public static void main(String[] args) {

        Scanner in = new Scanner (System.in);

        System.out.println("enter a number: ");
        int n = in.nextInt();

        ArrayList<Integer> a = new ArrayList<>();
        a.add(1);
        countSay(n, a);

    }
}