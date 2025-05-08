package shubhamMandavgane;
class BankOperation_1{
 
	int balance ;
	
	void initBalance(){
		balance = 200;
		System.out.println("Balance has been initialized with " + balance + " rs. ");
	}
	
	void creditAmt(){
		balance = balance + 300;
		System.out.println(" 300 rs has been credited and Your current balance is " +balance );
	}
	
	void debitAmt(){
		if(balance>=500){
		balance = balance - 500;
		System.out.println(" 500 rs has been debited and Your current balance is " +balance );
		}
		else{
			System.out.println("insufficient balance in your account" );
		}
		
	}
	
	void display(){
		System.out.println("Your Current balance is " + balance);
	}
	
	public static void main(String[] args){
		BankOperation_1 bankoperation_1 = new BankOperation_1(); 
		bankoperation_1.initBalance();
		bankoperation_1.creditAmt();
		bankoperation_1.creditAmt();
		bankoperation_1.debitAmt();
		bankoperation_1.creditAmt();
		bankoperation_1.debitAmt();
		bankoperation_1.display();
		
	}
}