
package ooooppp;

import java.util.Scanner;


public class Banking {
    public static void main(String[] args) {
        
       Bankaccount obj1 = new Bankaccount("XYZ","BA0001");
       obj1.showMenu();
    }
    
}
class Bankaccount
{
    int balance;
    int previoustransaction;
    String customername; 
    String customerid;
    Bankaccount(String cname,String cid)
    {
      customername=cname;
      customerid=cid;
    }
    
    void deposit (int amount)
    {
        if (amount !=0)
        {
            balance=balance + amount;
            previoustransaction=amount;
        }
    }
    void withdraw(int amount)
    {
        if (amount !=0)
        {
          balance=balance-amount;
          previoustransaction=amount;
        }
    }
    
    void getPreviousTransaction()
    {
        if(previoustransaction>0)
        {
            System.out.println("Deposited"+previoustransaction);
        }
        else if(previoustransaction<0)
        {
            System.out.println("Withdrawn:" +Math.abs(previoustransaction));
        }
        else{
            System.out.println("NO Transaction occured");
        }
        
    }
    void showMenu()
    {
        char option='\0'; 
        
        Scanner scanner=new Scanner(System.in);
        System.out.println("Welcome"+customername);
        System.out.println("Your id is "+customerid);
        System.out.println("\n");
        System.out.println("A. cheak balance");
        System.out.println("D. Deposit");
        System.out.println("C. withdraw");
        System.out.println("D.previous transaction");
        System.out.println("E. Exit");
        do{
            System.out.println("==================================================");
            System.out.println("Enter an option");
            System.out.println("==================================================");
            option=scanner.next().charAt(0);
            System.out.println("\n");
            
            
            switch(option)
            {
                case 'A':
                    System.out.println("--------------------------------------------");
                    System.out.println("Balance" +balance);
                    System.out.println("--------------------------------------------");
                    System.out.println("\n");
                    break;
                    
                case 'B':
                    System.out.println("---------------------------------------------");
                    System.out.println("Enter an amount to deposite:");
                    System.out.println("---------------------------------------------");
                    int amount=scanner.nextInt();
                    deposit(amount);
                    System.out.println("\n");
                    break;
                    
                case 'C':
                    System.out.println("---------------------------------------------");
                    System.out.println("Enter an amount to withdraw");
                    System.out.println("---------------------------------------------");
                    int amount2=scanner.nextInt();
                    System.out.println("\n");
                    
                    
                case 'D':
                    System.out.println("----------------------------------------------");
                    getPreviousTransaction();
                    System.out.println("----------------------------------------------");
                    System.out.println("\n");
                    break;
                    
                case 'E':
                    System.out.println("***********************************************");
                    break;
                    
                    
                    
                default:
                    System.out.println("Invalid option !!.please enter again");
                    break;
                    
                        
            }
              
        }
        while(option!='E');
        System.out.println("Thanks for using our service");
        
    }
}
