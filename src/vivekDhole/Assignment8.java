package vivekDhole;

class Assignment8 {

	static int balance = 1000;

	void creditAmt() {
		balance = balance + 300;
		System.out.println("Credit operation performed successfully and current balance is " + balance);
	}

	void debitAmt() {
		if(balance >= 500){
			balance = balance - 500;
			System.out.println("Debit operation performed successfully and current balance is " + balance);
		}else{
			System.out.println("Insufficient funds, current balance is " + balance + " and minimum balance should be Rs.500");
		}
	}

	public static void main(String[] args) {
		Assignment8 conditions = new Assignment8();
		conditions.creditAmt();
		conditions.debitAmt();
		conditions.debitAmt();	
		conditions.debitAmt();
	}
}

