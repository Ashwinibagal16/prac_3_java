package snehalShinde;

class BankDetailsIfElse{

	int balance = 1000;
/*	
	void debitAmt1(){
		balance = balance - 500;
		if (balance < 500){
			System.out.println ("Insufficient fund : Current Balance amount is : " + balance + " and as per process, Rs. 500 need to deduct from Balance. Hence unable to proceed with the debit transaction.");
			
		} else{
			System.out.println ("Debit operation performed successfully and current balance is : " + balance);
		}
		System.out.println("-------------------------------");
	}
*/		
	void debitAmt(){
		if (balance >= 500){
		balance = balance - 500;			
			System.out.println ("Debit operation performed successfully and current balance is : " + balance);
		}else{
			System.out.println ("Insufficient fund : Current Balance amount is : " + balance + " and as per process, Rs. 500 need to deduct from Balance. Hence unable to proceed with the debit transaction.");
		}
		System.out.println("-------------------------------");
	}
	
	void creditAmt(){
			balance = balance + 300;
			System.out.println ("Credit operation performed successfully and current balance is : " + balance);
			System.out.println("-------------------------------");			
	}
		
	public static void main(String[] args){
		BankDetailsIfElse bankDetailsIfElse = new BankDetailsIfElse();
		bankDetailsIfElse.creditAmt();
		bankDetailsIfElse.debitAmt();
		bankDetailsIfElse.debitAmt();
		bankDetailsIfElse.debitAmt();
	}
}
	





	

	
	
	
	
	
	
	
	
	
