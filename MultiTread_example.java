import java.util.*;

public class MultiTread_example extends Thread {

    String task;

     MultiTread_example(String task){
         this.task = task;
     }

    @Override
    public void run(){
    ArrayList<String> st = new ArrayList<>();
    // st.add("Go iN room");
    // st.add("chaddi khola");
    // st.add("lauda kada");
    // st.add("vasilin lava");
    // st.add("haduch kani madhe taka");
    // st.add("mg hadu hadu mage pude kara");
    // st.add("hadu hadu speed vadva ");
    // st.add("ball daba chapa chapa vajada");
    // st.add("aani tondat devun chik padun dya");


       for(int i=0;i<5;i++){
        try{
            Thread.sleep(1500);
        }catch(Exception e){
         e.printStackTrace();
        }
        System.err.println(this.task+" "+i);
       }

    
    }
    public static void main(String[] args) {
        MultiTread_example m =new  MultiTread_example("have you Passes 3rd year Examm..?");
        MultiTread_example mt =new  MultiTread_example("get admision in last year..?");
        MultiTread_example mt1 =new  MultiTread_example("pass out..?");
        Thread t =new Thread(m);
        Thread t1 =new Thread(mt);
        Thread t2 =new Thread(mt1);
        t.start();
        t1.start();
        t2.start();

        int count = Thread.activeCount();
        System.out.println("No.of Active Thread:-"+count);
        
    }
}
