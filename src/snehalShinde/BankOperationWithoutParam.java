package snehalShinde;

class BankOperationWithoutParam{
	
	int balance;
	
	void creditAmt(){
		balance = balance + 300;
		System.out.println("300 Rs. has been credited, so your current balance is : " + balance + " rs.");
		System.out.println("---------------------------------------------------------");		
	}

	void debitAmt(){
		if(balance < 500){
			System.out.println("Insufficient balance, your request is to debit 500 Rs. but you only " + balance + " rs.");
		}else{
			balance = balance - 500;
			System.out.println("500 Rs. has been debited, so your current balance is : " + balance + " rs.");
		    System.out.println("---------------------------------------------------------");
		}
	}
	
	void displayAmt(){
		System.out.println("The remaining balance amount after all transactions is : " + balance + " rs.");
		System.out.println("---------------------------------------------------------");
	}
		
	void initialBalance(int initAmt){
		balance = initAmt;
		System.out.println("The balance has been initialised with the amount : " + balance + " rs.");
		System.out.println("---------------------------------------------------------");
	}
	
	public static void main(String[] args){
		BankOperationWithoutParam bankOperationWithoutParam = new BankOperationWithoutParam();
		bankOperationWithoutParam.initialBalance(5000);
		bankOperationWithoutParam.creditAmt();
		bankOperationWithoutParam.creditAmt();
		bankOperationWithoutParam.debitAmt();
		bankOperationWithoutParam.creditAmt();
		bankOperationWithoutParam.debitAmt();	
		bankOperationWithoutParam.displayAmt();
	}	
}
	





