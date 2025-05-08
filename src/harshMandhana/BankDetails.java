package harshMandhana;

class BankDetails
{
	static int debitCount;
	static int creditCount;
	static int printStatementCount;
	int balance=1000;
	
	void debitAmt()
	{
		balance = balance - 200;
		debitCount = debitCount + 1;
	}
	
	void creditAmt()
	{
		balance = balance + 400;
		creditCount = creditCount + 1;
	}
	
	void printStatement()
	{
		System.out.println("Remaining Balance amount is: "+balance);
		printStatementCount = printStatementCount + 1;
	}
	
	void printDetails()
	{
		System.out.println("Debit method call count -> "+debitCount);
		System.out.println("Credit method call count -> "+creditCount);
		System.out.println("PrintStatement method call count -> "+printStatementCount);
	}
	
	public static void main(String args[])
	{
		BankDetails bankDetails = new BankDetails();
		bankDetails.debitAmt();
		bankDetails.creditAmt();
		bankDetails.creditAmt();
		bankDetails.creditAmt();
		bankDetails.printStatement();
		bankDetails.printDetails();
	}
	
}	
