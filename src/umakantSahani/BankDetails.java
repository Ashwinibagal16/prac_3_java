package umakantSahani;

class BankDetails{
	int balance = 1000;
	int debitCount = 0;
	int creditCount = 0;
	int printStatementCount = 0;
	static int totalDebitCount = 0;
	static int totalCreditCount = 0;
	static int totalPrintStatementCount = 0;
	
	void creditAmount(){
		creditCount+=1;
		totalCreditCount+=1;
	}
	
	void debitAmount(){
		debitCount+=1;
		totalDebitCount+=1;
	}
	
	void printStatement(){
		printStatementCount+=1;
		totalPrintStatementCount+=1;
	}
	
	void printCountInfo(){
		System.out.println("debitAmount method call count:" + debitCount);
		System.out.println("creditAmount method call count:" + creditCount);
		System.out.println("printStatement method call count:" + printStatementCount);
	}
	
	void printAllCountInfo(){
		System.out.println("total debit Operations:" + totalDebitCount);
		System.out.println("total credit Operations:" + totalCreditCount);
		System.out.println("total printstatement Operations:" + totalPrintStatementCount);
	}
	
	public static void main(String[] args){
		BankDetails bankDetails1 = new BankDetails();
		BankDetails bankDetails2 = new BankDetails();
		bankDetails1.debitAmount();
		bankDetails1.creditAmount();
		bankDetails1.creditAmount();
		bankDetails1.creditAmount();
		bankDetails1.printStatement();
		bankDetails1.printCountInfo();
		bankDetails2.creditAmount();
		bankDetails2.printStatement();
		bankDetails2.printStatement();
		bankDetails2.printStatement();
		bankDetails2.printCountInfo();
		bankDetails2.printAllCountInfo();
	}
	
}