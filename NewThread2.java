public class NewThread2 implements Runnable {

    @Override
    public void run() {
       for(int i=0;i<5;i++){
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Second Thread is Running"+i);
       }
       System.out.println("Secontd Thread stopped");
    }
    
}
