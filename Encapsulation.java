class ATM{
    private int a;

    public void setMoney(int a){
        this.a = a;
    }
    public int getMoney(){
        return a;
    }
}
class Encapsulation{
    public static void main(String[] args) {
        ATM a =  new ATM();
        a.setMoney(2000);
        System.out.println(a.getMoney());
    }
}