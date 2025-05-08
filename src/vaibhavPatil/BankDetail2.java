package vaibhavPatil;


class BankDetail2{
	static int balance;
	
	void creditAmt(int credit){
		balance=balance+credit;
		System.out.println(credit + " rs has been credited.");
	}
	
	void debitAmt(int debit){
		if(balance>=debit){
			balance=balance-debit;
			System.out.println(debit + " rs has been debited.");
		}else{
		System.out.println("In Sufficient balance, your ask is " + debit + " rs but you only have " + balance + " rs.");
		}
	}
	
	void display(){
		System.out.println("Your current Balance is " + balance);
	}
	
	void initBalance(int init){
		balance= init;
		System.out.println("Balance has been initialized with " + init + " rs");
	}
	
	public static void main(String[] args){
		BankDetail2 bankDetail2 = new BankDetail2();
		bankDetail2.initBalance(5000);
		bankDetail2.creditAmt(2000);
		bankDetail2.creditAmt(500);
		bankDetail2.debitAmt(9500);
		bankDetail2.creditAmt(1500);
		bankDetail2.debitAmt(6000);
		bankDetail2.display();
	}
	
}