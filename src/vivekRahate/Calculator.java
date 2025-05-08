package vivekRahate;
class Calculator{
	int num1=10;
	int num2=2;
	int sum;
	
	void add(){
		int ans= num1+num2;
		System.out.println("Addition of " + num1 + " and " + num2 + " is " + ans );	
		sum = sum+ans;
	}
	
	void substraction(){
		int ans= num1-num2;
		System.out.println("Subraction of " + num1 + " and " + num2 + " is " + ans);
		sum = sum+ans;
	}
	
	void multiple(){
		int ans= num1*num2;
		System.out.println("Multiplication of " + num1 + " and " + num2 + " is " + ans);
		sum = ans;
	}
	
	void divide(){
		int ans= num1/num2;
		System.out.println("Dividition of " + num1 + " and " + num2 + " is " + ans);
		sum = sum+ans;
		
	}
	
	public static void main(String a[]){
		Calculator calculator = new Calculator();
		calculator.add();
		calculator.substraction();
		calculator.multiple();
		calculator.divide();
		
		System.out.println("Total is = " + calculator.sum);
	}

}