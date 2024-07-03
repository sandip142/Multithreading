public class MultiThreads extends Thread {
    @Override
    public void run(){
      System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        MultiThreads mt = new MultiThreads();
        Thread.currentThread().setName("Umesh");
        mt.run();
        MultiThreads mt1 = new MultiThreads();
        mt1.run();
        MultiThreads mt2 = new MultiThreads();
        mt2.run();
    }
}
