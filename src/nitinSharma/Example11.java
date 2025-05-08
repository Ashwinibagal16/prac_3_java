package nitinSharma;
class Example11{
	static int count = 0;
	
	void m1(){
		count =  count+1;
	}
	
	void display(){
		System.out.println("Count: "+ count);
	}
	
	public static void main(String[] args){
		Example11 ex1 = new Example11();
		ex1.m1();
		ex1.m1();
		
		Example11 ex2 = new Example11();
		ex2.m1();
		ex2.m1();
		ex2.m1();
		ex2.m1();
		ex2.m1();
		
		ex2.display();
		ex1.display();
		// we can also run using command below
		// Sout(ex1.count);
		//Sout(ex2.count);
		//Sout(Example11.count);
	}
}