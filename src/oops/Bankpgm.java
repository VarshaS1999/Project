package oops;

import java.util.Scanner;

interface Bank
{
	public void Accountdetails();
	public void balance();
	public void deposit();
	public void withdraw();
}

class SBI implements Bank
{
    final String Bankname="SBI";
    
    int balance=5000;
    Scanner sc=new Scanner(System.in);
    
 
	@Override
	public void Accountdetails() {
   System.out.println("Enter the account holder name");
    String name=sc.next();
    System.out.println("Account holder name is"+name);
    
    
    System.out.println("Enter account number");
    int accountno=sc.nextInt();
    System.out.println("Account number is"+accountno);
    
    System.out.println("Bank name is"+Bankname);
   
   
   
    

		
	}

	@Override
	public void balance() {
		System.out.println("Balance amount is"+balance);
		
		
	}

	@Override
	public void deposit() {
		System.out.println("Enter money to deposit");
		int deposit=sc.nextInt();
		balance=balance+deposit;
		System.out.println("Balance amount after deposit is "+balance);
		
	}

	@Override
	public void withdraw() {
		System.out.println("Enter amount to withdraw");
		int withdraw=sc.nextInt();
		balance=balance-withdraw;
		if(withdraw>balance) {
			System.out.println("Insufficient balance");
			
		}
		else
		{
			System.out.println("Balance after withdraw is "+balance);
		}
			
		}
	
	
}

public class Bankpgm {

	public static void main(String[] args) {
		SBI ob=new SBI();
		ob.Accountdetails();
		ob.deposit();
		ob.balance();
		ob.withdraw();
		

	}

}
