package vivekRahate;
class BankTransactionCount{
	int debitCount;
	int creditCount;
	int printStatementCount;
	static int totalDebitCount;
	static int totalCreditCount;
	static int totalPrintStatementCount;
	
	void debitTrnsaction(){
		debitCount++;
		totalDebitCount++;
	}
	
	void creditTranscation(){
		creditCount++;
		totalCreditCount++;
	}
	
	void printTrnsaction(){
		printStatementCount++;
		totalPrintStatementCount++;
	}
	
	void printCountInfo(){
		System.out.println("Debit method call count = " +  debitCount);
		System.out.println("Credit method call count = " +  creditCount);
		System.out.println("Credit method call count = " +  printStatementCount);	
	}
	
	void printAllCountInfo(){
		System.out.println("Total Debit method call count = " +  totalDebitCount);
		System.out.println("Total Credit method call count = " +  totalCreditCount);
		System.out.println("Total Credit method call count = " +  totalPrintStatementCount);	
	}
	
	public static void main(String a[]){
		BankTransactionCount banktransactioncount_1 = new BankTransactionCount();
		System.out.println("First Object Creation");
		banktransactioncount_1.debitTrnsaction();
		banktransactioncount_1.creditTranscation();
		banktransactioncount_1.creditTranscation();
		banktransactioncount_1.creditTranscation();
		banktransactioncount_1.printTrnsaction();
		banktransactioncount_1.printCountInfo();
		//banktransactioncount_1.printAllCountInfo();
		
		System.out.println("Second Object Creation");
		BankTransactionCount banktransactioncount_2 = new BankTransactionCount();
		banktransactioncount_2.creditTranscation();
		banktransactioncount_2.printTrnsaction();
		banktransactioncount_2.printTrnsaction();
		banktransactioncount_2.printTrnsaction();
		banktransactioncount_2.printCountInfo();
		banktransactioncount_2.printAllCountInfo();
	}
}