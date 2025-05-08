package vivekDhole;

class Assignment5 {

	 int balance = 1000;
	 int debitCount;
     int creditCount;
	 int printStatementCount;

	void debitAmt() {
		debitCount = debitCount + 1;
		balance = balance - 200;
	}

	void creditAmt() {
		creditCount = creditCount + 1;
		balance = balance + 400;
	}

	void printStatement() {
		printStatementCount = printStatementCount + 1;
		System.out.println("Remaining balance is " +balance);
	}

	void printCountInfo() {
		System.out.println("Total count of debit operation is " + debitCount);
		System.out.println("Total count of credit operation is " + creditCount);
		System.out.println("Total count of printstatment operation is " + printStatementCount);
	}

	public static void main(String[] args) {
		Assignment5 bankdetails = new Assignment5();
		bankdetails.debitAmt();
		bankdetails.creditAmt();
		bankdetails.creditAmt();
		bankdetails.creditAmt();
		bankdetails.printStatement();
		bankdetails.printCountInfo();	
	}
}		