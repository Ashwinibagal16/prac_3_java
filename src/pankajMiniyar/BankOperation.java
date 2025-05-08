//Assignment-7
package pankajMiniyar;
class BankOperation{
	int balance;
	
	void initialBalance(){
		balance=1000;
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
	
	void displayBalance(){
		System.out.println("Current Available Balance = " + balance);
	}
	
	public static void main(String[] args){
		BankOperation bankOperation=new BankOperation();
		bankOperation.initialBalance();  //1000
		bankOperation.creditAmt(); //1300
		bankOperation.displayBalance();
		bankOperation.debitAmt(); //800
		bankOperation.displayBalance();
		bankOperation.debitAmt();   // 300
		bankOperation.displayBalance();
		bankOperation.debitAmt();
	}
}