import java.util.*;
public class t {

    /*Scanner in;
    t(Scanner in){
        this.in = in;
    }*/
    
    public void test(){

        System.out.println("enter data: ");
        Scanner in = new Scanner(System.in);
        //int t = in.nextInt();
        test2();
    }

    public void test2(){
        System.out.println("From test");
    }


    public static void main(String[] args) {
        
        System.out.println("enter : ");
        Scanner in = new Scanner(System.in);
        t obj = new t();
        Random rd = new Random();
        
        System.out.println(rd.nextInt(2));

        //System.out.println(rd.nextInt(5,7));

    }
}
