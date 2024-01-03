import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class test1 {

    public static void main(String[] args) {
        
        Queue<Integer> q = new LinkedList<Integer>();

        
        q.add(11);
        q.add(20);

        //System.out.println(q);
        int c = 0;
        while (!q.isEmpty()){
            System.out.println(q.remove());
            
            System.out.println("counts = " + c);
            c++;
        }
        
        System.out.println("Done");


    }
    
}
