
package omkarBhujbal;
class BankOperation{
	int balance = 1000;
	
	void creditAmt(){
		balance = balance +300;
		System.out.println(300 + "Credited Amount" + "total balance" + balance);
	}
	void debitAmt(){
		if(balance>=500){
			balance = balance - 500;
			System.out.println(500 + "Debited balance" + "total balance" + balance);
	}else{
			System.out.println("Inseficent balance");
			System.out.println("Remaining balance is"+ balance);
		}
	}	
	public static void main(String[] args){
		BankOperation  bnkOper= new BankOperation();
		bnkOper.creditAmt();
		bnkOper.debitAmt();
		bnkOper.debitAmt();
		bnkOper.debitAmt();
	}
}