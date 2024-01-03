



import java.util.*;

import javax.swing.plaf.synth.SynthDesktopIconUI;



class string1{

    public static void main(String[] args) {
        char ch[] = {'a', 'j'};
        String s = new String(ch);
        String s1 = new String(s);
        System.out.println(s);
        System.out.println(s1);
        byte ascii[] = {'1', '2', '4'};
        String s11 = new String(ascii);
        System.out.println(s11);
        System.out.println(s11.length());

        String s12 = "four: " + 4;
        System.out.println(s12);

        String s13 = 4 + 4 + ": four";
        System.out.println(s13);



        String s51 = "aBc";
        String s52 = "abc";
        System.out.println("equals() = " + s51.equals(s52));
        System.out.println("EqualsIgnoreCase() = " + s51.equalsIgnoreCase(s52));


        // startsWith() and endsWith()

        System.out.println("startsWith() = " + "ajay".startsWith("aj"));
        System.out.println("endsWith() = " + "jyoshna".endsWith("ja"));
        System.out.println("startsWith() = " + "manasa".startsWith("mana"));


        // difference between equals() and '=='

        String s61 = "kiYoori";
        String s62 = new String(s61);
        System.out.println(s61 + " " + s62);

        System.out.println("'==' = " + (s61 == s62));
        System.out.println("equals() = " + s61.equals(s62));

        s61 = "hi";
        s62 = "hi";
        System.out.println("== " + (s61==s62) + " equals " + s61.equals(s62));

        // indexOf() and lastIndexOf()

        String ss0 = "Where there is a will, there is a way.";
        System.out.println("indexOf() = " + ss0.indexOf("e"));
        System.out.println("lastIndexOf() = " + ss0.lastIndexOf("W"));

        // concat()
        String s31 = "one";
        
        System.out.println(s31.concat(" two"));


        String s32 = "Motuouo".replace("o", "e");
        System.out.println(s32);

        System.out.println("Motuotyo".replaceFirst("o", "e"));

        int op1 = 99;
        String sn1 = "999";
        int nn1 = Integer.valueOf(sn1);
        System.out.println(nn1);

        String result = String.join(" ", "Alpha", "Beta", "Gamma");
        System.out.println(result);

        result = String.join(", ", "John", "Motu", "Patlu");
        System.out.println(result);


        String s33 = "a";
        System.out.println(s33.isEmpty());
        s33 = "";
        System.out.println(s33.isEmpty());

        StringBuffer sb1 = new StringBuffer("Hello");
        System.out.println("buffer = " + sb1);
        System.out.println("length = " + sb1.length());
        System.out.println("capacity = " + sb1.capacity());

        StringBuffer s71 = new StringBuffer("kiyoori");
        

        





    }
}
