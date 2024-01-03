sealed class test1 permits A, B{

    public void getHello() {
        System.out.println("Hello");
    }


    public void getWorld() {
        System.out.println("World");
    }

}