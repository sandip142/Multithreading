import java.util.Stack;

public class Thread_priority implements Runnable {

    @Override
    public void run() {
        System.out.println("Current Thread"+Thread.currentThread());
    }
    public static void main(String[] args) {
        Thread_priority tp = new Thread_priority();
        Thread aa = new Thread(tp,"this is my First Thread");
        Thread bb = new Thread(tp,"this is my second Thread");
        Thread cc = new Thread(tp,"this is my third Thread");

        aa.setPriority(2);
        bb.setPriority(5);
        cc.setPriority(4);
        // System.out.println(aa.getPriority());
        // System.out.println(bb.getPriority());
        // System.out.println(cc.getPriority());
        

        aa.start();
        bb.start();
        cc.start();


        Stack<Integer> st  =new Stack<>();

        
    }

}
