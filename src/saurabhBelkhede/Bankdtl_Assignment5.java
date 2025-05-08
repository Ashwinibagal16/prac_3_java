package saurabhBelkhede;
class Bankdtl {

	static int balance= 1000;
	int debitCount;
	int creditCount;
	int printStatementCount;
	
	void debitAmount(){
		balance = balance - 200;
		debitCount++;
	}
	
	void creditAmount(){
		balance = balance + 400;
		creditCount++;
	}
	
	void printStatement() {
		System.out.println("Remaining balance is: " +balance);
		printStatementCount++;
	}
	
	public static void main(String[] args) {
		Bankdtl bankdtl=new Bankdtl();
		bankdtl.debitAmount();
		bankdtl.creditAmount();
		bankdtl.creditAmount();
		bankdtl.creditAmount();
		bankdtl.printStatement();
		System.out.println("Debit Count is: " + bankdtl.debitCount);
		System.out.println("credit Count is: " + bankdtl.creditCount);
		System.out.println("Print Statement Count is: " + bankdtl.printStatementCount);
	}
}
	