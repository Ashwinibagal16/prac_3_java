package snehalShinde;

class BankDetailsStaticVar{

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
		creditCount = creditCount + 1;
		totalCreditCount = totalCreditCount +1;
	}
	
	void printStatement(){
		printStatementCount = printStatementCount + 1;
		totalPrintStatementCount = totalPrintStatementCount +1;
	}
	
	void printCountInfo(){
		System.out.println("Debit call count is : " + debitCount);
		System.out.println("Credit call count is : " + creditCount);
		System.out.println("Print Statement call count is : " + printStatementCount);
		System.out.println("-------------------------------");
	}
	
	void printAllCountInfo(){
		System.out.println("Total Debit operations : " + totalDebitCount);
		System.out.println("Total Credit operations : " + totalCreditCount);
		System.out.println("Total Print Statement operations : " + totalPrintStatementCount);
		System.out.println("-------------------------------");
	}
	
	public static void main(String[] args){
		BankDetailsStaticVar bankDetailsStaticVar_1 = new BankDetailsStaticVar();
		bankDetailsStaticVar_1.debitAmt();
		bankDetailsStaticVar_1.creditAmt();
		bankDetailsStaticVar_1.creditAmt();
		bankDetailsStaticVar_1.creditAmt();
		bankDetailsStaticVar_1.printStatement();
		bankDetailsStaticVar_1.printCountInfo();
		
		BankDetailsStaticVar bankDetailsStaticVar_2 = new BankDetailsStaticVar();
		bankDetailsStaticVar_2.creditAmt();
		bankDetailsStaticVar_2.printStatement();
		bankDetailsStaticVar_2.printStatement();
		bankDetailsStaticVar_2.printStatement();
		bankDetailsStaticVar_2.printCountInfo();
		bankDetailsStaticVar_2.printAllCountInfo();
	}
}
	