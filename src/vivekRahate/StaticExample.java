package vivekRahate;
class StaticExample {
	int x = 10;
	int y = 20;
	
	void updateData(){
		x = x+10;
		y = y+2;
	}
	
	void display(){
		System.out.println(x + ":" + y);
	
	}
	public static void main(String args[]){
		StaticExample staticexample = new StaticExample();
		staticexample.updateData();
		staticexample.updateData();
		staticexample.display();
		staticexample.updateData();
		staticexample.display();
		
		StaticExample staticexample1	 = new StaticExample();
		staticexample1.updateData();
		staticexample1.display();
		staticexample.display();
		
	
	}
}

