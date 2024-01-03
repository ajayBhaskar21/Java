
import java.lang.Float;
class testFloat {
    public static void main(String[] args) {
        

        // Float ft = new Float("445");
        
        Float ft2 = Float.valueOf("55.99");

        Float ft3 = Float.valueOf(99.8f);


        System.out.println(ft2.equals(55.99f));

        System.out.println(ft3.hashCode());

        System.out.println(Float.toString(99.885f));
    }
}