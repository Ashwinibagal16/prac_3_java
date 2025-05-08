package yogeshGhuge;

class Assignment2{
	
	int balance = 1000;
	
	void debitAmt(){
	
		balance = balance -500;
	}
	
	void creditAmt(){
		balance = balance + 200;
	}
	
	void printBalance(){
		System.out.println(balance);
	
	}
	
	public static void main(String [] args){
		
		Assignment2 statement = new Assignment2();
		statement.debitAmt();
		statement.creditAmt();
		statement.creditAmt();
		statement.printBalance();
		statement.creditAmt();
		statement.printBalance();
		statement.debitAmt();
		statement.printBalance();
		
		
		
		
	}
}