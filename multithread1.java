class MyThread extends Thread{
    public void run(){
        System.out.println("hellllllllllllloooooooooooooooooooooooooooo");
    }
}

public class multithread1 {
    public static void main(String[] args) {
      MyThread t = new MyThread();
      t.start();
      System.out.println("hiiiiiiiiii");
    }
}
