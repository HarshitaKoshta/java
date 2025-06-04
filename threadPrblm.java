class myThread extends Thread{
    int balance = 1000;
    int amt;

    public myThread(int amt) {
        this.amt = amt;
     
    }
    public void run(){
          if(amt>balance){
       System.out.println("paise ni h itne....hum gareeb h");
    }else{
        System.out.println("money is going to withdrawl:"+amt);
        try {
             Thread.sleep(1000);
        } catch (Exception e) {
        }
       System.out.println("remaining balance:"+(balance-amt));
    }
 }
}

public class threadPrblm {
    public static void main(String[] args) {
        myThread t = new myThread(800);
         myThread t1 = new myThread(400);
         t.start();
         t1.start();
    }
}
