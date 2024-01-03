

import java.lang.*;

public class testSystem {
    


    public static void main(String[] args) {


        int[] a = {1, 2, 3, 4, 5};
        int[] b = new int[a.length];

        System.arraycopy(a, 0, b, 0, a.length);

        System.out.println(b[2]);


        System.out.println(System.console());

        // System.exit(404);


        long start, end;
/*
        start = System.currentTimeMillis();
        for (int i = 0; i < 1E+8; i ++) ;
        end = System.currentTimeMillis();
        System.out.println("elapsed time : "+ (end - start));
*/

        start = System.nanoTime();
        for (int i = 0; i < 1E+8; i ++) ;
        end = System.nanoTime();
        System.out.println("elapsed time : "+ (end - start));

        


    }

}
