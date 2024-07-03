public class ThreadExample extends Thread{
    @Override
    public void run(){
        for(int i=0;i<50;i++)
        {
            System.out.print(i+ " ");
        }
     }
    public static void main(String[] args) {
        System.out.println("main Thread");
        ThreadExample t1 =new ThreadExample();
        t1.run();
    }
}