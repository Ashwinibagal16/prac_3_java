package jyotiSukhwal;

class BankDetails{
	
	static int totalDebitCount = 0;
	static int totalCreditCount = 0;
	static int totalPrintStatementCount = 0;
	int debitCount;
	int creditCount;
	int printStatementCount;
	
	void debitAmt(){
		debitCount = debitCount+1;
		totalDebitCount = totalDebitCount+1;
	} 

	void creditAmt(){
		creditCount = creditCount + 1;
		totalCreditCount = totalCreditCount + 1;
	}
	
	void printStatement(){
		printStatementCount = printStatementCount + 1;
		totalPrintStatementCount = totalPrintStatementCount + 1;
	}

	void printCountInfo(){
		System.out.println("debit method call count: " + debitCount);
		System.out.println("credit method call count: " + creditCount);
		System.out.println("printstatment method call count: " + printStatementCount + "\n");
	}
	
	static void printAllCountInfo(){
		System.out.println("total debit Operations: " + totalDebitCount);
		System.out.println("total credit Operations: " + totalCreditCount);
		System.out.println("total printstatement Operations: " + totalPrintStatementCount);
	}

	public static void main(String args[]){
		BankDetails bankDetails1 = new BankDetails();
		bankDetails1.debitAmt();
		bankDetails1.creditAmt();
		bankDetails1.creditAmt();
		bankDetails1.creditAmt();
		bankDetails1.printStatement();
		bankDetails1.printCountInfo();
		
		BankDetails bankDetails2 = new BankDetails();
		bankDetails2.creditAmt();
		bankDetails2.printStatement();
		bankDetails2.printStatement();
		bankDetails2.printStatement();
		bankDetails2.printCountInfo();
		
		BankDetails.printAllCountInfo();
	}
	
}