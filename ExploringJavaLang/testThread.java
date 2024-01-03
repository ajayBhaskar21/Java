
import java.lang.Thread;



class t1 extends Thread{

    Thread thread1;

    t1 () {
        thread1 = new Thread("wow1");
        
    }
    public void run() {
        while(true) {
            System.out.println("1 running");
            try {
                thread1.sleep(1000);
            } catch (InterruptedException e) {
                // TODO: handle exception
                System.out.println("interrupted exception caused!!");
            }

        }
            
/*            
        
    */
    }
}


public class testThread {
    public static void main(String[] args) {
        

        

        System.out.println("starts");

        Thread t2 = new Thread(new Runnable() {
            public void run() {
                while (true) {
                    System.out.println("t2 thread running");
                    
                    try {
                        wait();
                        Thread.sleep(1000);

                    }catch(InterruptedException e) {
                        System.out.println("t2 caused interruption");
                    }   
                    notify();

                }
                
            }
        });
        Thread t3 = new Thread(new Runnable() {
            public void run() {
                while (true) {
                    System.out.println("t3 thread running");
                    
                    try {
                        
                        Thread.sleep(1000);

                    }catch(InterruptedException e) {
                        System.out.println("t3 caused interruption");
                    }
                    

                }
                
            }
        });

        t2.start();
        try {
            Thread.currentThread().sleep(1000);
        } catch (Exception e) {
            // TODO: handle exception
        }
        t3.start();

       

    }


}
