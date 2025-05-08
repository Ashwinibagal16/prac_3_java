package umakantSahani;

class Calculator{

	int num1 = 10;
	int num2 = 2;
	int total;
	
	void add(){
		int answer = num1 + num2;
		System.out.println("Addtion of " + num1 + " and " + num2 + " is " +answer);
		total = total + answer;
	}
	
	void substract(){
		int answer = num1 - num2;
		System.out.println("Subtraction of " + num1 + " and " + num2 + " is " +answer);
		total = total + answer;
	}
	
	void multiply(){
		int answer = num1 * num2;
		System.out.println("Multiplication of " + num1 + " and " + num2 + " is " +answer);
		total = total + answer;
	}
	
	void divide(){
		int answer = num1 / num2;
		System.out.println("Div of " + num1 + " and " + num2 + " is " +answer);
		total = total + answer;
	}
	
	public static void main(String[] args){
		Calculator calculator = new Calculator();
		calculator.add();
		calculator.substract();
		calculator.multiply();
		calculator.divide();
		System.out.println("Total is " + calculator.total);
	}
}