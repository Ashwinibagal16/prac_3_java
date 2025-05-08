package technocredits;

class Example11{
	static int count = 0;
	
	void m1(){
		count = count + 1;
	}
	
	public static void main(String[] args){
		Example11 example11_1 = new Example11();
		example11_1.m1();
		example11_1.m1();
		
		
		Example11 example11_2 = new Example11();
		example11_2.m1();
		example11_2.m1();
		example11_2.m1();
		example11_2.m1();
		example11_2.m1();
		
		
		System.out.println(example11_1.count);
		System.out.println(example11_2.count);
		System.out.println(Example11.count);
	}
}