package technocredits;

class Example7{
	int x;
	int y;
	
	void processData(){
		x = 10;
		y = 2;
		x = x+y+20;
		y = x + 10;
	}
	
	void display(){
		System.out.println(x + ":" + y);
		x=0;
		y=0;
	}
	
	public static void main(String[] args){
		Example7 ex7 = new Example7();
		ex7.processData();
		ex7.display();
		
		Example7 ex7_1 = new Example7();
		ex7_1.display();
		ex7_1.processData();
		
		System.out.println(ex7_1.y);
	}
}