
import java.util.*;

public class copyContent {
    

    public static void main(String[] args) {
        
        ArrayList<Integer> a = new ArrayList<>();

        a.add(1);
        a.add(25);
        a.add(11);
        ArrayList<Integer> b = new ArrayList<>();
        b.add(29);

        System.out.println(a);
        System.out.println(b);

        a.removeAll(a);
        a.addAll(b);
        b.removeAll(b);

        System.out.println(a);
        System.out.println(b);

    }
}
