package jayaSahu;

class Calculator{

     int num1 = 10;
	 int num2 = 2;
	 int total;
	 
	 void add (){
		 int ans = num1 + num2;
		 System.out.println("Addition of" + num1 + " and " + num2 + " is "+ ans);
		 total = total+ ans;
		 
	 }
	 
	 void subtraction (){
		 int ans = num1 - num2;
		 System.out.println("Subtraction of" + num1 + " and " + num2 + "is"+ ans);
		 total = total + ans;
	 }
	 
	 void multiplication (){
		 int ans = num1 * num2;
		 System.out.println("Multiplication of" + num1 + " and " + num2 + "is"+ ans);
		 total = total + ans;
	 } 
	 
	 void division (){
		 int ans = num1 / num2;
		 System.out.println("Division of" + num1 + " and " + num2 + "is"+ ans);
		 total = total + ans;
	}
	
	public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.add();
		calculator.subtraction();
		calculator.multiplication();
		calculator.division();
        System.out.println("Total is "+ calculator.total);
		 
    }

  }