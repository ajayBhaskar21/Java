

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;
import java.util.Collection;

class linkedlist1 {

    public static void main(String[] args) {
        
        LinkedList<Integer> l = new LinkedList<Integer>();

        l.add(0, 20);
        l.add(0, null);
        l.add(0,25);
        l.element();

        l.get(2);
        System.out.println(l);


        HashSet<Integer> set = new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(1);
        System.out.println(set);

        
       // ArrayList<Integer> a = new LinkedList<>();

        //LinkedList<Integer> aa = new ArrayList<Integer>();

        


    }
}