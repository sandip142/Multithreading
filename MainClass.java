public class MainClass {
    public static void main(String[] args) {

        NewThread nt = new NewThread();
        Thread t = new Thread(nt);
        t.start();
      
    
        NewThread2 nt2 = new NewThread2();
        Thread t2 = new Thread(nt2);
        t2.start();

        int j =0;
        while(j<5){
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Main Thread is Running "+j);
            j=j+1;
        }
        System.out.println("main Thread Stopped"); 
        int count = Thread.activeCount();
        System.out.println("No.of Active Thread:-"+count);
        
         //main thread is stopped always last
    }
}
