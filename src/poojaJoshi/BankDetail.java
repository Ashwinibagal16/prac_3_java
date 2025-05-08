package poojaJoshi;

class BankDetail{
	
	static int balance=1000;
	int debitCount;
	int creditCount;
	int printStatementCount;
	
	void debitAmt(){
		debitCount = debitCount +1;
		balance= balance-200;
	}
	
	void creditAmt(){
		creditCount = creditCount +1;
		balance = balance+400;
	}
	
	void printStatement(){
		printStatementCount = printStatementCount+1;
		System.out.println("remaining balance is -> "+balance);
	}
	
	void printCountInfo(){
		System.out.println("debit method call count -> " +debitCount );
		System.out.println("credit method call count -> " +creditCount );
		System.out.println("printstatment method call count -> " +printStatementCount );
	}
	
	public static void main (String[] args){
		BankDetail bankdtl = new BankDetail();
		bankdtl.debitAmt();
		bankdtl.creditAmt();
		bankdtl.creditAmt();
		bankdtl.creditAmt();
		bankdtl.printStatement();
		bankdtl.printCountInfo();
	}
}