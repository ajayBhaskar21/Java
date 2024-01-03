// Hash Map in Java
import java.util.*;
public class Map {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(100,"Amit");
        map.put(101,"Vijay");  
        map.put(102,"Rahul");  

        System.out.println(map);

        for (HashMap.Entry m: map.entrySet()) {
            System.out.println(m.getKey()+" "+m.getValue());

        }
        System.out.println();

        HashMap<String,Integer> m2 = new HashMap<String, Integer>();
        m2.put("Aman", 19);  
        m2.put("Sunny", 29);  
        m2.put("Ritesh", 39);  
        System.out.println(m2.get(new Key("Aman")));
        
    }
}
