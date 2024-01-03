
import java.util.*;

class linkedHasSet{
    public static void main(String[] args) {
        //System.out.println("hello");
        LinkedHashSet<String> set = new LinkedHashSet<String>();
        set.add("one");
        set.add("two");
        set.add("three");
        set.add("one");

        System.out.println("normally displaying.");
        System.out.println(set);

        Iterator<String> i = set.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
    }
}