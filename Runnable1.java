class MyRunnable implements java.lang.Runnable{
    public void run(){
        System.out.println("thread using Runnable interface");
    }
}

public class Runnable1 {
    public static void main(String[] args) {
        MyRunnable m = new MyRunnable();
        Thread t = new Thread(m);
        t.start();
        System.out.println("main thread is running");
    }
}
