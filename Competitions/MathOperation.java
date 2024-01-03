import java.util.*;

class MathOperation{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = "aujqu23n1j66jka";
        char[] ch = s.toCharArray();
        System.out.println(Character.isDigit(ch[0]));
        int sum  = 0;
        int digitCount  = 0;
        for (int i = 0; i < s.length(); i++){
            if (Character.isDigit(ch[i])){
                sum += Character.getNumericValue(ch[i]);
                digitCount++;
            }
        }
        System.out.println(sum + " " + (s.length() - digitCount));
        float a = (float)sum;
        float b = (float)(s.length() - digitCount);
        System.out.println(Math.round(a / b));

    }

}