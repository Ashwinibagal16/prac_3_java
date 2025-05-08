package umakantSahani;

class BankDetail{
	int balance = 1000;
	int debitCount = 0;
	int creditCount = 0;
	int printStatementCount = 0;
	
	void creditAmount(){
		balance+=400;
		creditCount+=1;
	}
	
	void debitAmount(){
		balance-=200;
		debitCount+=1;
	}
	
	void printStatement(){
		System.out.println("Remaining Balance:" + balance);
		printStatementCount+=1;
	}
	
	void printCountInfo(){
		System.out.println("debitAmount method call count:" + debitCount);
		System.out.println("creditAmount method call count:" + creditCount);
		System.out.println("printStatement method call count:" + printStatementCount);
	}
	
	public static void main(String[] args){
		BankDetail bankDetail = new BankDetail();
		bankDetail.debitAmount();
		bankDetail.creditAmount();
		bankDetail.creditAmount();
		bankDetail.creditAmount();
		bankDetail.printStatement();
		bankDetail.printCountInfo();
	}
	
}