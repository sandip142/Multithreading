public class Main_exam2{
    public static void main(String[] args){
        First_thread f =new First_thread();
        Second_thread s = new Second_thread();
        Thread t =new Thread(f);
        Thread t2 = new Thread(s);
        t.start();
        t2.start();

    }
}