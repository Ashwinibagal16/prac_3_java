package vivekDhole;

class Assignment7 {

	int balance = 5000;

	void initBalance() {
		System.out.println("Balance has been initialized with Rs." + balance);
	}

	void creditAmt(int amount) {
		System.out.println(amount + " Rs has been credited.");
	//	balance = balance + 300;
		balance = balance + amount;
		}

	void debitAmt(int amount) {
		
		if(balance < amount) {
			System.out.println("In Sufficient balance, your ask is "+ amount +" rs but you only have "+ balance +" Rs.");
		}else {
			System.out.println(amount + " Rs has been debited.");
	//		balance = balance - 500;
			balance = balance - amount;
		}
	}

	void display() {
		System.out.println("Your current balance is Rs." + balance);
	}

		public static void main(String[] args) {
		Assignment7 bankoperation = new Assignment7();
		bankoperation.initBalance();
		bankoperation.creditAmt(2000);
		bankoperation.creditAmt(500);
		bankoperation.debitAmt(9500);
		bankoperation.creditAmt(1500);
		bankoperation.debitAmt(6000);
		bankoperation.display();
	}
}	



