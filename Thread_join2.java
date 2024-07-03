public class Thread_join2 implements Runnable {
    @Override
    public void run() {
        System.out.println("thread2 is start");
        for(int i=0;i<4;i++){
            System.out.println("ITERATION:-"+i);
        }
        System.out.println("thread2 is ended");
    }
}
