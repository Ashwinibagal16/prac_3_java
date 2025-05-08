package pankajMiniyar;
class Calculator{
	int num1=10;
	int num2=2;
	int total;
	
	void addition(){
		int ans=num1+num2;
		System.out.println("Addition of "+ num1+ " and " + num2+ " is "+ans);
		total=total+ans;
	}
	
	void substraction(){
		int ans =num1-num2;
		System.out.println("substraction of "+ num1 +" and " + num2+ " is "+ans);
		total=total+ans;
	}
	
	void multiplication(){
		int ans=num1*num2;
		System.out.println("multiplication of "+ num1 +" and " + num2+ " is "+ans);
		total=total+ans;
	}
	
	void division(){
		int ans=num1/num2;
		System.out.println("division of "+ num1 +" and " + num2+ " is "+ans);
		total=total+ans;
	}
	
	public static void main(String[] args){
		Calculator calculator=new Calculator();
		calculator.addition();
		calculator.substraction();
		calculator.multiplication();
		calculator.division();
		System.out.println("Total is " + calculator.total);
	}	
}