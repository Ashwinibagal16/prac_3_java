package tejasKurhade;

class Example11{
	static int count = 0;
	void m1(){
		count++;
	}
	void display(){
		//System.out.prinln("count " + count);
		System.out.println(" count " + count );
	}	
	public static void main(String[] args){
		Example11 example11 = new Example11();
		example11.m1();
		example11.m1();
		example11.m1();
		example11.display();
	}
}
	