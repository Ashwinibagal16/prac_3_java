package rahulAlagoudar;

class BankCounter{
	int debitCount;
	int creditCount;
	int printStmtCount;
	static int totalDebitCount;
	static int totalCreditCount;
	static int totalPrintCount;
	
	void debit(){
		debitCount=debitCount+1;
		totalDebitCount=totalDebitCount+1;
	}
	
	void credit(){
		creditCount=creditCount+1;
		totalCreditCount=totalCreditCount+1;
	}
	
	void stmt(){
		printStmtCount=printStmtCount+1;
		totalPrintCount=totalPrintCount+1;
	}
	
	void printCountInfo(){
		System.out.println("Debit count is: "+debitCount);
		System.out.println("Credit count is: "+creditCount);
		System.out.println("Print statement count is: "+printStmtCount);
		System.out.println("");
	}
	
	void printAllCountInfo(){
		System.out.println("Total Debit count is: "+totalDebitCount);
		System.out.println("Credit count is: "+totalCreditCount);
		System.out.println("Print statement count is: "+totalPrintCount);
		System.out.println("");
	}
	
	public static void main(String[] args){
		BankCounter bco1=new BankCounter();
		BankCounter bco2=new BankCounter();
		bco1.debit();
		bco1.debit();
		bco1.debit();
		bco1.stmt();
		bco2.credit();
		bco2.stmt();
		bco1.printCountInfo();
		bco2.printCountInfo();
		bco1.printAllCountInfo();
	}
  
}