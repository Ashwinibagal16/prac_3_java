package priyankaZende;
class Calculator{
	
	int num1 =10;
	int num2 =2;
	int totalAns;
	
	void addition(){
		int ans = num1 + num2;
		System.out.println("Addition of "+ num1+" "+" and "+num2+" is: "+ans);
		totalAns = totalAns + ans;
	}
		
	void substraction(){
		int ans = num1 - num2;
		System.out.println("Substraction of "+ num1+" "+" and "+num2+" is: "+ans);
		totalAns = totalAns + ans;
	}

	void multiplication(){
		int ans = num1 * num2;
		System.out.println("Multiplication of "+ num1+" "+" and "+num2+" is: "+ans);
		totalAns = totalAns + ans;
	}

	void division(){
		int ans = num1/num2;
		System.out.println("Division of "+ num1+" "+" and "+num2+" is: "+ans);
		totalAns = totalAns + ans;
	}
	
	void printTotalAns(){
		System.out.println("Total ans is: "+ totalAns);
	}	

	public static void main(String[] args){
		Calculator calculator = new Calculator();
		calculator.addition();
		calculator.substraction();
		calculator.multiplication();
		calculator.division();
		calculator.printTotalAns();
	}
}	