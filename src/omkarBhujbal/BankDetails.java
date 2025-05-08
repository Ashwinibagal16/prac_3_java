package omkarBhujbal;

class BankDetails{
	int balance = 1000;
	int debitAmt;
	int creditAmt;
	int printStatementCount;
	
	void debitAmt(){
		debitAmt = debitAmt + 1 ;
		balance = balance - 200 ;
	}
	
	void creditAmt(){
		balance =balance+400;
		creditAmt = creditAmt + 1 ;
	}
	
	void printStatementCount(){
		System.out.println("Remaining Balance : "+balance);
		printStatementCount = printStatementCount +1 ;
	}
	void printCountInfo(){
		System.out.println("debit method call count "+debitAmt);
		System.out.println("Credit method call count "+creditAmt);
		System.out.println("printstatment  method call count "+printStatementCount);
	}
	
	public static void main(String[] args){
		BankDetails bnk = new BankDetails();
		bnk.creditAmt();
		bnk.creditAmt();
		bnk.creditAmt();
		bnk.printStatementCount();
		bnk.printCountInfo();
	}
}