package mayurKamble;

class BankInfo{
	int debitCount;
	int creditCount;
	int printStatementCount;
	static int totalDebitCount;
	static int totalCreditCount;
	static int totalPrintStatementCount;
	
	void debit(){
		debitCount+=1;
		totalDebitCount+=1;
	}
	
	void credit(){
		creditCount+=1;
		totalCreditCount+=1;
	}
	
	void printStatement(){
		printStatementCount+=1;
		totalPrintStatementCount+=1;
	}
	
	void printCountInfo(){
		System.out.println("Debit Method Call Count :"+debitCount);
		System.out.println("Credit Method Call Count :"+creditCount);
		System.out.println("PrintStatement Method Call Count :"+printStatementCount);
	}
	
	void printAllCountInfo(){
		System.out.println("Total Debit Operations :"+totalDebitCount);
		System.out.println("Total Credit Operations :"+totalCreditCount);
		System.out.println("Total printStatement Operations :"+totalPrintStatementCount);
	}
	
	public static void main(String[]args){
		BankInfo bankInfo_1=new BankInfo();
		bankInfo_1.credit();
		bankInfo_1.credit();
		bankInfo_1.debit();
		bankInfo_1.credit();
		bankInfo_1.printStatement();
		bankInfo_1.printCountInfo();
		System.out.println("-------------------------------------");
		BankInfo bankInfo_2=new BankInfo();
		bankInfo_2.credit();
		bankInfo_2.printStatement();
		bankInfo_2.printStatement();
		bankInfo_2.printStatement();
		bankInfo_2.printCountInfo();
		System.out.println("-------------------------------------");
		bankInfo_2.printAllCountInfo();	
	}
}