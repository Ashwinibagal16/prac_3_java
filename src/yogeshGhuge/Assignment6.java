package yogeshGhuge;

class Assignment6{

	int debitCount;
	int creditCount;
	int printStatementCount;
	static int totalDebitCount;
	static int totalCreditCount;
	static int totalPrintStatementCount;
	
	void debitAmt(){
		debitCount = debitCount+1;
		totalDebitCount = totalDebitCount+1;
	}
	
	void creditAmt(){
		creditCount = creditCount+1;
		totalCreditCount = totalCreditCount+1;
	}
	
	void printstatement(){
		printStatementCount = printStatementCount+1;
		totalPrintStatementCount = totalPrintStatementCount+1;
	}
	
	void printcountinfo(){
		
		System.out.println("debit method call:" + debitCount);
		System.out.println("credit method call:" + creditCount );
		System.out.println("Printstatement method call:" + printStatementCount);
	}
	
	void printtotalcountinfo(){
		System.out.println("total debit method call : " + totalDebitCount );
		System.out.println("total debit method call : " + totalCreditCount );
		System.out.println("total debit method call : " + totalPrintStatementCount );
		
	}
	
	public static void main(String [] args){
		Assignment6 assign6 = new Assignment6();
		Assignment6 assign7 = new Assignment6();
		assign6.debitAmt();
		assign6.creditAmt();
		assign6.creditAmt();
		assign6.creditAmt();
		assign6.printstatement();
		assign6.printcountinfo();
		
		assign7.printstatement();
		assign7.debitAmt();
		assign7.printstatement();
		assign7.creditAmt();
		assign7.printstatement();
		assign7.printcountinfo();
		assign7.printtotalcountinfo();
		
	}
}
