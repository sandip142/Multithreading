public class Second_thread implements Runnable {

    Thread t2;
    @SuppressWarnings("removal")
    @Override
    public void run() {
       for(int i=0;i<10;i++){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Second Thread "+i);
        if(i==5){
            extracted(); //killing of Thread
        }
       }
    }
    private void extracted() {
        t2.stop();
    }
    
}
