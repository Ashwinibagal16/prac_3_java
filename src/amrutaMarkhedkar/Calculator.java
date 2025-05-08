package amrutaMarkhedkar;

class Calculator{
	int num1 =10;
	int num2 = 2;
	int ansAdd;
	int ansSub;
	int ansMul;
	int ansDiv;
	
	void add(){
		ansAdd = num1 + num2;
		System.out.println("Addition of "+ num1 + " and " +num2 + " is "+ ansAdd); 
	}
	
	void sub(){
		ansSub = num1 - num2;
		System.out.println("Subtraction of "+ num1 + " and " +num2 + " is "+ ansSub); 
	}
	
	void mul(){
		ansMul = num1 * num2;
		System.out.println("Multiplication of "+ num1 + " and " +num2 + " is "+ ansMul); 
	}
	
	void div(){
		ansDiv = num1 / num2;
		System.out.println("Division of "+ num1 + " and " +num2 + " is "+ ansDiv); 
	}
	
	void total(){
		System.out.println("Total is "+ (ansAdd+ansSub+ansMul+ansDiv)); 
	}
	
	public static void main(String [] args){
		Calculator calculator = new Calculator();
		calculator.add();
		calculator.sub();
		calculator.mul();
		calculator.div();
		calculator.total();
	}
}