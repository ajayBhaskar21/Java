import java.lang.Boolean;

import java.lang.*;

public class testBoolean {
    

    static void change(Boolean val) {

        val = false;
        System.out.println("in change : " + val);
        
    }

    public static void main(String[] args) {
        
        Boolean val = Boolean.valueOf(true);
        System.out.println("before: " + val);
        change(val);
        System.out.println("after: " + val);




    }

}
