package anushreePatra;

class PrintTwoNumber{
	
	void maximumNumber(int num1, int num2){
		if(num1<num2){
			System.out.println(num1 + " smaller between 10 and 17.");
		}else{
			System.out.println(num2 + " bigger between 10 and 17.");
		}
	}
	
	void minimumNukmber(int num1, int num2){
		if(num1>num2){
			System.out.println(num1 + " smaller between 10 and 17.");
		}else{
			System.out.println(num2 + " bigger between 10 and 17.");
		}
	}
	
	public static void main(String[] args){
	PrintTwoNumber printtwonumber = new PrintTwoNumber();
	printtwonumber.maximumNumber(10,17);
	printtwonumber.minimumNukmber(10,17);
	}
}