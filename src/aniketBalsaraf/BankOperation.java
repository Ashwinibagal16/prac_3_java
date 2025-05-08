package aniketBalsaraf;

class BankOperation{
	
	int initBalance ;
	
	
	void initBalance(int balance){
		initBalance = balance;
		System.out.println("Initial balance is " + initBalance);
	}
	
	void creditAmt(int credit ){
		initBalance += credit;
		System.out.println(credit + " has been credited");	
	}
	
	void debitAmt(int debit){
		if(initBalance>debit){
			initBalance = initBalance - debit;
			System.out.println(debit + " has beedn debited ");
		}else{
			System.out.println("InSufficient balance, your ask is " + debit +" rs but you only have " + initBalance +" rs.");
		}
	}
	
	void display(){
		System.out.println("The current balance is : " + initBalance);
	}
	
	public static void main(String[] args){
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