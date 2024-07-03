public class Thread1 implements Runnable {
 Thread t1;
 boolean running =true;
    @SuppressWarnings("removal")
    @Override
    public void run() {
       System.out.println("thread is Running");
       int i=0;
       while(i<10&& running){
        System.out.println("i "+i);
        if(i==5){
          //Thread.currentThread().interrupt();
          //t1.stop();
          running=false;

        }
        i++;
       }
    }

    public static void main(String[] args) {
        Thread1 t = new Thread1();
        Thread k =new Thread(t);
        k.start();



    }
    
}
