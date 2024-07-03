public class OnThread_MultiTask extends Thread implements Runnable{
int a=20;
int b=10;

    @Override
    public void run() { 
      Addition();
      Substraction();
      Multiplication();
      child(10,30,40,5);
      Division();
      Modulus();
    }

    // OnThread_MultiTask(){

    // }

    OnThread_MultiTask(int ...k){
          System.out.println("constructor");
    }

    void Addition(){
        System.out.println(" Addition: "+(a+b));
    }
    void Substraction(){
        System.out.println(" Substarction: "+(a-b));
    }

    void Multiplication(){
        System.out.println(" Substarction: "+(a*b));
    
    }
    void Division(){
        System.out.println("Division"+(a/b));
    }

    void Modulus(){
        System.out.println("Division"+(a%b));
    }

    void child(int ...v){
        int ans =0;
        for(int i=0;i<v.length;i++){
           ans+=v[i];  
        }
        System.out.println(ans);
    }
    public static void main(String[] args) {
        System.out.println("main Thread is Running");
        OnThread_MultiTask t =new OnThread_MultiTask(10);
        Thread th =new Thread(t);
        th.start();

        t.child(10,20,30);
    }
}
