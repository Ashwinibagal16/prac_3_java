package vidyaPatil;


class BankOperation{
	
	int balance;
	
	void initBalance(){
		balance = 600;
		System.out.println("Balance has been initialized with 600 Rs");
	}
	
	void creditAmt(){
		balance = balance + 300;
		System.out.println("300 Rs has been credited");
	}
	
	void display(){
		System.out.println("Current balance is: " + balance);
	}
	
	void debitAmt(){
		if(balance>=500){
			balance= balance - 500;
			System.out.println("500 Rs has been debited");
		}else{
			System.out.println("In Sufficient balance, your ask is 500 Rs but you only have " + balance + " Rs.");
		}
	}
	
	public static void main(String[] args){
		BankOperation bankOperation = new BankOperation();
		bankOperation.initBalance();
		bankOperation.creditAmt();
		bankOperation.creditAmt();
		bankOperation.debitAmt();
		bankOperation.debitAmt();
		bankOperation.debitAmt();
		bankOperation.creditAmt();
		bankOperation.display();
	}
}