package yogeshGhuge;
class Assignment7{
	int balance;
	
	
	void intialBalance(){
		balance = 1000;
		System.out.println("Intial balance is :" + balance);
	
	}
	
	void debit(){
		if(balance>=500){
			balance = balance-500;
			System.out.println("500" + "  Debited" + "  total balance is:" + balance); 
		}else{
			System.out.println("Insufficient balance");
			System.out.println("Remaining balance is :" + balance);
			
		}
	
	}
	void credit(){
		balance = balance+300;
		System.out.println("300" + " Current balance" + balance );
	}
	
	public static void main(String[] args){
		Assignment7 BankOperation = new Assignment7();
		BankOperation.intialBalance();
		BankOperation.credit();
		BankOperation.debit();
		BankOperation.debit();
	
	}



}