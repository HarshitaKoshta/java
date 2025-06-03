class MyThread extends Thread  {
   
    public void run(){
        System.out.println("hellllllllllllloooooooooooooooooo");
        try {
            Thread.sleep(3000);
        } catch (Exception e) {
        }
        System.out.println("hiiii");
        System.out.println("hiiii");
    }
}

public class MultiThread2 {
    public static void main(String[] args) {
      MyThread t = new MyThread();
      t.start();
    
    }
}


