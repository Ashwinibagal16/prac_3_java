package nitinSharma;
class Example10{
	static int x = 10;
	int y = 20;
	
	void updateData(){
		x = x + 10;
		y = y + 2;
	}
	
	void display(){
		System.out.println(x + ":"+ y);
	}
	
	public static void main(String[] args){
		Example10 ex10 = new Example10();
		ex10.updateData();
		ex10.updateData();
		ex10.display();
		ex10.updateData();
		ex10.display();
		
		Example10 ex11 = new Example10();
		ex11.updateData();
		
		ex11.display();
		ex10.display();
		}
}