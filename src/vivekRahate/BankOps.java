package vivekRahate;
class BankOps{
	int balance;
	int creditAmt_1 = 2000;
	int creditAmt_2 = 500;
	int debitAmt_1 = 9000;
	
	void initBalance(){
		balance = 5000;
		System.out.println("Balance has been initialized with " + balance + " rs.");
	}
	
	void creditTransaction(){
		balance = balance + creditAmt_1;
		System.out.println(creditAmt_1 + " rs has been credited..");
		balance = balance + creditAmt_2;
		System.out.println(creditAmt_2 + " rs has been credited..");
	}
	
	void debitTransaction(){
		if(balance<debitAmt_1){
			System.out.println("In Sufficient balance, your ask is " + debitAmt_1 + " rs but you only have " + balance + " rs");
		}
		else{
			balance = balance-debitAmt_1;
			System.out.println(debitAmt_1 + " rs has been debited..");
		}
	}
	
	void display(){
		System.out.println("Your current balance is Rs. " + balance);
	}
	
	public static void main(String a[]){
		BankOps bankops = new BankOps();
		bankops.initBalance();
		bankops.creditTransaction();
		bankops.debitTransaction();
		bankops.display();
	}
}