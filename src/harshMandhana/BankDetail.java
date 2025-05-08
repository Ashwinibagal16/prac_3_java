package harshMandhana;

class BankDetail
{
	int debitCount;
	int creditCount;
	int printStatementCount;
	static int totaldebitCount;
	static int totalcreditCount;
	static int totalprintStatementCount;
	
	void debitAmt()
	{
		debitCount = debitCount + 1;
		totaldebitCount = totaldebitCount + 1;
	}
	
	void creditAmt()
	{
		creditCount = creditCount + 1;
		totalcreditCount = totalcreditCount + 1;
	}
	
	void printStatement()
	{
		printStatementCount = printStatementCount + 1;
		totalprintStatementCount = totalprintStatementCount + 1;
	}
	
	void printCountInfo()
	{
		System.out.println("Debit method call count -> "+debitCount);
		System.out.println("Credit method call count -> "+creditCount);
		System.out.println("PrintStatement method call count -> "+printStatementCount);
		System.out.println("");
	}
	
	static void printAllCountInfo()
	{
		System.out.println("Total Debit operations -> "+totaldebitCount);
		System.out.println("Total Credit operations -> "+totalcreditCount);
		System.out.println("Total PrintStatement operations -> "+totalprintStatementCount);
		System.out.println("");
	}
	
	public static void main(String args[])
	{
		BankDetail bankDetail1 = new BankDetail();
		bankDetail1.debitAmt();
		bankDetail1.creditAmt();
		bankDetail1.creditAmt();
		bankDetail1.creditAmt();
		bankDetail1.printStatement();
		bankDetail1.printCountInfo();
		
		BankDetail bankDetail2 = new BankDetail();
		bankDetail2.creditAmt();
		bankDetail2.printStatement();
		bankDetail2.printStatement();
		bankDetail2.printStatement();
		bankDetail2.printCountInfo();
		
		BankDetail.printAllCountInfo();
	}
	
}