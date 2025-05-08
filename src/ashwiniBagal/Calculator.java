package ashwiniBagal;

class Calculator{
   int num1 = 10;
   int num2 = 2;
    
   void add(){
        int ans =num1+num2;
		System.out.println("Addition of " + num1 + "and" +num2 + "is " +ans);
	}
	void sub(){
        int ans =num1-num2;
		System.out.println("Subtraction of " + num1 + "and" +num2 + "is " +ans);
	}
	void Div(){
        int ans = num1 / num2;
		System.out.println("Division of " + num1 + "and" +num2 + "is " +ans);
	}
	void Mult(){
        int ans = num1 * num2;
		System.out.println("Multiplication of " + num1 + "and" +num2 + "is " +ans);
	}
	public static void main(String[] args){
	  Calculator cal = new Calculator();
      cal.add();
	  cal.sub();
	  cal.Div();
	  cal.Mult();
	}
}	