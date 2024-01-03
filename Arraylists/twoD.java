
/*
 * 5 x 5 matrix with ones
 * 
 */

import java.util.*;

class twoD{

    public static void main(String[] args) {

        ArrayList< ArrayList<Integer> > a = new ArrayList< ArrayList<Integer>>();
        int n = 5;
        
        ArrayList<Integer> t = new ArrayList<>();
        for (int i = 0; i < n; i++){
            t.clear();
            for (int j = 0; j < n; j++){
                t.add(1);
            }
            a.add(t);
 
        }

        System.out.println(a);

    }
}