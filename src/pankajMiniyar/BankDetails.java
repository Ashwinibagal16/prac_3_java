//Assigment-6
package pankajMiniyar;
class BankDetails{
	int debitCount;
	int creditCount;
	int printStatementCount;
	static int totalDebitCount;
	static int totalCreditCount;
	static int totalPrintStatementCount;
	
	void debitAmt(){
		debitCount++;
		totalDebitCount++;
	}
	
	void creditAmt(){
		creditCount++;
		totalCreditCount++;
	}
	
	void printStatement(){
		printStatementCount++;
		totalPrintStatementCount++;
	}
	
	void printCountInfo(){
		System.out.println("Debit method call count--> " + debitCount);
		System.out.println("Credit method call count--> " + creditCount);
		System.out.println("Print Statement method call count--> " + printStatementCount);
		System.out.println(" ");
	}
	
	void printAllCountInfo(){
		System.out.println("Total debit operation--> " + totalDebitCount);
		System.out.println("Total credit operation--> " + totalCreditCount);
		System.out.println("Total print statement operation--> " + totalPrintStatementCount);
	}
	
	public static void main(String[] args){
		BankDetails bankDetails_1=new BankDetails();
		bankDetails_1.debitAmt();
		bankDetails_1.creditAmt();
		bankDetails_1.creditAmt();
		bankDetails_1.creditAmt();
		bankDetails_1.printStatement();
		bankDetails_1.printCountInfo();	
		BankDetails bankDetails_2=new BankDetails();
		bankDetails_2.creditAmt();
		bankDetails_2.printStatement();
		bankDetails_2.printStatement();
		bankDetails_2.printStatement();
		bankDetails_2.printCountInfo();
		bankDetails_1.printAllCountInfo();
	}
}