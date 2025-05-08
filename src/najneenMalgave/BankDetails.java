package najneenMalgave;

class BankDetails{
	int balance = 1000;
	
	void creditAmount(int amt){
		balance = balance + amt;
	}
	
	void debitAmount(int amt){
		balance = balance - amt;
	}
	
	void printBalance(){
		System.out.println("Now your current balance is " + balance);
	}
	
	public static void main(String[] args){
		BankDetails bankDetails = new BankDetails();
		bankDetails.debitAmount(300);
		bankDetails.creditAmount(500);
		bankDetails.creditAmount(200);
		bankDetails.creditAmount(800);
		bankDetails.debitAmount(1800);
		bankDetails.printBalance();
	}
}		