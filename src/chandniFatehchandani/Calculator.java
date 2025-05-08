/* Write a program for calculator having add, sub, mul, div operation.
output :
Addtion of 10 and 2 is 12
Subtraction of 10 and 2 is 8
Multiplication of 10 and 2 is 20
Div of 10 and 2 is 5
Total of all output */
package chandniFatehchandani;

class Calculator{
	int num1 = 10;
	int num2 = 2;
	int total;
	
	void add(){
		int ans = num1 + num2;
		System.out.println("Addition of " + num1 +" and " + num2 +" is " + ans);
		total = total+ans;
	}
	
	void subtract(){
		int ans = num1 - num2;
		System.out.println("Subtraction of " + num1 + " and " + num2 +" is "+ ans);
		total = total+ans;
	}
	
	void multiplication(){
		int ans = num1 * num2;
		System.out.println("Multiplication of " + num1 + " and " + num2 +" is "+ ans);
		total = total+ans;
	}
	
	void division(){
		int ans = num1/num2;
		System.out.println("Division of " + num1 + " and " + num2 +" is "+ ans);
		total = total+ans;
	}
	
	public static void main (String[] args){
		Calculator C = new Calculator();
		C.add();
		C.subtract();
		C.multiplication();
		C.division();
		System.out.println("Total of all the answers is : " + C.total);
	}

}