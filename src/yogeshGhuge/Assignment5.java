package yogeshGhuge;

class Assignment5{

	int balance = 1000;
	int debitcount;
	int creditcount;
	int printstatementcount;
	
	
	
	void debitAmt(){
		debitcount = debitcount+1;
		balance = balance-200;
	}
	
	void creditAmt(){
		creditcount = creditcount+1;
		balance = balance +400;
	
	}
	void printstatement(){
		printstatementcount = printstatementcount+1;
		System.out.println("Remaining balance is :" + balance);
	}
	
	void printcountinfo(){
		System.out.println("debit method call count:" + debitcount);
		System.out.println("creditcount method call count : " + creditcount);
		System.out.println("Printstatement count :" + printstatementcount);
	 
	 }
	public static void main ( String [] args){
		
		Assignment5 BD = new Assignment5();
		BD.debitAmt();
		BD.creditAmt();
		BD.creditAmt();
		BD.creditAmt();
		BD.printstatement();
		BD.printcountinfo();
		
	}
	
	}