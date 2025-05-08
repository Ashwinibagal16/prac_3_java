package shrutiPundikar;

class BankDetails{
	int balance = 1000;
	int debitCount;
	int creditCount;
	int printStatementCount;
	
	void debitAmount(){
		debitCount++;
		balance = balance - 200;
	}
	
	void creditAmount(){
		creditCount++;
		balance = balance + 400;
	}
	
	void printStatement(){
		System.out.println("Remaining Balance is " + balance);
		printStatementCount++;
	}
	
	void printCountInfo(){
		System.out.println("Debit method call count -> " + debitCount);
		System.out.println("Credit method call count -> " + creditCount);
		System.out.println("Print statement method call count -> " + printStatementCount);
	}
	
	public static void main(String[] args){
		BankDetails bankdetails = new BankDetails();
		bankdetails.debitAmount();
		bankdetails.creditAmount();
		bankdetails.creditAmount();
		bankdetails.creditAmount();	
		bankdetails.printStatement();
		bankdetails.printCountInfo();
	}	
}