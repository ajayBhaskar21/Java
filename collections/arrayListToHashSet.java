

import java.util.ArrayList;
import java.util.HashSet;

public class arrayListToHashSet {


    public static void main(String[] args) {
        
        ArrayList<Integer> a = new ArrayList<>();

        a.add(22);
        a.add(11);
        a.add(66);
        a.add(11);
        a.add(666);
        a.add(666);
        HashSet<Integer> set = new HashSet<>(a);

        for (Integer i : set){
            System.out.print(i + " ");
        }
        System.out.println();

    }
    
}
