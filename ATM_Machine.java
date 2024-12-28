import java.util.*;
public class ATM_Machine{
  class Account{
    private String accountNumber;
    private double balance;
  
    public Account(String account_number, double initialbalance){
       accountNumber=account_number;
       balance=initialbalance;
    }
  
    public double getBalance(){
      return balance;
    }
   
    public void deposit(double amount){
      if(amount>0){
        balance=balance+amount;
        System.out.println("Deposit:  Rs."+amount);
      }else{
        System.out.println("Invalid deposit amount");
      }
    }
  
    public boolean withdraw(double amount){
      if(amount>0 && balance>=amount){
        balance=balance-amount;
        System.out.println(" You have withdrawn   :  Rs."+amount);
        return true;
      }else{
        System.out.println("Insufficient balance in your account");
        return false;
      }      
    }
  }

  public class ATM extends Account{
    public ATM(String account_number, double initialbalance){
      super(account_number, initialbalance);    
    }
    public void showMenu(){
      Scanner s=new Scanner(System.in);
      int choice;
      do{
        System.out.println("\n----ATM Menu-----");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit Money");
        System.out.println("3. Withdraw Money");
        System.out.println("4. Exit");
        System.out.println("Enter your choice : ");
        choice=s.nextInt();
  
        switch (choice) {
          case 1:
            checkBalance();
            break;
          case 2:
  depositMoney();
             break;
          case 3:
          withdrawMoney();
            break;
          case 4:
          System.out.println("Thank You for using the ATM...");
            break;
        
          default:
          System.out.println("Invalid choice!  Please try again.. ");
            break;
        }
      }while (choice!=4);  
    }
          public void checkBalance(){
            System.out.println("Your current balance is  :   "+getBalance());
          }
  
          public void depositMoney(){
            Scanner s=new Scanner(System.in);
            System.out.println("Enter amount you want to deposit..");
            double amount=s.nextDouble();
            deposit(amount);
          }
  
          public void withdrawMoney(){
            Scanner s=new Scanner(System.in);
          System.out.println("Enter amount to withdraw  :  ");
          double amount=s.nextDouble();
          withdraw(amount);
          }
  }
 
  public static void main(String[] args) {
      Scanner s=new Scanner(System.in);
  
      System.out.println("Enter your account number :  ");
      String accountNumber=s.nextLine();
      System.out.println("Enter initial deposit : ");
      double initialbalance=s.nextDouble();
  
      ATM_Machine atm_machine=new ATM_Machine();
      ATM atm=atm_machine.new ATM(accountNumber, initialbalance);
      atm.showMenu();
  }
  }



















  

