package suchetaGhogare;

class BankOperation{
	
	int bal;

	void initBalance(){
		bal = 1000;
	}

	void creditAmount(){
		bal = bal + 300;
		System.out.println("Your balance is credited by Rs.300");
	}

	void debitAmount(){
		if (bal >= 500){
			bal = bal - 500;
			System.out.println("Your balance is debited by Rs.500");
		}
		else
			System.out.println("Insufficient balance. You have asked Rs.500 to debit but balance is only Rs." + bal);
	}

	void printBalance(){
		System.out.println("Your current balance is Rs." +bal);
	}

	public static void main(String[] args){
		BankOperation bankOperation = new BankOperation();
		bankOperation.initBalance();
		bankOperation.creditAmount();
		bankOperation.creditAmount();
		bankOperation.debitAmount();
		bankOperation.creditAmount();
		bankOperation.debitAmount();
		bankOperation.printBalance();
		bankOperation.debitAmount();
		bankOperation.debitAmount();
	}
}