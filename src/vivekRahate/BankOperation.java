package vivekRahate;
class BankOperation{
	int balance;
	
	void initBalance(int initBalance){
		balance = initBalance;
		System.out.println("Balance has been initialized with " + balance + " rs.");
	}
	
	void creditAmt(int credit){
		balance = balance + credit;
		System.out.println(credit + " rs has been credited..");
	}
	 
	void debitAmt(int debit){
		if(balance<debit){
			System.out.println("In Sufficient balance, your ask is " + debit + " rs but you only have " + balance + " rs");
		}
		else{
			balance = balance - debit;
			System.out.println(debit + " rs has been debited..");
		}
	}
	
	void display(){
		System.out.println("Your current balance is Rs. " + balance);
	}
	
	public static void main(String a[]){
		BankOperation bankoperation = new BankOperation();
		bankoperation.initBalance(5000);
		bankoperation.creditAmt(2000);
		bankoperation.creditAmt(500);
		bankoperation.debitAmt(9500);
		bankoperation.creditAmt(2000);
		bankoperation.debitAmt(6000);
		bankoperation.display();
	}
	
}