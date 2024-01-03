import java.io.*;

public class stringTrim {

    public static void main(String[] args) 
        throws IOException
    {
        BufferedReader br = new
            BufferedReader(new InputStreamReader(System.in));
        String str;
        System.out.println("Enter 'stop' to quit.");
        System.out.println("Enter State: ");
        do{
            str = br.readLine();
            
            str = str.trim();
            System.out.println("str = " + str);

        }while(!str.equals("stop"));
        


    }
}
