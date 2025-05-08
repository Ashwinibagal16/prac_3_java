package rituDhiagra;

class Calculator{
   int num1= 10;
   int num2= 2;
   
   void add(){
	   int ans = num1 + num2;
	   System.out.println("Addition of " + num1 + " and " + num2 + " is: " + ans);
	}

    void subtract(){
	   int ans = num1 - num2;
	   System.out.println("Subtraction of " + num1 + " and " + num2 + " is: " + ans);
	}
	
	void multiply(){
	   int ans = num1 - num2;
	   System.out.println("multiplication of " + num1 + " and " + num2 + " is: " + ans);
	}   
	   
	public static void main(String[] args){	
	   Calculator calculator = new Calculator();
	   calculator.add();
	   calculator.subtract();

	}
}
