package rahulAlagoudar;

class Bank{
	int currBalance = 1000;
	
	void debitamt(){
	  currBalance = currBalance-500;
	}
	
	void creditamt(){
	  currBalance = currBalance+200;
	}
	
	void displayBal(){
		System.out.println("Current Balance is:"+currBalance);  
	}
	
	public static void main(String[] args){
		Bank bank= new Bank();
		bank.displayBal();
		bank.debitamt();
		bank.creditamt();
		bank.creditamt();
		bank.displayBal();
		bank.creditamt();
		bank.displayBal();
		bank.debitamt();
		bank.displayBal();
		
	}
}