
class Runnerb implements Runnable {
 
    @Override
    public void run() {
        for(int i=0; i<5; i++) {
            System.out.println("Hello: " + i);
             
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
         
    }
     
}
 
 
public class threadrunnable {
 
     
    public static void main(String[] args) {
        Thread thread1 = new Thread(new Runnerb());
        thread1.start();
    }
 
}