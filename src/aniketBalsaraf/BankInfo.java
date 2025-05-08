package aniketBalsaraf;

class BankInfo{
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
		System.out.println("Debit count is " + debitCount);
		System.out.println("Credit count is " + creditCount);
		System.out.println("PrintStatement count is " + printStatementCount);
		
	}
	
	void printAllCountInfo(){
		System.out.println("Total Debit count is " + totalDebitCount);
		System.out.println("Total Credit count is " + totalCreditCount);
		System.out.println("Total PrintStatement count is " + totalPrintStatementCount);
		
	}
	
	public static void main(String[] args){
		BankInfo bankInfo_1 = new BankInfo();
		BankInfo bankInfo_2 = new BankInfo();
		
		bankInfo_1.debitAmt();
		bankInfo_1.creditAmt();
		bankInfo_1.printStatement();
		bankInfo_2.debitAmt();
		bankInfo_2.creditAmt();
		bankInfo_1.debitAmt();
		bankInfo_1.creditAmt();
		bankInfo_1.printStatement();
		bankInfo_2.printStatement();
		bankInfo_2.debitAmt();
		bankInfo_2.creditAmt();
		bankInfo_1.printCountInfo();
		bankInfo_1.printAllCountInfo();
		
	}
	
}