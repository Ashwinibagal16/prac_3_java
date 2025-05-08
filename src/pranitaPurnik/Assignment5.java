/* Assignment - 5 : 22nd April'25


Create a class called BankDetail and print how many time debit, credit and printstatement method has been called.
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

package pranitaPurnik;
class Assignment5_BankDetail{
	int balance=1000;
	int debitCount;
	int creditCount;
	int printStatementCount;
	
	void debitAmt(){
		debitCount = debitCount+1;
		balance = balance - 200;	
	}
	
	void creditAmt(){
		creditCount=creditCount+1;
		balance = balance + 400;	
		
	}
	
	void printStatement(){
		printStatementCount=printStatementCount+1;
		System.out.println("Remaining balance is: "+balance);
	
	}
	
	void printCountInfo(){
		System.out.println("Debit count is: "+debitCount);
		System.out.println("Credit count is: "+creditCount);
		System.out.println("Print count is: "+printStatementCount);
		
	}
	
	public static void main(String[] args){
		Assignment5_BankDetail bankDetail = new Assignment5_BankDetail();
		bankDetail.debitAmt();
		bankDetail.creditAmt();
		bankDetail.creditAmt();
		bankDetail.creditAmt();
		bankDetail.printStatement();
		bankDetail.printCountInfo();	
	}
		
}
