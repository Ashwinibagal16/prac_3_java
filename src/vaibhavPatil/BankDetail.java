package vaibhavPatil;


class BankDetail{
	int balance= 1000;
	int debitCount;
	int creditCount;
	int printStatementCount;
	
	void debitAmt(){
		debitCount++;
		balance=balance-200;
	}
	
	void creditAmt(){
		creditCount++;
		balance=balance+400;
	}
	
	void printStatement(){
		printStatementCount++;
	}
	
	void printCountInfo(){
		System.out.println("Remaining Balance is : "+balance);
		System.out.println("Debit method Count is : "+debitCount);
		System.out.println("credit method count is : "+creditCount);
		System.out.println("print Staement method count is : "+printStatementCount);
	}
	
	public static void main(String[] args){
		BankDetail bankdetail = new BankDetail();
		bankdetail.debitAmt();
		bankdetail.creditAmt();
		bankdetail.creditAmt();
		bankdetail.creditAmt();
		bankdetail.printStatement();
		bankdetail.printCountInfo();
	}
}