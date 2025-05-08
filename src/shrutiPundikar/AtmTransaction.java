package shrutiPundikar;

class AtmTransaction{
	static int balance = 1000;
	
	void creditAmt(){
		balance = balance + 300;
		System.out.println("Rs.300 credited successfully, current balance is Rs." + balance);
	}
	
	void debitAmt(){
		if(balance >=500){
			balance = balance - 500;
			System.out.println("Rs.500 withdraw successfully, current balance is Rs." + balance);
		}
		else{
			System.out.println("Insufficient funds in account");
			System.out.println("Remaining balance is Rs. " + balance);
		}
	}
	
	public static void main(String[] args){
		AtmTransaction atmtrn = new AtmTransaction();
		atmtrn.creditAmt();
		atmtrn.debitAmt();
		atmtrn.debitAmt();
		atmtrn.debitAmt();
	}
}