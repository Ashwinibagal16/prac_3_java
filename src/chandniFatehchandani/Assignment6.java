package chandniFatehchandani;

/*Create a call called BankDetail and print how many time debit, credit and printstatement method has been called.

Instance variable can be debitCount, creditCount, printStatementCount.
Static variable can be totalDebitCount, totalCreditCount, totalPrintStatementCount.

printCountInfo method should show how many times debit,credit and printStatement method has been called.
printAllCountInfo method should show how many times total debit,credit and printStatement method has been called.

from main method create 2 objects and call debitAmt, creditAmt and printStatement multiple times.

output :
    
debit method call count -> 1
credit method call count -> 3
printstatment method call count -> 1

debit method call count -> 0
credit method call count -> 1
printstatment method call count -> 3

total debit Operations -> 1
total credit Operations -> 4
total printstatement Operations -> 4 */

class Assignment6{
	int balance = 1000;
	int debitCount;
	int creditCount;
	int printStatementCount;
	static int totalDebitCount;
	static int totalCreditCount;
	static int totalPrintStatementCount;
	
	void debitAmt(){
		balance = balance - 200;
		debitCount++;
		totalDebitCount++;
	}
	
	void creditAmt(){
		balance = balance + 200;
		creditCount++;
		totalCreditCount++;
	}
	
	void printStatement(){
		printStatementCount++;
		totalPrintStatementCount++;
	}
	
	void printCountInfo(){
		System.out.println("Credit Amount was called " + creditCount + " times");
		System.out.println("Debit Amount was called " + debitCount + " times");
		System.out.println("Print statement method was called " + printStatementCount + " times");
	}
	
	static void printAllCountInfo(){
		System.out.println("Total Debit Amount was called " + totalDebitCount + " times");
		System.out.println("Total Credit Amount was called " + totalCreditCount + " times");
		System.out.println("Total Print statement method was called " + totalPrintStatementCount + " times");
	}
	
	public static void main (String[] args){
		Assignment6 bd = new Assignment6();
		Assignment6 bd1 = new Assignment6();
		bd.debitAmt();
		bd.creditAmt();
		bd.creditAmt();
		bd.creditAmt();
		bd.printStatement();
		bd.printCountInfo();
		bd1.debitAmt();
		bd1.creditAmt();
		bd1.printStatement();
		bd1.printCountInfo();
		printAllCountInfo();
	}
}