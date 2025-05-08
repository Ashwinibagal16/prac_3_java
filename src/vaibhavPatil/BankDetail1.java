package vaibhavPatil;


class BankDetail1{
	int debitCount;
	int creditCount;
	int printStatementCount;
	static int totalDebitCount;
	static int totalCrditCount;
	static int totalprintStatementCount;
	
	void debitAmt(){
		debitCount++;
		totalDebitCount++;
	}
	
	void creditAmt(){
		creditCount++;
		totalCrditCount++;
	}
	
	void printStatement(){
		printStatementCount++;
		totalprintStatementCount++;
	}
	
	void printCountInfo(){
		System.out.println("Debit method call Count is : "+debitCount);
		System.out.println("credit method call count is : "+creditCount);
		System.out.println("print Staement method call count is : "+printStatementCount);
		System.out.println();
		
	}
	
	void printAllCountInfo(){
		System.out.println("Total debit Operations : "+totalDebitCount);
		System.out.println("Total credit Operations : "+totalCrditCount);
		System.out.println("Total print statement Operations : "+totalprintStatementCount);
		System.out.println();
	}
	
	public static void main(String[] args){
		BankDetail1 bankdetail1 = new BankDetail1();
		bankdetail1.debitAmt();
		bankdetail1.creditAmt();
		bankdetail1.creditAmt();
		bankdetail1.creditAmt();
		bankdetail1.printStatement();
		bankdetail1.printCountInfo();
		
		BankDetail1 bankdetail2 = new BankDetail1();
		bankdetail2.creditAmt();
		bankdetail2.printStatement();
		bankdetail2.printStatement();
		bankdetail2.printStatement();
		bankdetail2.printCountInfo();
		bankdetail2.printAllCountInfo();
	}
}