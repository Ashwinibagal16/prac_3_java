//Assignment 8
package jeetHingrajiya;
class Bank_Operation{
	int balance;
	int cAmt1=2000;
	int cAmt2=500;
	int dAmt=9500;
	
	void initialBalance(){
		balance = 5000;
		System.out.println("Balance has been Initialized with " +balance+" rs.");
	}
	
	void creditAmt(){
		balance = balance + cAmt1;
		System.out.println( cAmt1 +" Rs has been Credited.");
		balance = balance + cAmt2;
		System.out.println( cAmt2 +" Rs has been Credited.");
	}	
	
	void debitAmt(){
		if(balance >= dAmt){
			balance = balance - dAmt;
			System.out.println( dAmt +" Rs has been Debited.");
		}
		else{
			System.out.println( "In sufficient balance, your ask is " +dAmt+ "rs but you only have " +balance+ "Rs. ");
		}
	}
	
	void display(){
		System.out.println("Your current balance is " +balance+ "Rs.");
	}
	
	public static void main(String [] args){
		Bank_Operation bank = new Bank_Operation();
		bank.initialBalance();
		bank.creditAmt();
		bank.debitAmt();
		bank.creditAmt();
		bank.display();
	}
}