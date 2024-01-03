import java.util.*;
public class treeMap {
    public static void main(String[] args) {
        TreeMap<Integer,String> m1 = new TreeMap<Integer, String>();
        m1.put(100,"Amit");
        m1.put(50,"bot");
        m1.put(101, "vijay");
        //m1.put(101,"zajay");

        System.out.println(m1);

        for(HashMap.Entry m:m1.entrySet()){    
            System.out.println(m.getKey()+" "+m.getValue());    
           } 

    }
}
