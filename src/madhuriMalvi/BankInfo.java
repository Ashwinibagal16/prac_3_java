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
total printstatement Operations -> 4*/

package madhuriMalvi;
class BankInfo{
	int balance = 1000;
	int debitCount,creditCount,printStatementCount;
	static int totalDebitCount,totalCreditCount,totalPrintStatementCount;
	
	void debitAmt(){
		balance = balance - 200;
		debitCount = debitCount + 1;
		totalDebitCount++;
	}
	void creditAmt(){
		balance = balance + 400;
		creditCount = creditCount + 1;
		totalCreditCount++;
	
	}
	void printStatement(){
		//System.out.println("Remaining balance is " + balance);
		printStatementCount = printStatementCount + 1;
		totalPrintStatementCount++;
	
	}
	void printCountInfo(){
		System.out.println("debit method call count -> " + debitCount);
        System.out.println("credit method call count -> " + creditCount);
        System.out.println("printstatment method call count -> " + printStatementCount);
	}
	void printAllCountInfo(){
		System.out.println("total debit Operations ->" + totalDebitCount);
        System.out.println("total credit Operations -> " + totalCreditCount);
        System.out.println("total printstatement Operations -> " + totalPrintStatementCount);
	}
	public static void main(String[] args){
		BankInfo bankinfo = new BankInfo();
		bankinfo.debitAmt();
		bankinfo.creditAmt();//1200
		bankinfo.creditAmt();//1600
		bankinfo.creditAmt();//2000
		bankinfo.printStatement();
		bankinfo.printCountInfo();
		
		BankInfo bankinfo_1 = new BankInfo();
	
		bankinfo_1.creditAmt();
		bankinfo_1.printStatement();
		bankinfo_1.printStatement();
		bankinfo_1.printStatement();
		bankinfo_1.printCountInfo();
		
		bankinfo_1.printAllCountInfo();
	}
}