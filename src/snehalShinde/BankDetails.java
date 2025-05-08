package snehalShinde;

class BankDetails{

	int balance=1000;
	int debitCount;
	int creditCount;
	int printTotalCount;
	
	void debitAmt(){
		balance = balance - 200;
		debitCount = debitCount + 1;
	}
	
	void creditAmt(){
		balance = balance + 400;
		creditCount = creditCount + 1;
	}
	
	void printStatement(){
		System.out.println("The remaining balance is : " + balance);
		printTotalCount = printTotalCount +1;
	}
	
	void printCountInfo(){
		System.out.println("Total Debit call count is : " + debitCount);
		System.out.println("Total Credit call count is : " + creditCount);
		System.out.println("Total Print Statement call count is : " + printTotalCount);
	}
	
	public static void main(String[] args){
		BankDetails bankDetails = new BankDetails();
		bankDetails.debitAmt();
		bankDetails.creditAmt();
		bankDetails.creditAmt();
		bankDetails.creditAmt();
		bankDetails.printStatement();
		bankDetails.printCountInfo();
	}
}
	
	
	
	
	
	
	
	
	
