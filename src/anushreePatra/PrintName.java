package anushreePatra;

class PrintName{
	void namePrint(){
		for(int count=1; count<=5; count++){                   //For Loop
		System.out.println("Anushree" + "  " + count);
	}
		}
	
	public static void main(String[] args){
		PrintName  printName = new PrintName();
		printName.namePrint();
	}

}