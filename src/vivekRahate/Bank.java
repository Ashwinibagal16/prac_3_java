package vivekRahate;
class Bank{
	int intialBalance = 1000;
	int debitAmount = 500;
	int creditAmount = 200;
	
	
	void debitAmt(){
		intialBalance = intialBalance-debitAmount;
	}
	void creditAmt(){
		intialBalance = intialBalance+creditAmount;
	}
	
	void printBalance(){
		System.out.println("Balance Amount = " + intialBalance);
	}
	
	public static void main(String a[]){
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