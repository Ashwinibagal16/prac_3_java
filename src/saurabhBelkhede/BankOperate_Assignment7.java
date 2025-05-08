package saurabhBelkhede;
//Assignment 7
class BankOperate {
	
	int intbal;
	
	void initBalance(){
		intbal = intbal + 5000;
		System.out.println("Balance has been initialized with: " + intbal + "Rs");
	}
	
	void creditAmt (){
		int cred = 200;
		intbal = intbal + cred;
		System.out.println(cred + "Rs has been credited.");
	}
	
	void debitAmt (){
		int debt = 5300;
		if(debt > intbal){
			System.out.println("Insufficient balance, your ask is " + debt + "rs, but you only have " + intbal + " Rs.");
		}else{
			intbal = intbal - debt;
			System.out.println(debt + "Rs have been debited");
		}
	}
	
	void display (){
		System.out.println("Your current balance is: " + intbal + "Rs");
	}
	
	public static void main(String[] args) {
		BankOperate bankopt=new BankOperate();
		bankopt.initBalance();
		System.out.println("-----------------------");
		bankopt.creditAmt();
		System.out.println("-----------------------");
		bankopt.debitAmt();
		System.out.println("-----------------------");
		bankopt.creditAmt();
		System.out.println("-----------------------");
		bankopt.debitAmt();
		System.out.println("-----------------------");
		bankopt.display();
	}
}	