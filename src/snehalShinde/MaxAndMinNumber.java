package snehalShinde;

class MaxAndMinNumber{
	
	void maxNumbers(int num1, int num2){
		if (num1 == num2){
			System.out.println("The given two numbers are : " + num1 + " and " + num2);
			System.out.println("Both are same numbers.");
		}else if(num1 > num2){
			System.out.println("The given two numbers are : " + num1 + " and " + num2);
			System.out.println(num1 + " is the bigger number in between " + num1 + " and " + num2);
			System.out.println("---------------------------------------------");			
		}else{
			System.out.println("The given two numbers are : " + num1 + " and " + num2);
			System.out.println(num2 + " is the bigger number in between " + num1 + " and " + num2);
			System.out.println("---------------------------------------------");	
		}
	}
	
	void minNumbers(int num3, int num4){
		if (num3 == num4){
			System.out.println("The given two numbers are : " + num3 + " and " + num4);
			System.out.println("Both are same numbers.");
		}else if(num3 < num4){
			System.out.println("The given two numbers are : " + num3 + " and " + num4);
			System.out.println(num3 + " is the smaller number in between " + num3 + " and " + num4);
			System.out.println("---------------------------------------------");			
		}else{
			System.out.println("The given two numbers are : " + num3 + " and " + num4);
			System.out.println(num4 + " is the smaller number in between " + num3 + " and " + num4);
			System.out.println("---------------------------------------------");	
		}
	}
	
	public static void main (String[] args){
		MaxAndMinNumber maxAndMinNumber = new MaxAndMinNumber();
		maxAndMinNumber.maxNumbers(10,17);
		maxAndMinNumber.minNumbers(10,17);
		maxAndMinNumber.maxNumbers(10,10);
	}
}	






