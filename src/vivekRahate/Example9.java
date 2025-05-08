package vivekRahate;
class Example9{
	int num1 = 1;
    int num2 = 10;
	static int num3 = 0;
	
	void m1(){
		num1 = num1+10;
		num2 = num2+num1;
		num3 = num2-num1;
	}
	
	void m2(){
		
		num2 = num2-5;
		num3 = num3+num2;
	}
	
	void display(){
		System.out.println(num1 + " :" + num2+" :"+num3);
	}
	public static void main(String args[]){
		Example9 a = new Example9 ();
		a.m1();
		a.m2();
		a.display();
		
		Example9 b = new Example9 ();
		b.m1();
		
		Example9 c = new Example9 ();
		c.m2();
		c.display();
		
	}
}