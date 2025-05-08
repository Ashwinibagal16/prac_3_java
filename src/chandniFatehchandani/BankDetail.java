package chandniFatehchandani;

/* Assignment 5 : Create a class called BankDetail and print how many time debit, credit and printstatement method has been called.
Instance variable can be balance = 1000, debitCount, creditCount, printStatementCount.
printCountInfo method should show how many times debit,credit and printStatement method has been called.
from main method calling sequence should be as follows:

debitAmt() -> debitCount = debitCount+1, balance = balance - 200;

creditAmt()
creditAmt()
creditAmt()
printStatement() [this method should print remaining balance]
printCountInfo()

output :

remaining balance is 2000
debit method call count -> 1
credit method call count -> 3
printstatment method call count -> 1

Note : debitAmt deduct 200 rs, creditAmt increase balance by 400 rs */

class BankDetail{
	int balance = 1000;
	int debitCount;
	int creditCount;
	int printStatementCount;
	
	void debitAmt(){
		balance = balance - 200;
		debitCount++;
	}
	
	void creditAmt(){
		balance = balance + 200;
		creditCount++;
	}
	
	void printStatement(){
		System.out.println("Remaining balance is " + balance);
	}
	
	void printCountInfo(){
		System.out.println("Credit Amount was called " + creditCount + " times");
		System.out.println("Debit Amount was called " + debitCount + " times");
	}
	
	public static void main (String[] args){
		BankDetail bd = new BankDetail();
		bd.debitAmt();
		bd.creditAmt();
		bd.creditAmt();
		bd.creditAmt();
		bd.printStatement();
		bd.printCountInfo();
	}
}
