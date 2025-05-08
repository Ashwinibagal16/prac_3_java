package aniketBalsaraf;

class BankDetails{
	
	int balance = 1000;
	int debitCount;
	int creditCount;
	int printStatementCount;
	
	void debitAmt(){
		debitCount++;
		balance = balance - 200;
	}
	
	void creditAmt(){
		creditCount++;
		balance = balance + 400;
	}
	
	void printStatement(){
		printStatementCount++;
		System.out.println("Remaining balance is " + balance);
	}
	
	void printCountInfo(){
		System.out.println("Debit count is " + debitCount);
		System.out.println("Credit count is " + creditCount);
		System.out.println("PrintStatement count is " + printStatementCount);
		
	}
		
	public static void main(String[] args){
		BankDetails bankDetails = new BankDetails();
		bankDetails.debitAmt();
		bankDetails.creditAmt();
		bankDetails.creditAmt();
		bankDetails.creditAmt();
		bankDetails.printStatement();
		bankDetails.printCountInfo();
		bankDetails.debitAmt();
		bankDetails.creditAmt();
		bankDetails.printStatement();
		bankDetails.printCountInfo();
		
	}
	
}