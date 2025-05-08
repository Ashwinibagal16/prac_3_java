package asadMukri;

class Bank {
	
	int balance = 1000;
	
	void credit() {
		balance = balance + 200;
		System.out.println("Money credited: 200");
		System.out.println();
	}
	
	void debit(){
		balance = balance - 500;
		System.out.println("Money debited: 500");
		System.out.println();
	}
	
	void print(){
		System.out.println("Remaining balance is " + balance);
		System.out.println();
	}
	
	public static void main(String[] args){
		Bank bank = new Bank();
		
		System.out.println();
		bank.debit();
		bank.credit();
		bank.credit();
		bank.print();
		bank.credit();
		bank.print();
		bank.debit();
		bank.print();
	}
}