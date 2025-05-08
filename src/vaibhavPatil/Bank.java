package vaibhavPatil;

class Bank{
	int balance;
	int initial_balance = 1000;
	
	void debitAmt(){
		balance = initial_balance - 500;
	}
	
	void creditAmt(){
		balance = initial_balance + 200;
	}
	
	void printBalance(){
		System.out.println("Remainaing balanace is "+ balance);
	}
	
	public static void main(String[] args){
		Bank bank = new Bank();
		bank.debitAmt();
		bank.creditAmt();
		bank.printBalance();
		bank.creditAmt();
		bank.printBalance();
		bank.debitAmt();
		bank.printBalance();	
	}
}