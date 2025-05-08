package amrutaMarkhedkar;

class BankDetails{
	int debitCnt, creditCnt, printStatementCnt;
	static int totalDebitCount, totalCreditCount,totalPrintStatementCount;
	
	void debitAmt(){
		debitCnt++;
		totalDebitCount++;	
	}
	
	void creditAmt(){
		creditCnt++;
		totalCreditCount++;
	}
	
	void printCountInfo(){
		System.out.println("***************************************");
		System.out.println("debit method call count -> " +debitCnt);
		System.out.println("credit method call count -> "+creditCnt);
		System.out.println("printstatment method call count -> "+printStatementCnt);
	}
	
	void printStatement(){
		printStatementCnt++;
		totalPrintStatementCount++;
	}
	
	void printAllCountInfo(){
		System.out.println("***************************************");
		System.out.println("total debit method call count -> " +totalDebitCount);
		System.out.println("total credit method call count -> "+totalCreditCount);
		System.out.println("total printstatment method call count -> "+totalPrintStatementCount);
	}
	
	public static void main(String []args){
		BankDetails bankDetails_1 = new BankDetails();
		BankDetails bankDetails_2 = new BankDetails();
		bankDetails_1.debitAmt();
		bankDetails_1.creditAmt();
		bankDetails_1.creditAmt();
		bankDetails_1.creditAmt();
		bankDetails_1.printStatement();
		bankDetails_1.printCountInfo();
		
		bankDetails_2.creditAmt();
		bankDetails_2.printStatement();
		bankDetails_2.printStatement();
		bankDetails_2.printStatement();
		bankDetails_1.printCountInfo();
		
		bankDetails_1.printAllCountInfo();		
	}
}