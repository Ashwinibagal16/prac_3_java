package yogitaChaudhari;

public class Assignment_3 {
	
		
		int debitCount;
		int creditCount;
		int printStatementCall;
		static int totalDebitCount;
		static int totalCreditCount;
		static int totalPrintStatementCount;
		
		void debitAmt (){
			
			debitCount++;
			totalDebitCount++;
			
		}
		void creditAmt (){
			
			creditCount++;
			totalCreditCount++;
		}
		void printStatement (){
			printStatementCall = printStatementCall+1;
			totalPrintStatementCount++;
		}
		void printcountInfo (){
			
			System.out.println("Print Debitcount : " + debitCount);
			System.out.println("Print Craeditcount :  " + creditCount);
			
		}
		
		public static void main(String[] args){
			Assignment_3 bankDetails = new Assignment_3();
			bankDetails.debitAmt();
			bankDetails.creditAmt();
			bankDetails.debitAmt();
			bankDetails.printStatement();
			bankDetails.printcountInfo();
			Assignment_3 bankDetails_1 = new Assignment_3();
			bankDetails_1.creditAmt();
			bankDetails_1.creditAmt();
			bankDetails_1.printStatement();
			bankDetails_1.printcountInfo();
			System.out.println("Total Debit count : "+ Assignment_3.totalDebitCount);
			System.out.println("Total Creadit count : "+ Assignment_3.totalCreditCount);
			System.out.println("Total Print Statement count : "+ Assignment_3.totalPrintStatementCount);
		}
		
	
}
