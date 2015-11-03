public class threadconstruct {
 
     
    public static void main(String[] args) {
        Thread thread1 = new Thread(new Runnable() {
 
            @Override
            public void run() {
                for(int i=0; i<5; i++) {
                    System.out.println("Hello: " + i);
                     
                    try {
                        Thread.sleep(100);
                        System.out.println(i+" Done...");
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
                 
            }
             
        });
         
        thread1.start();
    }
 
}