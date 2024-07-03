public class Thread_methods implements Runnable {

    @Override
    public void run() {
        System.out.println("First"+Thread.currentThread());
        Thread.yield();
        System.out.println("Second"+Thread.currentThread());
    }

    public static void main(String[] args) {
        Thread_methods t1 = new Thread_methods();
        Thread th =new Thread(t1,"thread1");

        Thread_methods t2 = new Thread_methods();
        Thread th2 =new Thread(t2,"thread2");

        Thread_methods t3 = new Thread_methods();
        Thread th3 =new Thread(t3,"thread3");


        th.setPriority(3);
        th2.setPriority(2);
        th3.setPriority(1);

        th.start();
        th2.start();
        th3.start();

    }
    
}
