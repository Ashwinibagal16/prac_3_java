package tejasKurhade;

class myBank{

	static int count;
	int bal = 1000;
	
	void credit(){
		count +=1;
		bal = bal + 500;
	}
		
	void debit(){
		count +=1;
		bal = bal - 10;
	}
	
	void displayBal(){
		System.out.println(bal + " count " + count );
	}
	
	public static void main(String[] args){
		myBank mb_1 = new myBank();
		mb_1.credit();
		mb_1.credit();
		mb_1.credit();
		mb_1.debit();
		mb_1.debit();
		mb_1.displayBal();
		
		myBank mb_2 = new myBank();
		mb_2.debit();
		mb_2.debit();
		mb_2.debit();
		mb_2.debit();
		mb_2.debit();
		mb_2.displayBal();
	}
}
		
		
		
		
		
		