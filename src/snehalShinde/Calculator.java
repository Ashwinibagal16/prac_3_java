package snehalShinde;

class Calculator{
	
	int num1=10;
	int num2=2;
	int total;
	
	void addition(){
		int add = num1+num2;
		System.out.println("Addition of " + num1 + " and " + num2 + " is " + add);
		total=total+add;
	}
	
	void subtraction(){
		int sub = num1-num2;
		System.out.println("Subtraction of " + num1 + " and " + num2 + " is " + sub);
		total=total+sub;
	}
	
	void multiplication(){
		int multi = num1*num2;
		System.out.println("Multiplication of " + num1 + " and " + num2 + " is " + multi);
		total=total+multi;
	}
	
	void division(){
		int div = num1/num2;
		System.out.println("Division of " + num1 + " and " + num2 + " is " + div);
		total=total+div;
	}
	
	public static void main(String[] args){
		Calculator calculator = new Calculator();
		calculator.addition();
		calculator.subtraction();
		calculator.multiplication();
		calculator.division();
		System.out.println("Total is: " + calculator.total);
	}
}