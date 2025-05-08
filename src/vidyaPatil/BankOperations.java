package vidyaPatil;

class BankOperations{
	
	int balance;
	
	void initBalance(int amt){
		balance = amt;
		System.out.println("Balance has been initialized with " + balance + " Rs.");
	}
	
	void creditAmt(int amt){
		balance = balance + amt;
		System.out.println(amt + " Rs has been credited");
	}
	
	void display(){
		System.out.println("Your current balance is: " + balance);
	}
	
	void debitAmt(int amt){
		if(balance >= amt){
			balance = balance - amt;
			System.out.println(amt + " Rs has been debited");
		}else{
			System.out.println("In Sufficient balance, your ask is " + amt 
			+ " Rs but you only have " + balance + " Rs.");
		}
	}
	
	public static void main(String[] args){
		BankOperations bankOperations = new BankOperations();
		bankOperations.initBalance(5000);
		bankOperations.creditAmt(2000);
		bankOperations.creditAmt(500);
		bankOperations.debitAmt(9500);
		bankOperations.creditAmt(1500);
		bankOperations.debitAmt(6000);
		bankOperations.display();
	}
}