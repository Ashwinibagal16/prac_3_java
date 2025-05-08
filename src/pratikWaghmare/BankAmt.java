package pratikWaghmare;
class BankAmt{
	int balance, credit, debit, iBalance;
	
	void initBalance(){
		balance = 5000;
		System.out.println("Balance has been initialized with " + balance +" rs.");
	}
	void creditAmt(){
		balance = balance + 300;
		System.out.println("300 rs has been credited.");
	}

	void debitAmt(){
		if(balance >= 500){
			balance = balance - 500;
			System.out.println("500 rs has been debited.");
		}	
		else
			System.out.println("Insuffucient balance, your ask is 500 rs but you only have " + balance + " rs");
	}
	
	void display(){
		System.out.println("Your current balance is " + balance);
	}
	
	public static void main(String a[]){
		BankAmt bankAmt = new BankAmt();
		bankAmt.initBalance();
		bankAmt.creditAmt();
		bankAmt.creditAmt();
		bankAmt.debitAmt();
		bankAmt.creditAmt();
		bankAmt.debitAmt();
		bankAmt.display();
	}
}