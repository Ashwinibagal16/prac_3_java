package poojaJoshi;

class Bank{

	int balance=1000;
	
	void debitAmount(){
		balance = balance-500;
	}
	
	void creditAmount(){
		balance = balance+200;
	}
	
	void printbalance(){
		System.out.println("Remaining balance is " +balance);
	}
	
	public static void main(String args[]){
		Bank bank = new Bank();
		bank.debitAmount();
		bank.creditAmount();
		bank.creditAmount();
		bank.printbalance();
		bank.creditAmount();
		bank.printbalance();
		bank.debitAmount();
		bank.printbalance();
	}
}