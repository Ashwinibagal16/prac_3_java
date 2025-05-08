package pratikWaghmare;
class BankDetail{
	
	int debitCount, creditCount, printStatementCount;
	static int totalDebitCount, totalCreditCount, totalPrintStatementCount;
	
	void debitAmt(){
		debitCount += 1;
		totalDebitCount += 1;
	}
	
	void creditAmt(){
		creditCount += 1;
		totalCreditCount += 1;
	}
	
	void printStatement(){
		printStatementCount += 1;
		totalPrintStatementCount += 1;
	}
	
	void printCountInfo(){
		System.out.println("Debit method call count is  " + debitCount);
		System.out.println("Credit method call count is  " + creditCount);
		System.out.println("Print Statement method call count is  " + printStatementCount);
	}
	
	void printAllCountInfo(){
		System.out.println("Total debit method call count is  " + totalDebitCount);
		System.out.println("Total credit method call count is  " + totalCreditCount);
		System.out.println("Total print statement method call count is  " + totalPrintStatementCount);
	}
	
	public static void main(String a[]){
		BankDetail bankDeatil_1 = new BankDetail();
		bankDeatil_1.debitAmt();
		bankDeatil_1.creditAmt();
		bankDeatil_1.creditAmt();
		bankDeatil_1.creditAmt();
		bankDeatil_1.printStatement();
		bankDeatil_1.printCountInfo();
		
		BankDetail bankDeatil_2 = new BankDetail();
		bankDeatil_2.creditAmt();
		bankDeatil_2.printStatement();
		bankDeatil_2.printStatement();
		bankDeatil_2.printStatement();
		bankDeatil_2.printCountInfo();
		
		bankDeatil_2.printAllCountInfo();
		
	}
}