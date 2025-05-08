package nitinSharma;
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
		System.out.println(x + ":"+ y);
	
	}
	
	public static void main(String[] args){
		Example7 example7 = new Example7();
		example7.processData();
		example7.display();
	
	}

}