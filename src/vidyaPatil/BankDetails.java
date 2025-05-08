package vidyaPatil;

class BankDetails{
	
	int balance = 20000;
	int debitCount;
	int creditCount;
	int printStatementCount;
	static int totalDebitCount;
	static int totalCreditCount;
	static int totalPrintStatementCount;
	
	void debitAmt(){
		balance = balance - 500;
		debitCount++;
		totalDebitCount++;
	}
	
	void creditAmt(){
		balance = balance + 200;
		creditCount++;
		totalCreditCount++;
	}
	
	void printStatement(){
		//System.out.println("Remaining Account Balance : " + balance);
		printStatementCount++;
		totalPrintStatementCount++;
	}
	
	void printCountInfo(){
		System.out.println("Debit method call count : " + debitCount);
		System.out.println("Credit method call count : " + creditCount);
		System.out.println("Print Statement method call count : " + printStatementCount);
	}
	
	void printAllCountInfo(){
		System.out.println("Total Debit operations : " + totalDebitCount);
		System.out.println("Total Credit operations : " + totalCreditCount);
		System.out.println("Total PrintStatement operations : " + totalPrintStatementCount);
	}
	
	public static void main(String[] args){
		BankDetails bankDetails_1 = new BankDetails();
		bankDetails_1.debitAmt();
		bankDetails_1.creditAmt();
		bankDetails_1.creditAmt();
		bankDetails_1.creditAmt();
		bankDetails_1.printStatement();
		bankDetails_1.printCountInfo();
		
		BankDetails bankDetails_2 = new BankDetails();
		bankDetails_2.printStatement();
		bankDetails_2.creditAmt();
		bankDetails_2.printStatement();
		bankDetails_2.debitAmt();
		bankDetails_2.printStatement();
		bankDetails_2.printCountInfo();
		bankDetails_1.printAllCountInfo();
	}
}