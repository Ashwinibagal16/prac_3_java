package suchetaGhogare;

class BankOperations{
	
	int bal;

	void initBalance(int inBal){
		bal = inBal;
		System.out.println("Your account has been intialised with Rs." +inBal);
	}

	void creditAmount(int credAmt){
		bal = bal + credAmt;
		System.out.println("Your balance is credited by Rs." +credAmt);
	}

	void debitAmount(int debitAmt){
		if (bal >= debitAmt){
			bal = bal - debitAmt;
			System.out.println("Your balance is debited by Rs." +debitAmt);
		}
		else
			System.out.println("Insufficient balance. You have asked Rs." + debitAmt + " to debit but balance is only Rs." + bal);
	}

	void printBalance(){
		System.out.println("Your current balance is Rs." +bal);
	}

	public static void main(String[] args){
		BankOperations bankOperations = new BankOperations();
		bankOperations.initBalance(5000);
		bankOperations.creditAmount(2000);
		bankOperations.creditAmount(500);
		bankOperations.debitAmount(9500);
		bankOperations.creditAmount(1500);
		bankOperations.debitAmount(6000);
		bankOperations.printBalance();
	}
}