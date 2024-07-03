public class Mythread2 extends Thread {
   @Override
    public void run(){
         System.out.println(Thread.currentThread());
    }
    public static void main(String[] args) {
        Mythread2 m = new Mythread2();
        Thread t =new Thread(m,"my thread");
        t.setPriority(2);  // max priority upto 10 digit
      System.out.println("priority"+t.getPriority());
      System.out.println("priority"+t.getName());
      t.start();
    }
}
