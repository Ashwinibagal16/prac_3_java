package aniketBalsaraf;

class Example10{
	static int x =10;
	int y=20;
	
	void updateData(){
		x+=10;
		y+=2;
	}
	
	void display(){
		System.out.println(x + " "+ y);
	}
	
	public static void main(String[] args){
		Example10 example10 = new Example10();
		example10.updateData();
		example10.updateData();
		example10.display();
		example10.updateData();
		example10.display();
		
		Example10 example10_1 = new Example10();
		example10_1.updateData();
		example10_1.display();
		example10.display();
	}
}