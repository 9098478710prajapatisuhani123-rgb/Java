/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atmsystem;
/**
 *
 * @author suhani
 */
import java.util.Scanner;
public class SimpleATMSystem {
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        String name=" ";
        double balance=400,amount=0.0;
        int pin=0;
        // TODO code application logic here
        Scanner s=new Scanner(System.in);
        System.out.println("Welcome to ATM System");
        int choice=0;
        System.out.println("1.Check Balance");
        System.out.println("2.Deposit");
        System.out.println("3.Withdraw");
        System.out.println("4.Exit");
        
        do{
            System.out.println("Enter your choice: ");
            choice=s.nextInt();
        if(choice==1){
             System.out.println(balance);
        }
         else if(choice==2){
               System.out.println("Enter Deposit Money: ");
               amount=s.nextDouble();
               balance+=amount;
               System.out.println("Total amount"+balance);
              }
        else if(choice==3){ 
              System.out.println("Enter Withdrawal Money: ");
              amount=s.nextDouble();
              if(amount<=balance){
                  System.out.println("Withdrawal Successful");
              balance-=amount;
              System.out.println("Remaining Balance"+balance);
              }
              else
                  System.out.println("Withdrawal Failed! Available balance is "+balance+" Rupees");
              }
        else if(choice==4)
          {
              System.out.println("Thank You!");
          }
    }while(choice!=4);
}
}
    

 
