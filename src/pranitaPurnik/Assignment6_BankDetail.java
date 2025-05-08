/* Assignment - 6 : 22nd April'25


Create a class called BankDetail and print how many time debit, credit and printstatement method has been called.

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

 package pranitaPurnik;
 class Assignment6_BankDetail{
	int debitCount;
	int creditCount;
	int printStatementCount;
	static int totalDebitCount;
	static int totalCreditCount;
	static int totalPrintStatementCount;
	
	void debitAmt(){
		debitCount = debitCount+1;
		totalDebitCount	++;		
	}
	
	void creditAmt(){
		creditCount=creditCount+1;
		totalCreditCount++;
	}
	
	void printStatement(){
		printStatementCount=printStatementCount+1;
		totalPrintStatementCount++;
	}
	
	void printCountInfo(){
		System.out.println("Debit count is: "+debitCount);
		System.out.println("Credit count is: "+creditCount);
		System.out.println("Print count is: "+printStatementCount);	
	}
	
	void printAllCountInfo(){
		System.out.println("Total Debit count is: "+totalDebitCount);
		System.out.println("Total Credit count is: "+totalCreditCount);
		System.out.println("Total Print count is: "+totalPrintStatementCount);
	}
	
	public static void main(String[] args){
		Assignment6_BankDetail bankDetail = new Assignment6_BankDetail();
		bankDetail.debitAmt();
		bankDetail.creditAmt();
		bankDetail.creditAmt();
		bankDetail.creditAmt();
		bankDetail.printStatement();
		bankDetail.printCountInfo();
		
		Assignment6_BankDetail bankDetail_1 = new Assignment6_BankDetail();
		bankDetail_1.creditAmt();
		bankDetail_1.printStatement();
		bankDetail_1.printStatement();
		bankDetail_1.printStatement();
		bankDetail_1.printCountInfo();
		
		bankDetail_1.printAllCountInfo();
		
	}
	
 }