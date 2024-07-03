public class DeadThread  extends Thread {
    static Thread t ;
    @SuppressWarnings("removal")
    @Override
    public void run(){
        System.out.println("Thread is Running");
        t.stop();
        // try{
        //    t.stop();
        // }catch(Exception e){
        //     // e.printStackTrace();
        // }
        System.out.println("Tread Dead");
        
    }
    public static void main(String[] args) {
        DeadThread d =new DeadThread();
        t =new Thread(d);
        t.start();
    }   
}
