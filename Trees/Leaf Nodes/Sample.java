
class Sample {




    protected static void A() {
        System.out.println("in Sample method - A protected");

    }

    public static void B() {
        System.out.println("in Sample mthod - B public");
    }


    void C() {
        System.out.println("in sample method - C");
    }


    /*
     * 
     * Sample.A();
     * 
     * Sample obj = new Sample();
     * obj.C();
     * obj.B();
     * 
     * 
     */

}