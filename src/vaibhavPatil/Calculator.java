package vaibhavPatil;

class Calculator{
	int num1 = 10;
	int num2 = 2;
	
	void add(){
		System.out.println("Addition of " +num1+ " & " +num2+ " is "+(num1+num2));
	}
	
	void sub(){
		System.out.println("Substraction of " +num1+ " & " +num2+ " is "+(num1-num2));
	}
	
	void mul(){
		System.out.println("Multiplication of " +num1+ " & " +num2+ " is "+(num1*num2));
	}
	
	void div(){
		System.out.println("Division of " +num1+ " & " +num2+ " is "+(num1/num2));
	}
	
	public static void main(String[] args){
		Calculator c = new Calculator();
		c.add();
		c.sub();
		c.mul();
		c.div();
	}
}
