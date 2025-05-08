//Assignment 7
package jeetHingrajiya;
class BankOperation{
	int amount;
	
	void initialBalance(int balance){
		amount = amount + balance;
		System.out.println("Balance has been Initialized with " +amount+" rs.");
	}
	
	void creditAmt(int cAmt){
		amount = amount + cAmt;
		System.out.println( cAmt +" Rs has been Credited.");
	}
	
	void debitAmt(int dAmt){
		if(amount>=dAmt){
			amount = amount - dAmt;
			System.out.println( dAmt +" Rs has been Debited.");
		}
		else{
			System.out.println( "In sufficient balance, your ask is " +dAmt+ "rs but you only have " +amount+ "Rs. ");
		}
	}
	
	void display(){
		System.out.println("Your current balance is " +amount+ "Rs.");
	}
	
	public static void main(String [] args){
		BankOperation bankoperation = new BankOperation();
		bankoperation.initialBalance(5000);
		bankoperation.creditAmt(2000);
		bankoperation.creditAmt(500);
		bankoperation.debitAmt(9500);
		bankoperation.creditAmt(1500);
		bankoperation.debitAmt(6000);
		bankoperation.display();
	}
}