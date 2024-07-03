public class Joint_method implements Runnable{
    @Override
    public void run(){
        System.out.println("child Thread is Running");
        for(int i=0;i<5;i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("I:- "+i);
        }
        System.out.println("child Thread is ended");
    }

    public static void main(String[] args) {
        NewThread nt= new NewThread();
        Thread t =new Thread(nt,"first thread");
        t.start();

        NewThread nt2 =new NewThread();
        Thread t2 = new Thread(nt2,"second thread");
        t2.start();

        try {
            t.join(1000);
        
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        try {
            t2.join(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("main Thread is ended");
    }
}
