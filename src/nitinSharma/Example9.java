package nitinSharma;
class Example9{
	int num1 = 1;
	int num2 = 10;
	static int num3=0;
	
	void m1(){
		num1 = num1 + 10;
		num2 = num2 + num1;
		num3 = num2-num1;
	}
	
	void m2(){
		num2 = num2-5;
		num3 = num3 + num2;
	
	}
	
	void printData(){
		System.out.println(num1 + ":"+ num2+":"+ num3);
	}
	
	public static void main(String[] args){
		Example9 ex9_1= new Example9();
		ex9_1.m1();
		ex9_1.m2();
		ex9_1.printData();
		
		Example9 ex_2 = new Example9();
		ex_2.m1();
		
		Example9 ex_3 = new Example9();
		ex_3.m2();
		ex_3.printData();
	}
}