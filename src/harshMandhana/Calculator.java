package harshMandhana;

class Calculator
{
	int num1 = 10;
	int num2 = 2;
	int add;
	int sub;
	int mul;
	int div;
	
	void addition()
	{
		add = num1+num2;
		System.out.println("Addition of " +num1+ " and " + num2 +" is "+ add);
	}
	
	void subtraction()
	{
		sub= num1-num2;
		System.out.println("Subtraction of " +num1+ " and " + num2 +" is "+ sub);
	}
	
	void multiplication()
	{
		mul = num1*num2;
		System.out.println("Multiplication of " +num1+ " and " + num2 +" is "+ mul);
	}
	
	void division()
	{
		div = num1/num2;
		System.out.println("Div of " +num1+ " and " + num2 +" is "+ div);
	}
	
	void total()
	{
		System.out.println("Total is: "+(add+sub+mul+div));
	}
	
	public static void main(String args[])
	{
		Calculator calculator = new Calculator();
		calculator.addition();
		calculator.subtraction();
		calculator.multiplication();
		calculator.division();
		calculator.total();
	}
}