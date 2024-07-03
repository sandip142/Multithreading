public class MyThread implements Runnable {

    @Override
    public void run() {
      for(int i=0;i<=20;i=i+2){
          System.out.println(i+" ");
      }
    }
    public static void main(String[] args) {
        MyThread m = new MyThread();
        Thread t = new Thread(m);
        t.start();

    System.out.println("----------------------------------------");

    m.run();

    } 
}
