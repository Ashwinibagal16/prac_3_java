package anushreePatra;

class Bank{
	int balance = 1000;
	
	void debitAmt(){
	balance = balance - 500;
 }
 
	void creditAmt(){
	balance = balance + 200;
 }
 
	void printBalance(){
		System.out.println( " Remaning balance is  " + balance );
 }
 
	public static void main(String[] args){
	Bank bank = new Bank();
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