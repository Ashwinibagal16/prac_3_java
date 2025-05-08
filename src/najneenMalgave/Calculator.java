package najneenMalgave;

class Calculator{
	int num1 = 10;
	int num2 = 2;
	int add;
	int sub;
	int mul;
	int div;
	
	void Addition(){
		add = num1 + num2;
		System.out.println("Add of num1 + num2 = " + add);
	}
	
	void Substraction(){
		sub = num1 - num2;
		System.out.println("Sub of num1 - num2 = " + sub);
	}
	
	void Multiplication(){
		mul = num1 * num2;
		System.out.println("Mul of num1 * num2 = " + mul);
	}
	
	void Division(){
		div = num1 / num2;
		System.out.println("Div of num1 / num2 = " + div);
	}
	
	void PrintTotal(){
		System.out.println("Total of all = " +(add+sub+mul+div));
	}
	
	public static void main (String[] args){
		Calculator Calculator = new Calculator();
		Calculator.Addition();
		Calculator.Substraction();
		Calculator.Multiplication();
		Calculator.Division();
		Calculator.PrintTotal();
	}
}
		