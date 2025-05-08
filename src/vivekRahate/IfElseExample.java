package vivekRahate;
class IfElseExample{
	int num = 10;
	
	void isNumberValid(){
		if(num>=0)
			System.out.println(num + " is valid number");
		
		else
			System.out.println(num + " not is valid number");
			System.out.println("Programme End");
	}
	
	public static void main(String a[]){
		IfElseExample ifelseexample = new IfElseExample();
		ifelseexample.isNumberValid();
	}
	
}