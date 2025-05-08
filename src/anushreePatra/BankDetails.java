package anushreePatra;

class BankDetails{
	int balance = 1000;
	int debitCount = 0;
	int creditCount = 0;
	int printStatement = 0;
	
	void debitAmt(){
		debitCount = debitCount+1;
		balance = balance - 200;
	}
	
	void creditAmt(){
		creditCount = creditCount+1;
		balance = balance + 400;
	}
	
	void printStatementCount(){
		System.out.println( "Remaining balance is " + balance);
		printStatement = printStatement+1;
	}
	
	void printCountInfo(){
		System.out.println( "Debit method call count  is " + debitCount);
		System.out.println( "Credit method call count is " + creditCount);
		System.out.println( "Printstatment method call count is " + printStatement);
	}
	
	public static void main(String[] args){
		BankDetails bankDetails = new BankDetails();
		bankDetails.debitAmt();
		bankDetails.creditAmt();
		bankDetails.creditAmt();
		bankDetails.creditAmt();
		bankDetails.printStatementCount();
		bankDetails.printCountInfo();
	}

		}