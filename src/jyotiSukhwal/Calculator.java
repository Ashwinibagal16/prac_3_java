package jyotiSukhwal;

class Calculator{
	int num1 = 10;
	int num2 = 2;
	int total;
	
	void add(){
		int ans = num1 + num2;
		System.out.println("Addition of " + num1 +" and " + num2 + " is: " + ans);
		total = total + ans;
	}
	
	void sub(){
		int ans = num1 - num2;
		System.out.println("Substraction of " + num1 +" and " + num2 + " is: " + ans);
		total = total + ans;
	}
	
	void multiply(){
		int ans = num1 * num2;
		System.out.println("Multiplication of " + num1 +" and " + num2 + " is: " + ans);
		total = total + ans;
	}
	
	void division(){
		int ans = num1 / num2;
		System.out.println("Division of " + num1 +" and " + num2 + " is: " + ans);
		total = total + ans;
	}
	
	public static void main(String args[]){
		Calculator calculator = new Calculator();
		calculator.add();
		calculator.sub();
		calculator.multiply();
		calculator.division();
		System.out.println("Total is " + calculator.total);
	}
	
} 