/*
Create a class called BankDetail and print how many time debit, credit and printstatement method has been called.
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

Note : debitAmt deduct 200 rs, creditAmt increase balance by 400 rs
*/
package priyankaZende;
class BankDetailA5{

	int balance = 1000;
	int debitCount = 0;
	int	creditCount = 0;
	int printStatementCount = 0;
	
	void debitAmt(){
		balance = balance - 200;
		debitCount = debitCount+1;
	}

	void creditAmt(){
		balance = balance + 400;
		creditCount = creditCount+1;
	}
	
	void printStatement(){
		System.out.println("Remaining balance is :" + balance);
		printStatementCount = printStatementCount + 1;
	}

	void printCountInfo(){
		System.out.println("Remaining balance is :" + balance);
		System.out.println("Debit method call count :" + debitCount);
		System.out.println("Credit method call count :" + creditCount);
		System.out.println("Printstatment method call count :" + printStatementCount);
	}
	
	public static void main(String[] args){
		BankDetailA5 bankDetailA5 = new BankDetailA5();
		bankDetailA5.debitAmt();
		bankDetailA5.creditAmt();
		bankDetailA5.creditAmt();
		bankDetailA5.creditAmt();
		bankDetailA5.printStatement();
		bankDetailA5.printCountInfo();
	}
}	