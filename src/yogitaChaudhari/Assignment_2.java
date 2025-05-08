package yogitaChaudhari;

public class Assignment_2 {
	
		
		int intialBalance=1000;
		
		void debit(){
			intialBalance=intialBalance-500;
		}
		void credit(){
			intialBalance=intialBalance+200;
		}
		void printBalance(){
			
			System.out.println("Total Balance is : "+intialBalance);
		}
		public static void main(String[] args){
			Assignment_2 bank = new Assignment_2();
			bank.debit();
			bank.credit();
			bank.credit();
			bank.printBalance();
			bank.credit();
			bank.printBalance();
			bank.debit();
			bank.printBalance();
			
		}

}

