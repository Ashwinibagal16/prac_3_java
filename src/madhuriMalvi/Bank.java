
package madhuriMalvi;
class Bank{
	int balance=1000;
	int debitAmt=500;
	int creditAmt=200;
	
	void debitAmt(){
		balance = balance-debitAmt;
	}
	void creditAmt(){
		balance = balance+creditAmt;
	}
	void printBalance(){
		System.out.println("Remaining Balance is " + balance);
	}
	public static void main(String[] args){
		Bank bank = new Bank();
		bank.debitAmt(); //500
		bank.creditAmt(); // 700
		bank.creditAmt(); //900
		bank.printBalance(); // 900
		bank.creditAmt(); // 1100
		bank.printBalance(); //1100
		bank.debitAmt(); //600
		bank.printBalance(); //600
	}
		
	
}