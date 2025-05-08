abstract class Payment{
    abstract void pay(int a);
    void print(){
       System.out.println("payment done");
    }
}

class UpiPay extends Payment{
    void pay(int a){
        System.out.println("payment via upi:"+a);
    }
}

class Cardpay extends Payment{
    void pay(int a){
        System.out.println("payment via card:"+a);
    }
}
class AbstractClass{
    public static void main(String[] args) {
        Payment p1 = new UpiPay();
        p1.pay(800);
        p1.print();
        Payment p2 = new Cardpay();
        p2.pay(4600);
    }
}