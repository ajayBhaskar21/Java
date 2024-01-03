
public class printNtoOne {

    static void show(int n){

        if (n > 0)
            System.out.println(n);
        else
            return ;
        show(n - 1);

    }
    
    public static void main(String[] args) {
        int n = 10;
        show(n);
    }
}
