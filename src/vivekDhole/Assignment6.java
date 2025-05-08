package vivekDhole;

class Assignment6 {

	int debitCount;
	int creditCount;
	int printStatementCount;
	static int totalDebitCount;
	static int totalCreditCount;
	static int totalPrintStatementCount;

	void debitAmt() {
		debitCount = debitCount + 1;
		totalDebitCount = totalDebitCount + 1;
	
	}

	void creditAmt() {
		creditCount = creditCount + 1;
		totalCreditCount = totalCreditCount + 1;
		
	}

	void printStatement() {
		printStatementCount = printStatementCount + 1;
		totalPrintStatementCount = totalPrintStatementCount + 1;
	}

	void printCountInfo() {
		System.out.println("Count of debit operation is " + debitCount);
		System.out.println("Count of credit operation is " + creditCount);
		System.out.println("Count of printstatment operation is " + printStatementCount);
	}

	void printAllCountInfo() {
		System.out.println("Total count of debit operation is " + totalDebitCount);
		System.out.println("Total count of credit operation is " + totalCreditCount);
		System.out.println("Total count of printstatment operation is " + totalPrintStatementCount);
	}

	public static void main(String[] args) {
		Assignment6 bankdetails27 = new Assignment6();
		Assignment6 bankdetails27_09 = new Assignment6();

        bankdetails27.debitAmt();
		bankdetails27.creditAmt();
		bankdetails27.creditAmt();
		bankdetails27.creditAmt();
		bankdetails27.printStatement();
		bankdetails27.printCountInfo();
		System.out.println("-----------------------------");


		bankdetails27_09.creditAmt();
		bankdetails27_09.printStatement();
		bankdetails27_09.printStatement();
		bankdetails27_09.printStatement();
		bankdetails27_09.printCountInfo();
		System.out.println("-----------------------------");

		// bankdetails27.printAllCountInfo();   ---> We can use this statement too.

		System.out.println("Total count of debit operation is " + Assignment6.totalDebitCount);
		System.out.println("Total count of credit operation is " + Assignment6.totalCreditCount);
		System.out.println("Total count of printstatment operation is " + Assignment6.totalPrintStatementCount);
	}
}