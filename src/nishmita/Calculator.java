package nishmita;

class Calculator{
	int num1 = 10;
	int num2 = 2;
	int total;
	
	void add(){
		int add = num1 + num2;
		System.out.println("Addition of " + num1 + " and " + num2 + " is " + add); 
		total = total + add;
	}
	
	void sub(){
		int ans = num1 - num2;
		System.out.println("Sub of " + num1 + " and " + num2 + " is " + ans); 
		total = total + ans;
	}
	
	public static void main(String[] args){
		Calculator calculator = new Calculator();
		calculator.add();
		calculator.sub();
		System.out.println("Total is " + calculator.total);
	}
}