class Mythread extends Thread{
      public void run(){
        for(int i=0 ;i<10;i++){
            System.out.println(getName()+" is running with priority");
            Thread.yield();
        }
      }
}

public class PriorityThread {
    public static void main(String[] args) {
      Mythread t1 = new Mythread();
      Mythread t2 = new Mythread();
        t1.setName("low priority thread");
        t2.setName("high priority thread");

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();
    }
}
