package mayurKamble;

class BankDetail{
	int balance = 1000; 
	int debitCount;
	int creditCount;
	int printStatementCount;
	
	void creditAmt(){
		balance=balance+400;
		creditCount+=1;
	}
	
	void debitAmt(){
		balance=balance-200;
		debitCount+=1;
	}
	
	void printStatement(){
		System.out.println("The remaining Balance is :"+balance);
		printStatementCount+=1;
	} 
	
	void printCountInfo(){
		System.out.println("Debit method call count is :"+debitCount);
		System.out.println("Credit method call count is :"+creditCount);
		System.out.println("printStatement method call count is :"+printStatementCount);
	}
	
	public static void main(String[]args){
		BankDetail bankDetail=new BankDetail();
		bankDetail.debitAmt();
		bankDetail.creditAmt();
		bankDetail.creditAmt();
		bankDetail.creditAmt();
		bankDetail.printStatement();
		bankDetail.printCountInfo();
	}
}