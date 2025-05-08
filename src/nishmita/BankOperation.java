package nishmita;
class BankOperation{
	int balance;

	void initialBalance(){
		balance=5000;
		System.out.println("Balance has been initialized with 5000 rs.");
	}

	void creditAmt(){
		balance=balance+300;
		System.out.println("300 rupees is credited in account");
	}

	void debitAmt(){
		if(balance>=500){
			balance=balance-500;
			System.out.println("500 rupees is debited from account");
		}else {
			System.out.println("Insufficient Balance, Your Current Balance= " + balance + " and user enters 500 rupees");
		}
	}

	void display(){
		System.out.println("Current Available Balance = " + balance);
	}

	public static void main(String[] args){
		BankOperation bankOperation=new BankOperation();
		bankOperation.initialBalance();  
		bankOperation.creditAmt(); 
		bankOperation.display();
		bankOperation.debitAmt(); 
		bankOperation.display();
		bankOperation.debitAmt(); 
		bankOperation.display();
		bankOperation.debitAmt();
	}
}