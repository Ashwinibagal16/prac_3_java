package nitinSharma;
class BankOperation{
	int balance;
	
	void initBalance(int amt){
		balance = amt;
		System.out.println("Your amount has been initialized with: "+ amt +"rs.");
	}
	
	void creditAmt(){
		int creditCount = 300;
		balance +=creditCount;
		System.out.println(creditCount+ " rs. has been credited.");
	}
	
	void debitAmt(){
		int debitCount = 500;
		balance -= debitCount;
		System.out.println(debitCount+ " rs. has been debited.");
	}
	
	void display(){
		System.out.println("Your current balance is: "+ balance);
	}
	
	public static void main(String[] args){
		BankOperation bankOperation = new BankOperation();
		bankOperation.initBalance(5000);
		bankOperation.creditAmt();
		bankOperation.creditAmt();
		bankOperation.debitAmt();
		bankOperation.creditAmt();
		bankOperation.debitAmt();
		System.out.println("--------------------------");
		bankOperation.display();
	}
}