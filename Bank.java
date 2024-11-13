//set 1
import java.util.*;
abstract class Account{
    String name,actp;
    int acno;
    double balance;
    abstract public void getValues();
    abstract public void deposit(int amt);
    abstract public void withdraw(int amt);
    abstract public void display();
}
class CurrAcct extends Account{
    Scanner in=new Scanner(System.in);
    public void getValues(){
        System.out.println("Enter name,account number and balance");
        name=in.nextLine();
        actp="Current";
        acno=in.nextInt();
        balance=in.nextDouble();
        in.nextLine();
    }
    public void deposit(int amt){
        balance+=amt;
    }    
    public void withdraw(int amt){
        balance-=amt;
    }
    public void display(){
        System.out.println("\n\nName : "+name+"\nAccount Type : "+actp+"\nAccount no : "+acno+"\nBalance : "+balance);
    }
}
class SavAcct extends Account{
    Scanner in=new Scanner(System.in);
    public void getValues(){
        System.out.println("Enter name,account number and balance");
        name=in.nextLine();
        actp="Savings";
        acno=in.nextInt();
        balance=in.nextDouble();
        in.nextLine();
    }
    public void deposit(int amt){
        balance+=amt;
    }    
    public void withdraw(int amt){
        balance-=amt;
    }
    public void display(){
        System.out.println("\n\nName : "+name+"Account Type : "+actp+"Account no : "+acno+"Balance : "+balance);
    }  }
public class Bank{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        Account act=null;
        int amt=0;
        System.out.println("Type of account : \n1.Savings\n2.Current\nEnter your choice : ");
        int ch=in.nextInt();
        in.nextLine();
        if(ch==1){
            act=new SavAcct();
        }
        else if(ch==2){
            act=new CurrAcct();
        }
        else{
            return;
        }
        act.getValues();
        while(true){
            System.out.println("1.deposit\n2.withdraw\n3.display\n4.Exit\nEnter your choice");
            ch=in.nextInt();
            switch(ch){
                case 1: 
                System.out.println("Enter amt :");
                amt=in.nextInt();
                act.deposit(amt); 
                break;
                case 2: 
                System.out.println("Enter amt :");
                amt=in.nextInt();
                act.withdraw(amt); 
                break;
                case 3: act.display(); break;
                case 4: return;

            }        }    } }
