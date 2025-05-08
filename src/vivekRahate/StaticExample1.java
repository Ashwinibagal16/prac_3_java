package vivekRahate;
class StaticExample1 {
	static int count = 0;
	
	void m1(){
		count = count + 1;
	}
	
	void display(){
		System.out.println(count);
	
	}
	public static void main(String args[]){
		StaticExample1 s = new StaticExample1();
		s.m1();
		s.m1();
		s.display();//
		
		StaticExample1 s1 = new StaticExample1();
		s1.m1();
		s1.m1();
		s1.m1();
		s1.m1();
		s1.m1();
		s1.display();//
		
		System.out.println(StaticExample1.count);
	
	}
}

