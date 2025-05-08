package pratikWaghmare;

class Bank{

	int balance = 1000;
	int debitCount, creditCount, printStatementCount;
	
	void debitAmt(){
		balance = balance - 200;
		debitCount += 1;
	}
	
	void creditAmt(){
		balance = balance + 400;
		creditCount += 1;
	}
	
	void printStatement(){
		System.out.println("Remaining balance is " + balance);
		printStatementCount += 1;
	}
	
	void printCountInfo(){
		System.out.println("Debit method call count is  " + debitCount);
		System.out.println("Credit method call count is  " + creditCount);
		System.out.println("Print Statement method call count is  " + printStatementCount);
	}
	
	public static void main(String a[]){
		Bank bank = new Bank();
		bank.debitAmt();
		bank.creditAmt();
		bank.creditAmt();
		bank.creditAmt();
		bank.printStatement();
		bank.printCountInfo();
	}

}