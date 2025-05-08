package nitinSharma;
class Example8{
	static int x = 10;
	int y = 100;
	
	void processData(){
		x = x+1;
		y = y+1;
	}
	
	void display(){
		System.out.println(x + ":" + y);
	}
	
	public static void main(String[] args){
		Example8 ex8_1= new Example8();
		ex8_1.processData();
		ex8_1.display();
		
		Example8 ex8_2= new Example8();
		ex8_2.processData();
		ex8_2.display();
		
		Example8 ex8_3= new Example8();
		ex8_3.display();
		}
}