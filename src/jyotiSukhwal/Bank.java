package jyotiSukhwal;

class Bank{

	int initialBalance = 1000;

	void creditAmt(){
		int balance = 200;
		initialBalance = initialBalance + balance;
	}

	void debitAmt(){
		int balance = 500;
		initialBalance = initialBalance - balance;
	}

	void printBalance(){
		System.out.println("Remaining Balance is: " + initialBalance);
		
	}

	public static void main(String args[]){
		Bank bank= new Bank();
		bank.debitAmt();
		bank.creditAmt();
		bank.creditAmt();
		bank.printBalance();
		bank.creditAmt();
		bank.printBalance();
		bank.debitAmt();
		bank.printBalance();
	}

}