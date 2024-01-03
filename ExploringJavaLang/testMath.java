

import java.lang.Math;
import java.lang.*;


public class testMath {


    static void p(int a) {System.out.println(a);}

    static void p(float a) {System.out.println(a);}

    static void p(double a) {System.out.println(a);}

    
    public static void main(String[] args) {
        
        p(Math.floorDiv(5,2));

        p(Math.floor(5.66));
        
        p(Math.floor(4.9f));

        p(Math.floorMod(5,2));

        p(Math.nextUp(55));
        


    }
}
