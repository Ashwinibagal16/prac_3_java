/*Create a call called BankDetail and print how many time debit, credit and printstatement method has been called.
Instance variable can be balance = 1000, debitCount, creditCount, printStatementCount.
printCountInfo method should show how many times debit,credit and printStatement method has been called.
from main method calling sequence should be as follows:

debitAmt() -> debitCount = debitCount+1, balance = balance - 200;

creditAmt()
creditAmt()
creditAmt()
printStatement() [this method should print remaining balance]
printCountInfo()

output :

remaining balance is 2000
debit method call count -> 1
credit method call count -> 3
printstatment method call count -> 1

Note : debitAmt deduct 200 rs, creditAmt increase balance by 400 rs*/
package madhuriMalvi;
class BankDetail{
	int balance = 1000;
	int debitCount,creditCount,printStatementCount;
	
	void debitAmt(){
		balance = balance - 200;
		debitCount = debitCount + 1;
	}
	void creditAmt(){
		balance = balance + 400;
		creditCount = creditCount + 1;
	
	}
	void printstatement(){
		System.out.println("Remaining balance is " + balance);
		printStatementCount = printStatementCount + 1;
	
	}
	void printCountInfo(){
		System.out.println("debit method call count -> " + debitCount);
        System.out.println("credit method call count -> " + creditCount);
        System.out.println("printstatment method call count -> " + printStatementCount);
	
	}
	public static void main(String[] args){
		BankDetail bankdetail = new BankDetail();
		bankdetail.debitAmt();
		bankdetail.creditAmt();//1200
		bankdetail.creditAmt();//1600
		bankdetail.creditAmt();//2000
		bankdetail.printstatement();
		bankdetail.printCountInfo();
	}
}