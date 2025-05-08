package nitinSharma;
class BankDetail{
	int balance = 1000;
	int debitCount;
	int creditCount;
	int printStatement;
	
	void debitAmt(){
		debitCount = debitCount + 1;
		balance = balance - 200;
	}
	
	void creditAmt(){
		creditCount = creditCount + 1;
		balance = balance + 400;
	}
	
	void printStatement(){
		printStatement = printStatement + 1;
		System.out.println("Remaining balance is: "+ balance);
	}
	
	void printCountInfo(){
		System.out.println("Number of times amount debited: "+ debitCount);
		System.out.println("Number of times amount credited: "+ creditCount);
		System.out.println("Number of times statement printed: "+ printStatement);
	}
	
	public static void main(String[] args){
		BankDetail bankDetail = new BankDetail();
		bankDetail.debitAmt();
		bankDetail.creditAmt();
		bankDetail.creditAmt();
		bankDetail.creditAmt();
		bankDetail.printStatement();
		bankDetail.printCountInfo();
	}
}