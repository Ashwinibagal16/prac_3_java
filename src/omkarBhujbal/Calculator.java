
package omkarBhujbal;

class Calculator{
	int num1 = 50;
	int num2 = 10;
	int total;
	
	void add(){
		int ans = num1+num2;
		System.out.println("Addition of" + num1 + "and" + num2 + "is" + ans);
	    total = total+ans;
	}
	
	void sub(){
		int ans = num1-num2;
		System.out.println("Subsraction of" + num1 + "and" + num2 + "is" + ans);
		total = total+ans;

	}
	
	void multi(){
		int ans = num1*num2;
		System.out.println("Multiplication of" + num1 + "and" + num2 + "is" + ans);
		total = total+ans;

	}
	void div(){
		int ans = num1/num2;
		System.out.println("Division of" + num1 + "and" + num2 + "is" + ans);
		total = total+ans;

	}
	
	public static void main(String[] args){
		Calculator cal = new Calculator();
		cal.add();
		cal.sub();
		cal.multi();
		cal.div();
		System.out.println("Total is " + cal.total);
		
	}
}