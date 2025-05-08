package najneenMalgave;

class BankDetailData{
	int balance = 1000;
	int debitCount;
	int creditCount;
	int printStatementCount;
		
	void creditAmount(int amt){
		if(amt >= 0){
		balance = balance + amt;
		}else{
			System.out.println("You are trying to credit " +amt + " rs, negative amount can not be credited.");
		}
		creditCount++;
	}
	
	void debitAmount(int amt){
		if (balance >= amt){
		balance = balance - amt;
		}else{
			System.out.println("Insufficient fund, " +amt + " cant be debited as current balance is " + balance +".");
		}
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
		BankDetailData bankDetailData = new BankDetailData();
		bankDetailData.debitAmount(1300);
		bankDetailData.printStatement();
		bankDetailData.creditAmount(500);
		bankDetailData.creditAmount(-300);
		bankDetailData.creditAmount(500);
		bankDetailData.debitAmount(200);
		bankDetailData.debitAmount(2000);
		bankDetailData.printStatement();
		bankDetailData.printCountInfo();
	}
}		