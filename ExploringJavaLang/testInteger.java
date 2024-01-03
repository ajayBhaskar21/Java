import java.lang.*;
import java.lang.Integer;

public class testInteger {
    
    static void p() {
        System.out.println();
    }

    static void p(String str) {
        System.out.println(str);
    }

    static void p(int a) {
        System.out.println(a);
    }

    static void p(float f) {
        System.out.println(f);
    }

    static void p(double d) {
        System.out.println(d);
    }


    public static void main(String[] args) {
        
        p(Integer.MAX_VALUE);
        p(Integer.MIN_VALUE);    
        // p(Integer.TYPE);

        //System.out.println(Short.TYPE);

        // Integer i1 = new Integer(29);

        Integer i1 = Integer.valueOf(85);
        Integer i2 = Integer.valueOf("998");

        p(Integer.numberOfTrailingZeros(100));

        // p(Integer.numberOfLeadingZeros(5));


        p(Integer.toBinaryString(15000000));

        // p(Integer.reverse(2));

        p(Integer.toOctalString(15));
        p(Integer.toHexString(15));
        



    }
}
