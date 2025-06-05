class myThread extends Thread{
    int balance = 1000;
    int amt;

    public myThread(int amt) {
        this.amt = amt;
     
    }
    public void run(){
        synchronized (myThread.class) {
            if(balance>=amt){
                System.out.println("money withdrawl:"+amt);
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {    }
                    balance -=amt;
                    System.out.println("remaining :"+balance);
                }else{
                    System.out.println("balance ni h itna");
            }
        }
    }
}

public class threadPrblm {
    public static void main(String[] args) {
        myThread t = new myThread(700);
        myThread t1 = new myThread(400);
        t.start();
        t1.start();
    }
}
