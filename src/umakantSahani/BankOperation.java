package umakantSahani;

//Assignment 8
class BankOperation{
	
	int balance ;
	
	void initBalance(int amount){
		balance=amount;
		System.out.println("Balance has been initialized with " + amount + " rs.");
	}
	
	void creditAmount(int amount){
		balance+=amount;
		System.out.println(amount + "  rs has been credited.");
	}
	
	void debitAmount(int amount){
		if(balance >= amount){
			balance-=amount;
			System.out.println(amount + " rs has been debited.");
		}
		else{
			System.out.println("In Sufficient balance, your ask is " + amount + " rs but you only have " + balance +" rs.");
		}
	}
	
	void display(){
		System.out.println("Your current balance is " + balance + " rs.");
		
	}
	
	public static void main(String[] args){
		BankOperation bankOperation = new BankOperation();
		bankOperation.initBalance(5000);
		bankOperation.creditAmount(2000);
		bankOperation.creditAmount(500);
		bankOperation.debitAmount(9500);
		bankOperation.creditAmount(1500);
		bankOperation.debitAmount(6000);
		bankOperation.display();
	}
}