//Assignment-8
package pankajMiniyar;
class BankOperations{
	int balance;
	
	void initialBalance(int amt){
		balance=amt;
		System.out.println("Balance has been initialized with " + amt + " rs.");
	}
	
	void creditAmt(int crAmt){
		balance=balance+crAmt;
		System.out.println(crAmt+ " rs has been credited.");
	}
	
	void debitAmt(int dbAmt){
		if(dbAmt<=balance){
			balance=balance-dbAmt;
			System.out.println(dbAmt + " rupees is debited from account");
		}else {
			System.out.println("In Sufficient balance, your ask is "  + dbAmt +" rs but you only have " + balance + " rs.");
		}
	}
	
	void displayBalance(){
		System.out.println("Your current available balance is " + balance);
	}
	
	public static void main(String[] args){
		BankOperations bankOperations=new BankOperations();
		bankOperations.initialBalance(5000);
		bankOperations.creditAmt(2000);
		bankOperations.creditAmt(500);
		bankOperations.debitAmt(9500);
		bankOperations.creditAmt(1500);
		bankOperations.debitAmt(6000);
		bankOperations.displayBalance();
		
	}
}