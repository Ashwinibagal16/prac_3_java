package shrutiPundikar;

class BankDetails1{
	int debitCount;
	int creditCount;
	int printStatementCount;
	
	static int totalDebitCount;
	static int totalCreditCount;
	static int totalprintStatementCount;
	
	void debitAmount(){
		debitCount = debitCount + 1;
		totalDebitCount = totalCreditCount + 1;
	}
	
	void creditAmount(){
		creditCount = creditCount + 1;
		totalCreditCount = totalCreditCount + 1;
	}
	
	void printStatement(){
		printStatementCount = printStatementCount + 1;
		totalprintStatementCount = totalprintStatementCount + 1;
	}
	
	void printCountInfo(){
		System.out.println("");
		System.out.println("Debit method call count -> " + debitCount);
		System.out.println("Credit method call count -> " + creditCount);
		System.out.println("Printstatement method call count -> " + printStatementCount);
	}
	
	void printAllCountInfo(){
		System.out.println("");
		System.out.println("Total debit Operations ->" + totalDebitCount);
		System.out.println("Total credit Operations ->" + totalCreditCount);
		System.out.println("Total print statement Operations ->" + totalprintStatementCount);	
	}
	
	public static void main(String[] args){
		BankDetails1 bankdetails1 = new BankDetails1();
		bankdetails1.debitAmount();
		bankdetails1.creditAmount();
		bankdetails1.creditAmount();
		bankdetails1.creditAmount();
		bankdetails1.printStatement();
		bankdetails1.printCountInfo();
		
		BankDetails1 bankdetails1_1 = new BankDetails1();
		bankdetails1_1.creditAmount();
		bankdetails1_1.printStatement();
		bankdetails1_1.printStatement();
		bankdetails1_1.printStatement();
		bankdetails1_1.printCountInfo();
		
		bankdetails1.printAllCountInfo();
	}
}