
class Notifying{
    private boolean isSignal = false;
   
    public synchronized void signal(){
        isSignal = true;
         System.out.println("producer: sending signal.....");   
        notify();
    }
    public synchronized void signalNotify(){
        while(!isSignal){
            try {
                System.out.println("consumer: getting the signal...........");
                wait();
            } catch (Exception e) {
            }
        }
            System.out.println("consumer: got the signal! \nProducing....");
    }

}
      
public class Wait_Notify {
    public static void main(String[] args) {
        Notifying n = new Notifying();
        Thread consumer = new Thread(()->{
         n.signalNotify();
        });
        Thread produer = new Thread(()->{
         try {
               Thread.sleep(3000);
          } catch (Exception e) {
          }
          n.signal();
        });
        consumer.start();
        produer.start();
        
    }
}
