package tejasKurhade;

class Calculator{
	
	int num1 = 10;
	int num2 = 2;
	int allSum;
	
	void add(){
		int sum = num1 + num2;
		System.out.println("Addition of "+num1+" and "+ num2+ " is "+sum);
		allSum = allSum + sum;
	}
	
	void sub(){
		int sub = num1 - num2;
		System.out.println("subtraction of "+num1+" and "+ num2+ " is "+sub);
		allSum = allSum + sub;
	}
	
	void mult(){
		int mult = num1*num2;
		System.out.println("multiplication of "+num1+" and "+ num2+ " is "+mult);
		allSum = allSum + mult;
	}
	
	void div(){
		int div = num1 / num2;
		System.out.println("division of "+num1+" and "+ num2+ " is "+div);
		allSum = allSum + div;
	}
	
	void allSum(){
		System.out.println("Total is :" + allSum);
	}
	
	public static void main(String[] args){
		Calculator calculator = new Calculator();
		calculator.add();
		calculator.sub();
		calculator.mult();
		calculator.div();
		calculator.allSum();
}

}