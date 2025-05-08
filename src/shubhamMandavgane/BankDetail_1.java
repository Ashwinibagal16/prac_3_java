package shubhamMandavgane;
class BankDetail_1{
   int debitCount, creditCount, printStatementCount;
   static int totalDebitCount, totalCreditCount, totalPrintStatementCount;
   
   void debitAmt(){
        debitCount = debitCount +1;
	    totalDebitCount = totalDebitCount +1;
	}
	
	void creditAmt(){
	      creditCount = creditCount+1;
		  totalCreditCount = totalCreditCount +1;
	}
	
	void printStatement(){
	     printStatementCount = printStatementCount + 1; 
	     totalPrintStatementCount = totalPrintStatementCount + 1;
	}
   
    void countInfo(){
         System.out.println("debit method call count " + debitCount);
		 System.out.println("credit method call count " + creditCount);
		 System.out.println("printstatment method call count " + printStatementCount);
	 }	
		
	void totalCountInfo(){
	     System.out.println("total debit Operations " + totalDebitCount);
		 System.out.println("total credit Operations " + totalCreditCount);
		 System.out.println("total printstatement Operations " + totalPrintStatementCount);
	}
	
	public static void main(String[] args){
	       BankDetail_1 bankDetail_1 = new BankDetail_1();
		       bankDetail_1.debitAmt();
			   bankDetail_1.creditAmt();
			   bankDetail_1.creditAmt();
			   bankDetail_1.creditAmt();
			   bankDetail_1.printStatement();
			   bankDetail_1.countInfo();
			   
		   BankDetail_1 bankDetail_2 = new BankDetail_1();
		       bankDetail_2.creditAmt();
			   bankDetail_2.printStatement();
			   bankDetail_2.printStatement();
			   bankDetail_2.printStatement();
			   bankDetail_2.countInfo();
			   bankDetail_2.totalCountInfo();
			
			   
	}
   
  
  
}