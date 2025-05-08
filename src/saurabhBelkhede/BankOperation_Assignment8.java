package saurabhBelkhede;
//Assignment 8
class BankOperation {
	
	int intbal;
	
	void initBalance(int init){
		intbal = init;
		System.out.println("Balance has been initialized with: " + intbal + "Rs");
	}
	
	void creditAmt (int cred){
		intbal = intbal + cred;
		System.out.println(cred + "Rs has been credited.");
	}
	
	void debitAmt (int debit){
		if(debit > intbal){
			System.out.println("Insufficient balance, your ask is " + debit + "rs, but you only have " + intbal + " Rs.");
		}else{
			intbal = intbal - debit;
			System.out.println(debit + "Rs have been debited");
		}
	}
	
	void display (){
		System.out.println("Your current balance is: " + intbal + "Rs");
	}
	
	public static void main(String[] args) {
		BankOperation bankopt=new BankOperation();
		int init_input = 5000;
		bankopt.initBalance(init_input);
		System.out.println("-----------------------");
		int cred_input = 2000;
		bankopt.creditAmt(cred_input);
		System.out.println("-----------------------");
		cred_input = 500;
		bankopt.creditAmt(cred_input);
		System.out.println("-----------------------");
		int debit_input = 9500;
		bankopt.debitAmt(debit_input);
		System.out.println("-----------------------");
		cred_input = 1500;
		bankopt.creditAmt(cred_input);
		System.out.println("-----------------------");
		debit_input = 6000;
		bankopt.debitAmt(debit_input);
		System.out.println("-----------------------");
		bankopt.display();
	}
}	