import java.io.BufferedReader;
import java.io.InputStreamReader;


class first{
    public static void main(String[] args) {
        BufferedReader input = new BufferedReader(
            new InputStreamReader(System.in));
        System.out.print("Enter a num : ");
        int n = Integer.parseInt(input.readLine());
        
        System.out.println(n);
        
    }
}