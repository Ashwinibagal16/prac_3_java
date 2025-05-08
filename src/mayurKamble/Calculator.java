package mayurKamble;

class Calculator{
	int num1=10;
	int num2=2;
	int total;
	
	void addition(){
		int result=num1+num2;
		System.out.println("Addition of "+num1+" and "+num2+" is "+result);
		total=total+result;
	}
	
	void subtraction(){
		int result=num1-num2;
		System.out.println("Subtraction of "+num1+" and "+num2+" is "+result);
		total=total+result;
	}
	
	void multiplication(){
		int result=num1*num2;
		System.out.println("Multiplication of "+num1+" and "+num2+" is "+result);
		total=total+result;
	}
	
	void division(){
		int result=num1/num2;
		System.out.println("Division of "+num1+" and "+num2+" is "+result);
		total=total+result;
	}
	
	public static void main(String[]args){
		Calculator calculator=new Calculator();	
		calculator.addition();
		calculator.subtraction();
		calculator.multiplication();
		calculator.division();
		System.out.println("The total is "+(calculator.total));
	}
}