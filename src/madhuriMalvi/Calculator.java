package madhuriMalvi;

class Calculator{
	int num1 = 10;
	int num2 = 2;
	int total = 0;
	
	void add(){
	  int ans = num1 + num2;
	  System.out.println("Addition of " + num1 +" and " + num2 +" is " + ans);
	}
	
	void subtraction(){
	  int ans = num1 - num2;
	  System.out.println("Addition of " + num1 +" and " + num2 +" is " + ans);
	}
	void mul(){
	  int ans = num1 * num2;
	  System.out.println("Addition of " + num1 +" and " + num2 +" is " + ans);
	}
	void division(){
	  int ans = num1 / num2;
	  System.out.println("Addition of " + num1 +" and " + num2 +" is " + ans);
	}
	//void display(){
	   //int total=0;
	  // System.out.println("Total is " + total);
	public static void main(String[] args){
	Calculator calculator = new Calculator();
	 calculator.add();
	 calculator.subtraction();
     calculator.mul();
     calculator.division();
	 //calculator.total;
	 System.out.println("Total is " + calculator.total);
	}
}