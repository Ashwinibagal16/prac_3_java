package jyotiSukhwal;

class BankDetail{
	static int balance = 1000;
	int debitCount;
	int creditCount;
	int printStatementCount;
	
	void debitAmt(){
		balance = balance - 200;
		debitCount = debitCount+1;
	} 

	void creditAmt(){
		balance = balance + 400;
		creditCount = creditCount + 1;
	}
	
	void printStatement(){
		System.out.println("The remaining balance is: " + balance);
		printStatementCount = printStatementCount + 1;
	}

	void printCountInfo(){
		System.out.println("The debitCount is: " + debitCount);
		System.out.println("The creditCount is: " + creditCount);
		System.out.println("The printStatementCount is: " + printStatementCount);
	}

	public static void main(String[] args){
		BankDetail bankDetail = new BankDetail();
		bankDetail.debitAmt();
		bankDetail.creditAmt();
		bankDetail.creditAmt();
		bankDetail.creditAmt();
		bankDetail.printStatement();
		bankDetail.printCountInfo();
	}
	
}