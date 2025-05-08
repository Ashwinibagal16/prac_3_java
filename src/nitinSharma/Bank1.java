package nitinSharma;
class Bank1{
	static int debitAmt = 0;
	static int creditAmt = 0;
	
	void credit(){
		creditAmt = creditAmt + 1;
	}
	
	void debit(){
		debitAmt = debitAmt + 1;	
	}
	
	void printData(){
		System.out.println("The number of times amount debit: "+ debitAmt + "\nThe number of times amount Credit: "+ creditAmt);
	}
	
	public static void main(String[] args){
		Bank1 bank_1 = new Bank1();
		bank_1.credit();
		bank_1.credit();
		bank_1.debit();
		bank_1.printData();
		
		Bank1 bank_2 = new Bank1();
		bank_2.debit();
		bank_2.debit();
		bank_2.debit();
		bank_2.credit();
		bank_2.printData();
		
	} 
}