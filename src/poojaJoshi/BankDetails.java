package poojaJoshi;

class BankDetails{
	
	int debitCount, creditCount, printStatementCount;
	static int totalDebitCount;
	static int totalCreditCount;
	static int totalPrintStatementCount;
	
	void debit(){
		debitCount = debitCount+1;
		totalDebitCount++;
	}
	
	void creadit(){
		creditCount = creditCount+1;
		totalCreditCount++;
	}
	
	void printStatement(){
		printStatementCount = printStatementCount+1;
		totalPrintStatementCount++;
	}
	
	void printCountInfo(){
		System.out.println("debit method call count -> " +debitCount);
		System.out.println("credit method call count ->" +creditCount);
		System.out.println("printstatment method call count ->" +printStatementCount);	
	}
	
	void printAllCountInfo(){
		System.out.println("total debit Operations -> "+totalDebitCount);
		System.out.println("total credit Operations -> "+totalCreditCount);
		System.out.println("total printstatement Operations -> "+totalPrintStatementCount);	
	}
	
	public static void main(String[] args){
		BankDetails bankdtls =  new BankDetails();
		BankDetails bankdtls1 = new BankDetails();
		bankdtls.debit();
		bankdtls.creadit();
		bankdtls.creadit();
		bankdtls.creadit();
		bankdtls.printStatement();
		bankdtls.printCountInfo();
		System.out.println("\n");
		bankdtls1.creadit();
		bankdtls1.printStatement();
		bankdtls1.printStatement();
		bankdtls1.printStatement();
		bankdtls1.printCountInfo();
		System.out.println("\n");
		bankdtls1.printAllCountInfo();
	}
}