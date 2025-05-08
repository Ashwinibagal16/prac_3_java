//Assignment 5
package jeetHingrajiya;
class BankDetail{
	int balance =1000;
	int debitCount;
	int creditCount;
	int printStatementCount;
	
	void debitAmt(){
		debitCount= debitCount+1;
		balance=balance-200;
	}
	
	void creditAmt(){
		creditCount= creditCount+1;
		balance=balance+400;
	}
	
	void printStatement(){
		System.out.println("Remaining Balance is " + balance);
		printStatementCount= printStatementCount+1;
	}
	
	void printCountInfo(){
		System.out.println("Debit method call count -> " + debitCount);  
		System.out.println("Credit method call count -> " + creditCount);
		System.out.println("Print Statement method call count -> " + printStatementCount);  
	}
	
	public static void main(String[]args){
		BankDetail bankdetail = new BankDetail();
		bankdetail.debitAmt();
		bankdetail.creditAmt();
		bankdetail.creditAmt();
		bankdetail.creditAmt();
		bankdetail.printStatement();
		bankdetail.printCountInfo();
	}
}