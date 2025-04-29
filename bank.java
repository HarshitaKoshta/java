//Create a class BankAccount with fields accountNumber, accountHolder, and balance. Implement
//methods to deposit and withdraw money

class BankAccount{
    int accountNumber;
    String accountHolder;
    int balance = 500;

    void deposite(int n){
        int dep = balance +n;
        System.out.println("balance"+dep);
    }
    void withdraw(int n){
        int wit = balance-n;
        System.out.println("balance"+wit);
    }
}
class bank{
    public static void main(String[] args) {
        BankAccount b = new BankAccount();
        b.deposite(100);
        b.withdraw(0);
    }
}