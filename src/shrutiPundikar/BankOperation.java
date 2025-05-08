package shrutiPundikar;

class BankOperation{
	static int balance;
	
	void initBalance(int initamt){
		balance = initamt;
		System.out.println("Balance has been initialised with Rs."+initamt);
	}
	
	void creditAmt(int creditamt){
		balance = balance + creditamt;
		System.out.println("Rs."+creditamt+" has been credited");
	}
	
	void debitAmt(int debitamt){
		if(balance >= debitamt){
			balance = balance - debitamt;
			System.out.println("Rs."+debitamt+" has been debited");
		}
		else{
			System.out.println("Insufficient balance, you ask Rs." + debitamt + " but you only have RS."+balance);
		}
	}
	
	void display(){
		System.out.println("Your current balance is Rs." +balance);
	}
	
	public static void main(String[] args){
		BankOperation bankoperation = new BankOperation();
		bankoperation.initBalance(5000);
		bankoperation.creditAmt(2000);
		bankoperation.creditAmt(500);
		bankoperation.debitAmt(9500);
		bankoperation.creditAmt(1500);
		bankoperation.debitAmt(6000);
		bankoperation.display();
	}
}