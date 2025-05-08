package nitinSharma;
class BankDetails{
	int debitCount;
	int creditCount;
	int printStatementCount;
	static int totalDebitCount;
	static int totalCreditCount;
	static int totalPrintStatementCount;
	
	void debitAmt(){
		debitCount = debitCount + 1;
		totalDebitCount = totalDebitCount + 1;
	}
	
	void creditAmt(){
		creditCount =  creditCount + 1;
		totalCreditCount = totalCreditCount + 1;
	}
	
	void printStatement(){
		printStatementCount = printStatementCount + 1;
		totalPrintStatementCount = totalPrintStatementCount + 1;
	}
	
	void printCountInfo(){
		System.out.println("Debit method call count: " + debitCount);
		System.out.println("Credit method call count: " +creditCount );
		System.out.println("Printstatement call count: " + printStatementCount);	
	}
	
	void printCountAllInfo(){
		System.out.println("Total debit operations: "+ totalDebitCount);
		System.out.println("Total credit operations: "+ totalCreditCount);
		System.out.println("Total print operations: "+ totalPrintStatementCount);
	}
	
	public static void main(String[] args){
		BankDetails bankDetails_1 = new BankDetails();
		bankDetails_1.debitAmt();
		bankDetails_1.creditAmt();
		bankDetails_1.creditAmt();
		bankDetails_1.creditAmt();
		bankDetails_1.printStatement();
		bankDetails_1.printCountInfo();
		
		
		BankDetails bankDetails_2 = new BankDetails();
		bankDetails_2.creditAmt();
		bankDetails_2.printStatement();
		bankDetails_2.printStatement();
		bankDetails_2.printStatement();
		bankDetails_2.printCountInfo();
		
		bankDetails_2.printCountAllInfo();
		
	}
}