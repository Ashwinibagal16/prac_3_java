package omkarBhujbal;


class BankDetails2{
	int debitCount;
	int creditCount;
	int printStatementCount;
	static int totalDebitCount;
	static int totalCreditCount;
	static int totalPrintStatementCount;
	
	void creditAmt(){
		creditCount = creditCount+1;
		totalCreditCount = totalCreditCount+1;
	}
	
	void debitAmt(){
		debitCount = debitCount +1;
		totalDebitCount = totalDebitCount +1;
	}	
	
	void printStatement(){
		printStatementCount = printStatementCount +1;
		totalPrintStatementCount = totalPrintStatementCount +1;
	}
	
	void printCountInfo(){
		System.out.println("debit method call count -> "+debitCount);
		System.out.println("Credit method call count -> "+creditCount);
		System.out.println("printStatementCount method call count -> "+printStatementCount);
	}
	
	void printAllCountInfo(){
		System.out.println("totalDebitCount method call count  -> " +totalDebitCount);
		System.out.println("totalCreitCount method call count  -> " +totalCreditCount);
		System.out.println("totalStatementCount method call count -> " +totalPrintStatementCount);
	}
	
	public static void main(String[] args){
		BankDetails2 bnk = new BankDetails2();
		bnk.debitAmt();
		bnk.creditAmt();
		bnk.creditAmt();
		bnk.creditAmt();
		bnk.printStatement();
		bnk.printCountInfo();
		 
		BankDetails2 bnk_1 = new BankDetails2();
		bnk_1.creditAmt();
		bnk_1.printStatement();
		bnk_1.printStatement();
		bnk_1.printStatement();
		bnk_1.printCountInfo();

		BankDetails2 bnk_2 = new BankDetails2();
		bnk_2.printAllCountInfo(); 
	

	}	
}