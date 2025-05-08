package pratikWaghmare;
class Calculator{

	int num1 = 10;
	int num2 = 2;
	int total;
	
	void addition(){
		int ans = num1 + num2;
		System.out.println("Addition of " + num1 + " and " + num2 +" is " + ans);
		total = total + ans;
	}
	
	void subtraction(){
		int ans = num1 - num2;
		System.out.println("Subtraction of " + num1 + " and " + num2 + " is " + ans);
		total = total + ans;
	}

	void multiplication(){
		int ans = num1 * num2;
		System.out.println("Multiplication of " + num1 + " and " + num2 + " is " + ans);
		total = total + ans;
	}
	
	void divison(){
		int ans = num1 / num2;
		System.out.println("Divison of " + num1 + " and " + num2 + " is " + ans);
		total = total + ans;
	}
	
	void total(){
		System.out.println("Total of all operation is "+ total);
	}
	
	public static void main(String[] args){
		Calculator calculator = new Calculator();
		calculator.addition();
		calculator.subtraction();
		calculator.multiplication();
		calculator.divison();
		calculator.total();
		
	}
}