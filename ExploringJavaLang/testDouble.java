

public class testDouble {
    public static void main(String[] args) {
        
        // Double db1 = new Double(555.7);

        Double db2 = Double.valueOf(44.5);

        System.out.println(db2 == 44.50000);

        double dc = 44.5;
        System.out.println(db2 == dc);

        Double d2 = Double.valueOf(2222E-3);

        System.out.println(1E+5);

        Double d3 = Double.valueOf (0 / 0.);

        System.out.println(d3.isInfinite());
        System.out.println(d3.isNaN());
        


    }    
}
