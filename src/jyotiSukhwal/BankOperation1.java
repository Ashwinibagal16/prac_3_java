package jyotiSukhwal;

class BankOperation1{
	
	int balance = 1000;
	
	void creditAmt(){
		balance = balance + 300 ; 
		System.out.println("300 rs are credited to your account and total balance is: " + balance + " rs. ");
	}
	
	void debitAmt(){
		if(balance >= 500){
			balance = balance - 500 ; 
			System.out.println("500 rs are debited from your account and total balance is: "+ balance +" rs. ");
		}
		else{
			System.out.println("Insufficient fund, debit operation is not allowed for amount 500 rs.");
			System.out.println("Remaining balance in your account is " + balance + " rs. ");
		}
	}
	
	public static void main(String[] args){
		BankOperation1 bankOperation1 = new BankOperation1();
		
		bankOperation1.creditAmt();
		bankOperation1.debitAmt();
		bankOperation1.debitAmt();
		bankOperation1.debitAmt();
	}
}
