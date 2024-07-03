public class Thread_join implements Runnable{

    @Override
    public void run() {
        System.out.println("thread1 is start");
        for(int i=0;i<3;i++){
            System.out.println("ITERATION:-"+i);
        }
        System.out.println("thread1 is ended");
    }
    
}
