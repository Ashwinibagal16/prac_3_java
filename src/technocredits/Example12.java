package technocredits;

class Example12{
	int debitCount;
	static int totalDebitCount;
	
	void debitAmt(){
		debitCount++;
		totalDebitCount++;
	}
	
	void printDebitOperationInfo(){
		System.out.println("Debit method calling count : " + debitCount);
	}		
	
	public static void main(String[] args){
		Example12 ex12_1 = new Example12();
		ex12_1.debitAmt();
		ex12_1.debitAmt();
		ex12_1.printDebitOperationInfo(); //2 
		
		Example12 ex12_2 = new Example12();
		ex12_2.debitAmt();
		ex12_2.debitAmt();
		ex12_2.debitAmt();
		ex12_2.debitAmt();
		ex12_2.printDebitOperationInfo(); //4
		
		System.out.println("Total Debit method calling count : " + Example12.totalDebitCount);
	}	
}