/*
Create a call called BankDetail and print how many time debit, credit and printstatement method has been called.

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
total printstatement Operations -> 4
*/
package priyankaZende;
class BankDetailA6{
int balance = 1000;
	int debitCount = 0;
	int	creditCount = 0;
	int printStatementCount = 0;
	
	static int totalDebitCount = 0;
	static int totalCreditCount = 0;
	static int totalPrintStatementCount = 0;
	
	void debitAmt(){
		balance = balance - 200;
		debitCount = debitCount+1;
		totalDebitCount++;
	}

	void creditAmt(){
		balance = balance + 400;
		creditCount = creditCount+1;
		totalCreditCount++;
	}
	
	void printStatement(){
		System.out.println("-----------------");
		System.out.println("Remaining balance is :" + balance);
		System.out.println("-----------------");
		printStatementCount = printStatementCount + 1;
		totalPrintStatementCount++;
	}

	void printCountInfo(){
		System.out.println("-----------------");
		System.out.println("Remaining balance is :" + balance);
		System.out.println("Debit method call count :" + debitCount);
		System.out.println("Credit method call count :" + creditCount);
		System.out.println("Printstatment method call count :" + printStatementCount);
		System.out.println("-----------------");
	}
	
	void printAllCountInfo(){
		System.out.println("-----------------");
		System.out.println("Total Debit method call count :" + totalDebitCount);
		System.out.println("Total Credit method call count :" + totalCreditCount);
		System.out.println("Total Printstatment method call count :" + totalPrintStatementCount);
		System.out.println("-----------------");
	}
	
	public static void main(String[] args){
		BankDetailA6 bankDetailA6_1 = new BankDetailA6();
		bankDetailA6_1.debitAmt();
		bankDetailA6_1.creditAmt();
		bankDetailA6_1.creditAmt();
		bankDetailA6_1.creditAmt();
		bankDetailA6_1.printStatement();
		bankDetailA6_1.printCountInfo();
		bankDetailA6_1.printAllCountInfo();
		
		BankDetailA6 bankDetailA6_2 = new BankDetailA6();
		bankDetailA6_2.creditAmt();
		bankDetailA6_2.printStatement();
		bankDetailA6_2.printStatement();
		bankDetailA6_2.printStatement();
		bankDetailA6_2.printCountInfo();
		bankDetailA6_2.printAllCountInfo();
		
		BankDetailA6 bankDetailA6_3 = new BankDetailA6();
		bankDetailA6_3.debitAmt();
		bankDetailA6_3.creditAmt();
		bankDetailA6_3.creditAmt();
		bankDetailA6_3.creditAmt();
		bankDetailA6_3.creditAmt();
		bankDetailA6_3.printStatement();
		bankDetailA6_3.printStatement();
		bankDetailA6_3.printStatement();
		bankDetailA6_3.printStatement();
		bankDetailA6_3.printCountInfo();
		bankDetailA6_3.printAllCountInfo();
	}
}