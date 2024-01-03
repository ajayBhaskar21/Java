
import java.util.ArrayList;
import java.util.LinkedHashSet;


public class arrayListTolinkedHashSet {


    public static void main(String[] args) {
        
        ArrayList<Integer> a = new ArrayList<>();

        a.add(22);
        a.add(11);
        a.add(66);
        a.add(11);
        a.add(666);
        a.add(666);

        System.out.println(a);

        LinkedHashSet<Integer> lset = new LinkedHashSet<>(a);

        System.out.println(lset);
        

    }
    
}
