package jayaSahu;

class BankDetail1 {

	int debitCount;
	int creditCount;
	int printStatementCount;

	static int totalDebitCount;
	static int totalCreditCount;
	static int totalPrintStatementCount;

	void debitAmt() {
		debitCount++;
		totalDebitCount++;
	}

	void creditAmt() {
		creditCount++;
		totalDebitCount++;
	}

	void printStatement() {
		printStatementCount++;
		totalPrintStatementCount++;

	}

	void printCountInfo() {
		System.out.println("Debit method call count is " + debitCount);
		System.out.println("Credit method call count is " + creditCount);
		System.out.println("Print Statement method call count is " + printStatementCount);
	}

	void printAllCountInfo() {
		System.out.println("Total debit method call count is " + totalDebitCount);
		System.out.println("Total credit method call count is " + totalCreditCount);
		System.out.println("Total Print statement method call count is " + totalPrintStatementCount);
	}


	public static void main(String[] args) {
		BankDetail2 bankDetail_2 = new BankDetail2();
		bankDetail_2.debitAmt();
		bankDetail_2.creditAmt();
		bankDetail_2.creditAmt();
		bankDetail_2.creditAmt();
		bankDetail_2.printStatement();
		bankDetail_2.printCountInfo();

		BankDetail2 bankDetail_3 = new BankDetail2();
		bankDetail_3.creditAmt();
		bankDetail_3.printStatement();
		bankDetail_3.printStatement();
		bankDetail_3.printStatement();
		bankDetail_3.printCountInfo();
		bankDetail_3.printAllCountInfo();
	}

}