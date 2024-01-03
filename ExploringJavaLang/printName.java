
public class printName {


    static void show(int times){
        
        if (times > 0)
            System.out.println("hello");
        else
            return ;
        show(times - 1);

    }
    public static void main(String[] args) {
        show(5);
    }    
}
