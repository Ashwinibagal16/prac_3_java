package technocredits;

class Example10{
	int x = 10;
	int y = 20;

	void updateData(){
		x = x + 10;
		y = y + 2;
	}
	
	void display(){
		System.out.println(x + ":" + y);
	}
	
	public static void main(String[] args){
		Example10 ex10 = new Example10();
		ex10.updateData();
		ex10.updateData();
		ex10.display();
		ex10.updateData();
		ex10.display();
		
		Example10 ex10_1 = new Example10();
		ex10_1.updateData();
		
		ex10_1.display(); //
		ex10.display(); //
		
	}
}