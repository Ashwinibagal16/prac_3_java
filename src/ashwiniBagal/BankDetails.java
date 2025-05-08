package ashwiniBagal;

class BankDetails{
    int initAmount;
	
	void initial(){
	    initAmount = 8000;
		System.out.println("Balance has initialized with" + initAmount + "rs..");
	}
	
	void credit(){
	    initAmount = initAmount +300;
		System.out.println(300 + "rs has been credited");
	}
  
    void debit(){
	    initAmount = initAmount +300;
		System.out.println(300 + "rs has been debited");
	}
	
	void display(){
		System.out.println("Balance has been initialized with" + initAmount + "rs." );
	}
	
	public static void main(String[] args){
	    BankDetails bankdetails = new BankDetails();
		bankdetails.initial();
		bankdetails.credit();
		bankdetails.debit();
		bankdetails.display();
	}
	
}
  
  
  