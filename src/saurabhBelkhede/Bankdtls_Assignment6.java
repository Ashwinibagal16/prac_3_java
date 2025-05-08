package saurabhBelkhede;
class Bankdtls {

	static int totalDebitCount;
	static int totalCreditCount;
	static int totalprintStatementCount;
	int debitCount;
	int creditCount;
	int printStatementCount;
	
	void debitAmt() {
		debitCount = debitCount + 1;
		totalDebitCount++;
	}
	
	void creditAmount(){
		creditCount = creditCount + 1;
		totalCreditCount++;
	}
	
	void printStatement() {
		printStatementCount = printStatementCount + 1;
		totalprintStatementCount++;
	}
	
	void printCountInfo (){
		System.out.println("debit method call count: " +debitCount);
		System.out.println("credit method call count : " +creditCount);
		System.out.println("print statment method call count: " +printStatementCount);
	}
	
	static void printAllCountInfo (){
		System.out.println("debit method call count: " + totalDebitCount);
		System.out.println("credit method call count: " + totalCreditCount);
		System.out.println("printstatment method call count: " + totalprintStatementCount);
	}
		
	public static void main(String[] args) {
		Bankdtls bankdtl=new Bankdtls();
		bankdtl.debitAmt();
		bankdtl.creditAmount();
		bankdtl.creditAmount();
		bankdtl.creditAmount();
		bankdtl.printStatement();
		bankdtl.printCountInfo();
		System.out.println();
		Bankdtls bankdtls=new Bankdtls();
		bankdtls.creditAmount();
		bankdtls.printStatement();
		bankdtls.printStatement();
		bankdtls.printStatement();
		bankdtls.printCountInfo();
		System.out.println();
		Bankdtls.printAllCountInfo();
	}
}
	