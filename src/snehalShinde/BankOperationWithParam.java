package snehalShinde;

class BankOperationWithParam{
	
	int balance;
	
	void creditAmt(int credAmt){
		balance = balance + credAmt;
		System.out.println(credAmt + " Rs. has been credited, so your current balance is : " + balance);
		System.out.println("-------------------------------------------------------------------");		
	}

	void debitAmt(int debtAmt){
		if(balance >= debtAmt){
			balance = balance - debtAmt;
			System.out.println(debtAmt + " Rs. has been debited, so your current balance is : " + balance + "\n");
		}else{
			System.out.println("Insufficient balance, your request is to debit " + debtAmt + " Rs. but you only have " + balance + " Rs. in your balance.");
			System.out.println("-------------------------------------------------------------------");
		}
	}
	
	void displayAmt(){
		System.out.println("The remaining balance amount after all transactions is : " + balance + " rs.");
		System.out.println("-------------------------------------------------------------------");
	}
		
	void initialBalance(int initAmt){
		balance = initAmt;
		System.out.println("The balance has been initialised with the amount : " + balance + " rs.");
		System.out.println("-------------------------------------------------------------------");
	}
	
	public static void main(String[] args){
		BankOperationWithParam bankOperationWithParam = new BankOperationWithParam();
		bankOperationWithParam.initialBalance(5000);
		bankOperationWithParam.creditAmt(2000);
		bankOperationWithParam.creditAmt(500);
		bankOperationWithParam.debitAmt(9500);
		bankOperationWithParam.creditAmt(1500);
		bankOperationWithParam.debitAmt(6000);	
		bankOperationWithParam.displayAmt();
	}	
}
	