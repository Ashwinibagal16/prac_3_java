package vivekRahate;
class BankDetails{
	int intialBalance = 1000;
	int debitCount;
	int creditCount;
	int printStatementCount;
	
	void debitAmt(){
		intialBalance = intialBalance - 200;
		debitCount ++;
	}
	
	void creditAmt(){
		intialBalance = intialBalance + 400;
		creditCount ++;
	}
	
	void printStatement(){
		printStatementCount ++;
		System.out.println("Current Balance = " + intialBalance);
	}
	
	void printCountInfo(){
		System.out.println("Total Debit Count --> " + debitCount);
		System.out.println("Total Credit Count --> " + creditCount);
		System.out.println("Total PrintStatement Count --> " + printStatementCount);	
	}
	
	public static void main(String a[]){
		BankDetails bankdetails = new BankDetails();
		bankdetails.debitAmt();
		bankdetails.creditAmt();
		bankdetails.creditAmt();
		bankdetails.creditAmt();
		bankdetails.printStatement();
		bankdetails.printCountInfo();
	}	
}