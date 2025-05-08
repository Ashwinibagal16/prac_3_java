package poojaJoshi;

class Calculator{

	int num1 = 10;
	int num2 = 2;
	int total;
	
	void add(){
		int ans = num1 + num2;
		System.out.println("Addition of " + num1 + " and " + num2 + " is " + ans);
		total=ans+total;
	}
	
	void sub(){
		int ans = num1 - num2;
		System.out.println("Subtraction  of " + num1 + " and " + num2 + " is " + ans);	
		total=ans+total;

	}
	
	void multi(){
		int ans = num1 * num2;
		System.out.println("Multiplication  of " + num1 + " and " + num2 + " is " + ans);
		total=ans+total;

	}
	
	void div(){
		int ans = num1 / num2;
		System.out.println("Div of " + num1 + " and " + num2 + " is " + ans);
				total=ans+total;

	}
		
	public static void main (String args[]){
		Calculator calculator = new Calculator();
		calculator.add();
		calculator.sub();
		calculator.multi();
		calculator.div();
		System.out.println("total is :" +calculator.total);
	}	
}