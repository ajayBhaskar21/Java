
public class printName {

    static void show(int i, int n){
        if (i > n){
            return ;
        }
        System.out.println("Jyoshna");
        show(i + 1, n);
    }
    public static void main(String[] args) {
        
        int n = 5;
        show(1, n);
    }    
}
