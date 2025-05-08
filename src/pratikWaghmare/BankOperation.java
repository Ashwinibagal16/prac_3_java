package pratikWaghmare;
class BankOperation{
	int balance, credit, debit, iBalance;
	
	void creditAmt(int credit){
		balance = balance + credit;
		System.out.println(credit + " rs has been credited.");
	}

	void debitAmt(int debit){
		if(balance >= debit){
			balance = balance - debit;
			System.out.println(debit + " rs has been debited.");
		}	
		else
			System.out.println("Insuffucient balance, your ask is " + debit + " rs but you only have " + balance + " rs");
	}
	
	void display(){
		System.out.println("Your current balance is " + balance);
	}
	
	void initBalance(int iBalance){
		balance = iBalance;
		System.out.println("Balance has been initialized with " + balance +" rs.");
	}

	public static void main(String a[]){
		BankOperation bankOperation = new BankOperation();
		bankOperation.initBalance(5000);
		bankOperation.creditAmt(2000);
		bankOperation.creditAmt(500);
		bankOperation.debitAmt(9500);
		bankOperation.creditAmt(1500);
		bankOperation.debitAmt(6000);
		bankOperation.display();
	}
}