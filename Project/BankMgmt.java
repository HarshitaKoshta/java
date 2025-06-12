
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

class Transition{
       String type;
       double amount;

    public Transition(String type,double amount) {
         this.type = type;
         this.amount=amount;
    }
    public String toString() {
        return type + ": Rs. " + amount;
    }
}
class Account{
      String name ;
      private int accountNum;
      private double balance;

      public Account(String name,int accountNum1){
          this.name = name;
          this.accountNum = accountNum;
          this.balance = 0;
      }
      ArrayList<Transition> transition= new ArrayList<>() ;

       public void deposit(double amount){
        if(amount>0){
           balance+= amount;
        transition.add(new Transition("Depositee", amount));
         System.out.println("Deposited successfully!");
        }else{
            System.out.println("insufficient amount");
        }
    }

    public void Withdraw(double amount){
        if(amount<balance){
            balance -= amount;
        transition.add(new Transition("Withdraw", amount));
         System.out.println("Withdraw successfully!");
        }else{
            System.out.println("insufficient amount");
        }
    }
    public void TransitionHistory(){
     for(Transition i:transition){
       System.out.println(i);
     }
    }
   public void checkBalance(){
        System.out.println("Your account balance is:"+balance);
    }
    public void TakeLoan(double amount){
        double loan = 0.0;
        if(amount>0){
          loan +=amount;
          System.out.println("Succesfully loan taken:"+loan);
        }  
    }
    public void saveAccount(){
       try {
            File file = new File("bankAcc.txt");
            if(file.createNewFile()){
                System.out.println("file 'bankAcc.txt' created");
            }else{
                System.out.println("already exists");
            }
            FileWriter fw = new FileWriter(file);
            fw.write("Name"+name+"\n");
            fw.write("Balance"+balance+"\n");

            System.out.println("account details saved to file");
        } catch (IOException e) {
            System.out.println("an error occur");
        }        
   }
    public void saveTransition(){
        
    }
    public String getName() {
        return name;
    }
    public int getAccountNumber() {
        return accountNum;
    }
}

public class BankMgmt {
    static Account account;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter account holder name: ");
        String name = sc.nextLine();
        int accNo = new Random().nextInt(10000) + 10000;
        account = new Account(name, accNo);

        System.out.println("Account created successfully. Account Number: " + accNo);
        int choice;
        do{
            System.out.println("\nEnter the choice:\n1. Deposite money\n2. Withdraw Money\n3. Transition history\n4. check balance\n5. Take loan\n6. Exit");
            choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1 : System.out.println("Enter amount to deposite");
                         double d = sc.nextDouble();
                         account.deposit(d);
                         break;
                case 2 : System.out.println("Enter amount to withdraw");
                         double w = sc.nextDouble();
                         account.Withdraw(w);
                         break;
                case 3 : System.out.println("your transition history is"); 
                         account.TransitionHistory();
                         break;
                case 4 : account.checkBalance(); 
                         account.saveAccount();     
                         break;
                case 5 : System.out.println("enter amount to take loan");
                         double t = sc.nextDouble();
                         account.TakeLoan(t);    
                         break;
                case 6 : System.out.println("Exiting.....");break;  
                default:
                  System.out.println("Invalid choice.");       
           } 
        }while (choice!=6);
      }
}
