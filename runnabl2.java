class MyRunnable implements java.lang.Runnable{
    public void run(){
        System.out.println("thread using Runnable interface");
    }
}


public class runnabl2 {
    public static void main(String[] args) {
        MyRunnable m = new MyRunnable();
        Thread t = new Thread(m);
        t.start();
        try {
            t.join();
        } catch (InterruptedException e) {

        }for(int i=1;i<=5;i++){
            System.out.println(i);
          }
        System.out.println("main thread is running");
    }
}
