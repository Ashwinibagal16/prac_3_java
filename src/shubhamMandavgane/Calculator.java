package shubhamMandavgane;
class Calculator{
  int num1 = 10;
  int num2 = 2;
  
  void add(){
    int total = num1 + num2;
    System.out.println("Addtion of " + num1 + " and " + num2 + " is " + total);	
  }
  
  void subtract(){
    int total = num1 - num2;
	System.out.println("Subtraction of " + num1 + " and " + num2 + " is " + total);
  }
  
  void multiply(){
    int total = num1*num2;
	System.out.println("multiplication of " + num1 + " and " + num2 + " is " + total);
  }
  
  void div(){
    int total = num1/num2;
	System.out.println("Division of " + num1 + " and " + num2 + " is " + total);
  }
  
  public static void main (String[] args){
              Calculator calculator = new Calculator();
			  calculator.add();
			  calculator.subtract();
			  calculator.multiply();
			  calculator.div();
			  
			  
  }
  
}