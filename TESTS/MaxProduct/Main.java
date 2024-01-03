import java.util.*;
class Main {



    static int maxPro (int n, int max) {

        if (n == 1) return 0;
        int insideProduct;

        for (int i = 1; i <= n/ 2; i++) {
            int a = i;
            int b = n - i;
            insideProduct = a * b;
            
            if (max < insideProduct) max = insideProduct;
            System.out.println("a and b : " + a + " " + b);
            System.out.println("inside product and max : " + insideProduct + " " + max);
            int x = maxPro(a, max);
            if (max < x) max = x;
            int y = maxPro(b, max);
            if (max < y) max = y;

        }
        return max;

    }


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("enter a num : ");
        int n = in.nextInt();

        System.out.println(maxPro(n, 0));

    }
}