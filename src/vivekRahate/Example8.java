package vivekRahate;
class Example8{
	static int x = 10;
	int y = 100;
	
	void proceedData(){
		x = x+1;
		y = y+1;
	}
	
	void display(){
		System.out.println(x +":"+y);
	}
	
	public static void main(String args[]){
		Example8 a = new Example8 ();
		a.proceedData();
		a.display();
		
		Example8 b = new Example8 ();
		b.proceedData();
		b.display();
		
			Example8 c = new Example8 ();
	
		c.display();
	}
}