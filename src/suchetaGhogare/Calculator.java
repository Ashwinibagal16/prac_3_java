package suchetaGhogare;

class Calculator{
	
	int num1 = 10;
	int num2 = 2;
	int total;

	void add(){
		int ans = num1 + num2;
		total = total + ans;
		System.out.println("Addition of "+num1+" and "+num2+" is: " +ans);
	}

	void subtract(){
		int ans = num1 - num2;
		total = total + ans;
		System.out.println("Subtraction of "+num1+" and "+num2+" is: " +ans);
	}

	void multiply(){
		int ans = num1*num2;
		total = total + ans;
		System.out.println("Multiplication of "+num1+" and "+num2+" is: " +ans);
	}

	void divide(){
		int ans = num1/num2;
		total = total + ans;
		System.out.println("Division of "+num1+" and "+num2+" is: " +ans);
	}

	public static void main(String[] args){
		Calculator calculator = new Calculator();
		calculator.add();
		calculator.subtract();
		calculator.multiply();
		calculator.divide();
		System.out.println("Total is: "+calculator.total);
	}
}