package ashwiniBagal;

class BankOperation {
	int initAmount;

	void initbalance(int balance) {
		initAmount = initAmount + balance;
		System.out.println("Balance has initialized with" + initAmount + "rs.");
	}

	void creditBalance(int balance) {
		initAmount = initAmount + balance;
		System.out.println(balance + "rs has been credited");
	}

	void debitBalance(int balance) {
		if (balance >= 6500) {
			System.out.println(
					"In Sufficent balance your ask is " + balance + "rs but you only have" + initAmount + " rs ");
		}
		if (balance <= 6500) {
			initAmount = initAmount + balance;
			System.out.println(balance + "rs has been dedited");
		}
	}

	void display() {
		System.out.println("Current balance is " + initAmount);
	}

	public static void main(String[] args) {
		BankOperation bankOperation = new BankOperation();
		bankOperation.initbalance(6000);
		bankOperation.creditBalance(3000);
		bankOperation.creditBalance(800);
		bankOperation.debitBalance(9300);
		bankOperation.creditBalance(1400);
		bankOperation.debitBalance(5000);
		bankOperation.display();
	}
}