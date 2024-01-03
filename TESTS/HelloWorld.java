// Online Java Compiler
// Use this editor to write, compile and run your Java code online


class SampleDemo implements Runnable {
    
    private Thread t;
    private String threadName;


    SampleDemo (String t){
        this.threadName = t;
    }

    public void run() {
        while (true) {
            System.out.println(threadName);
            try{
                t.sleep(500);
            }catch(Exception e){

            }
            
        }

    }

    public void start (){
        if (t == null){
            t = new Thread(this, threadName);
            t.start();
        }
    }
    
}

class HelloWorld {
    public static void main(String[] args) {
        SampleDemo A = new SampleDemo("A");
        SampleDemo B = new SampleDemo("B");


        B.start();
        A.start();


    }
}