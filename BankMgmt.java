import java.util.Scanner;
class BankAccount{
    String name;
    String accountNumber;
    double balance;

     BankAccount(String name, String accountNumber) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance=0.0;
    }
    void deposit(double amount) {
        if(amount>0){
        balance+=amount;
        System.out.println("deposited:"+amount);
       }else{
         System.out.println("invalid amount");
       }
    }  
    void withdraw(double amount){
      if(amount>0&&amount<=balance){
        balance -= amount;
        System.out.println("Withdraw:"+amount);
      }else{
        System.out.println("invalid or insufficient amount");
      }
    }
    void checkBalance(){
      System.out.println("current balance:"+balance);
    }
    void displayDetails(){
      System.out.println("Account Holder:"+name);
      System.out.println("Account number:"+accountNumber);
    }
}
public class BankMgmt{
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount account = null;
        while(true){
          System.out.println("\n----BANK MENU----");
          System.out.println("1. Create Account");
          System.out.println("2. Deposit money");
          System.out.println("3. Withdraw money");
          System.out.println("4. check balance");
          System.out.println("5. Account detials");
          System.out.println("6. choose an option");
          int choice = sc.nextInt();
          sc.nextLine();

          switch(choice){
            case 1: System.out.println("Enter name:");
            String name = sc.next();
            System.out.println("Enter account number:");
            String accNo = sc.next();
            account = new BankAccount(name, accNo);
            System.out.println("*****Account successfully created!****");
            case 2:
                    if (account != null) {
                        System.out.print("Enter amount to deposit: ");
                        double deposit = sc.nextDouble();
                        account.deposit(deposit);
                    } else {
                        System.out.println("Create an account first.");
                    }
                    break;

            case 3:
                    if (account != null) {
                        System.out.print("Enter amount to withdraw: ");
                        double withdraw = sc.nextDouble();
                        account.withdraw(withdraw);
                    } else {
                        System.out.println("Create an account first.");
                    }
                    break;

            case 4:
                    if (account != null) {
                        account.checkBalance();
                    } else {
                        System.out.println("Create an account first.");
                    }
                    break;

           case 5:
                    if (account != null) {
                        account.displayDetails();
                    } else {
                        System.out.println("Create an account first.");
                    }
                    break;

            case 6:
                    System.out.println("Thank you for using the Bank System!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
