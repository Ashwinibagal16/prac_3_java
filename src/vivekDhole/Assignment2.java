package vivekDhole;

class Assignment2 {
	
	int balance = 1000;

	void debitAmt() {
		balance = balance - 500;
	}

	void creditAmt() {
		balance = balance + 200;
	}

	void printBalance() {
		System.out.println("Remaining balance is " + balance);
	}

	public static void main(String[] args) {
		Assignment2 bnk = new Assignment2();
		bnk.debitAmt();
		bnk.creditAmt();
		bnk.creditAmt();
		bnk.printBalance();
		bnk.creditAmt();
		bnk.printBalance();
		bnk.debitAmt();
		bnk.printBalance();
	}
}

