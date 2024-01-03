
import java.lang.Character;

public class testCharacter {

    static void p(char c) {System.out.println(c);}
    static void p(int c) {System.out.println(c);}
    static void p(boolean c) {System.out.println(c);}
    


    public static void main(String[] args) {
        

        // Character c = new Character('a');
        // Above constructor is deprecated.

        Character c = Character.valueOf('a');

        p(Character.MAX_RADIX);

        p(Character.MAX_VALUE);

        p(Character.isDigit('a'));

        p(Character.forDigit(10, 36));

        p(Character.toTitleCase('A'));

        p(Character.toLowerCase('j'));
        
        

    }
    
}
