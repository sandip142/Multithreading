public class Main_joining {
    public static void main(String[] args) throws InterruptedException {
        Thread_join tj1 = new Thread_join();
        Thread t =new Thread(tj1);

        Thread_join2 tj2 = new Thread_join2();
        Thread t2 =new Thread(tj2);

        t.start();
        t.join();
        t2.start();
        t2.join();
    }
}
