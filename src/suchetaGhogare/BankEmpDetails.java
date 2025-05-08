package suchetaGhogare;

class BankEmpDetails{

	int bal = 1000;
	int creditTotal;
	int debitTotal;
	int printTotal;
	static int empCreditTotal;
	static int empDebitTotal;
	static int empPrintTotal;

	void creditBal(){
		bal = bal +1000;
		creditTotal++;
		empCreditTotal++;
	}

	void debitBal(){
		bal = bal - 200;
		debitTotal++;
		empDebitTotal++;
	}

	void printBal(){
		System.out.println("Remaining Account Balance is: "+bal);
		printTotal++;
		empPrintTotal++;
	}

	void printCountInfo(){
		System.out.println("Credit call count: " +creditTotal);
		System.out.println("Debit call count: " +debitTotal);
		System.out.println("Print call count: " +printTotal);
	}

	public static void main(String [] args){
		BankEmpDetails bankEmpDetails_1 = new BankEmpDetails();
		System.out.println("Details of User 1 - ");
		bankEmpDetails_1.debitBal();
		bankEmpDetails_1.creditBal();
		bankEmpDetails_1.creditBal();
		bankEmpDetails_1.printBal();
		bankEmpDetails_1.creditBal();
		bankEmpDetails_1.debitBal();
		bankEmpDetails_1.printBal();
		bankEmpDetails_1.printBal();
		bankEmpDetails_1.printCountInfo();
		System.out.println("============================================");

		BankEmpDetails bankEmpDetails_2 = new BankEmpDetails();
		System.out.println("Details of User 2 - ");
		bankEmpDetails_2.printBal();
		bankEmpDetails_2.creditBal();
		bankEmpDetails_2.debitBal();
		bankEmpDetails_2.creditBal();
		bankEmpDetails_2.printBal();
		bankEmpDetails_2.printCountInfo();
		System.out.println("============================================");
		System.out.println("Total count operations of all users - ");
		System.out.println("Total Credit call operations: " +BankEmpDetails.empCreditTotal);
		System.out.println("Total Debit call operations: " +BankEmpDetails.empDebitTotal);
		System.out.println("Total Print call operations: " +BankEmpDetails.empPrintTotal);		
	}
}