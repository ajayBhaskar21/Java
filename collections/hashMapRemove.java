

import java.util.*;

class hashMapRemove{

    public static void main(String[] args) {
        

        HashMap<String, Integer> m = new HashMap<String, Integer>();

        m.put("David", 22);
        m.put("Tom", 23);
        m.put("Robert", 32);
        m.put("Alice", 21);
        m.put("Sophie", 19);
        m.put("Maria", 24);
        m.put("John", 28);

        int alimit = 25;

        String[] names = new String[m.size()];

        names = m.keySet().toArray(names);
        for (String i : names){
            if (m.get(i) < alimit){
                m.remove(i);
            }
        }
        /*
        for (String i : m.keySet()){
            if (m.get(i) < alimit){
                m.remove(i);
            }
            
        }
        */

        System.out.println(m);

    }
}