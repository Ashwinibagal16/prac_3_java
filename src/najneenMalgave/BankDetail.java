package najneenMalgave;

class BankDetail{
	int balance = 1000;
	int debitCount;
	int creditCount;
	int printStatementCount;
		
	void creditAmount(int amt){
		balance = balance + amt;
		creditCount++;
	}
	
	void debitAmount(int amt){
		balance = balance - amt;
		debitCount++;
	}
	
	void printStatement(){
		System.out.println("remaining balance is " + balance);
		printStatementCount++;
	}
	
	void printCountInfo(){
		System.out.println("debit method call count is " + debitCount);
		System.out.println("credit method call count is "+ creditCount);
		System.out.println("printstatement method call count is "+ printStatementCount);
	}
	
	public static void main(String[] args){
		BankDetail bankDetail = new BankDetail();
		bankDetail.debitAmount(300);
		bankDetail.creditAmount(500);
		bankDetail.creditAmount(300);
		bankDetail.creditAmount(500);
		bankDetail.printStatement();
		bankDetail.printCountInfo();
	}
}		