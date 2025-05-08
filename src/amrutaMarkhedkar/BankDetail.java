package amrutaMarkhedkar;

class BankDetail {
	int debitCnt, creditCnt, printStatementCnt,balance =1000;
	
	void debitAmt(){
		balance = balance - 200;	
		debitCnt++;		
	}
	
	void creditAmt(){
		balance = balance + 400;
		creditCnt++;
	}
	
	void printCountInfo(){
		System.out.println("debit method call count -> " +debitCnt);
		System.out.println("credit method call count -> "+creditCnt);
		System.out.println("printstatment method call count -> "+printStatementCnt);
	}
	
	void printStatement(){
		printStatementCnt++;
		System.out.println("remaining balance is : "+balance);
	}
	
	public static void main(String []args){
		BankDetail bankDetail = new BankDetail();
		bankDetail.debitAmt();
		bankDetail.creditAmt();
		bankDetail.creditAmt();
		bankDetail.creditAmt();
		bankDetail.printStatement();
		bankDetail.printCountInfo();		
	}
}