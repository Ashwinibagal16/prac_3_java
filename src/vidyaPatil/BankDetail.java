package vidyaPatil;


class BankDetail{	
	int balance= 1000;
	int debitCount;
	int creditCount;
	int printStatementCount;
	
	void debitAmt(){
		balance= balance-200;
		//debitCount = debitCount+1;
		debitCount++;
	}
	
	void creditAmt(){
		balance = balance + 400;
		creditCount++;
	}

	void printStatement(){
		System.out.println("Remaining Account Balance : " + balance);
		printStatementCount++;
	}
	
	void printCountInfo(){
		System.out.println("Debit method call count : " +debitCount);
		System.out.println("Credit method call count : " +creditCount);
		System.out.println("Print Statement method call count : " +printStatementCount);
	}
	
	public static void main(String[] args){
		BankDetail bankDetail = new BankDetail();
		bankDetail.debitAmt();
		bankDetail.creditAmt();
		bankDetail.creditAmt();
		bankDetail.creditAmt();
		bankDetail.printStatement();
		bankDetail.printCountInfo();
	}
}