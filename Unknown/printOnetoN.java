public class printOnetoN {
    

    static void show(int n){
        if (n > 1)
            show(n - 1);
        
        System.out.println(n);
        
    }
    public static void main(String[] args) {
        int n = 10;
        show(n);
    }
}
