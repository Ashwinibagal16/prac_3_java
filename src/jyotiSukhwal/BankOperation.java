package jyotiSukhwal;

class BankOperation{
	int initBalance;
	
	void initBalance(int amt){
		initBalance = amt ;
		System.out.println("Balance has been initialized with " + amt + " rs.");
	}	
	
	void creditAmt(int amt){
		initBalance = initBalance + amt ;
		System.out.println(amt + " rs has been credited.");
	}

	void debitAmt(int amt){
		if (amt <= initBalance){
			initBalance = initBalance - amt ;
			System.out.println(amt + " rs has been debited.");
			}
		else{
			System.out.println("In Sufficient balance, your ask is " + amt + " rs but you only have " + initBalance + " rs.");
			}
	}
	
	void display(){	
		System.out.println("Your Current balance is : " + initBalance + " rs. ");
		}
		
	public static void main(String[] args){
		BankOperation bankOperation= new BankOperation();
		bankOperation.initBalance(5000);
		bankOperation.creditAmt(2000);
		bankOperation.creditAmt(500);
		bankOperation.debitAmt(9500);
		bankOperation.creditAmt(1500);
		bankOperation.debitAmt(6000);
		bankOperation.display();
	}
}