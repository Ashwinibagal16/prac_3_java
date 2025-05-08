package anushreePatra;

class BankDetail{
	int debitCount;
	int creditCount;
	int printStatementCount;
	
	static int totalDebitCount;
	static int totalCreditCount;
	static int totalPrintStatementCount;
	
	void debitCountInfo(){
		debitCount = debitCount+1;
	}
	
	void creditCountInfo(){
		creditCount = creditCount+1;
	}
	
	void statementCountInfo(){
		printStatementCount = printStatementCount+1;
	}
		
	void printCountInfo(){
		System.out.println("debit method call count is " + debitCount);		
		System.out.println("credit method call count is " + creditCount);
		System.out.println("printStatement method call count is " + printStatementCount);
	}
	
	void totalDebitCountinfo(){
		totalDebitCount = totalDebitCount+1;
	}
	
	void totalCreditCountinfo(){
		totalCreditCount = totalCreditCount+1;
	}
	
	void totalPrintStatementCountinfo(){
		totalPrintStatementCount = totalPrintStatementCount + 1;
	}
	
	void totalPrintCountInfo(){
		System.out.println("total debit method call count is " + totalDebitCount);		
		System.out.println("total credit method call count is " + totalCreditCount);
		System.out.println("total printStatement method call count is " + totalPrintStatementCount);	
	}
	
	public static void main(String[] args){
		BankDetail bankDetail_1 = new BankDetail();
		bankDetail_1.debitCountInfo();
		bankDetail_1.creditCountInfo();
		bankDetail_1.creditCountInfo();
		bankDetail_1.creditCountInfo();
		bankDetail_1.statementCountInfo();
		bankDetail_1.printCountInfo();
		
		BankDetail bankDetail_2 = new BankDetail();
		bankDetail_2.creditCountInfo();
		bankDetail_2.statementCountInfo();
		bankDetail_2.statementCountInfo();
		bankDetail_2.statementCountInfo();
		bankDetail_2.printCountInfo();
		
		BankDetail bankDetail_3 = new BankDetail();
		bankDetail_3.totalDebitCountinfo();
		bankDetail_3.totalCreditCountinfo();
		bankDetail_3.totalCreditCountinfo();
		bankDetail_3.totalCreditCountinfo();
		bankDetail_3.totalCreditCountinfo();
		bankDetail_3.totalPrintStatementCountinfo();
		bankDetail_3.totalPrintStatementCountinfo();
		bankDetail_3.totalPrintStatementCountinfo();
		bankDetail_3.totalPrintStatementCountinfo();
		bankDetail_3.totalPrintCountInfo();
	}

}
