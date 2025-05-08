package suchetaGhogare;

class BankDetails{

	int bal = 1000;
	int creditTotal;
	int debitTotal;
	int printTotal;

	void creditBal(){
		bal = bal +1000;
		creditTotal = creditTotal + 1;
	}

	void debitBal(){
		bal = bal - 200;
		debitTotal = debitTotal + 1;
	}

	void printBal(){
		System.out.println("Remaining Account Balance is: "+bal);
		printTotal = printTotal + 1;
	}

	void printCountInfo(){
		System.out.println("Credit call count: " +creditTotal);
		System.out.println("Debit call count: " +debitTotal);
		System.out.println("Print call count: " +printTotal);
	}
	
	public static void main(String [] args){
		BankDetails bankDetails = new BankDetails();
		bankDetails.debitBal();
		bankDetails.creditBal();
		bankDetails.creditBal();
		bankDetails.creditBal();
		bankDetails.debitBal();
		bankDetails.printBal();
		bankDetails.printCountInfo();
	}
}