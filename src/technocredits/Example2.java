package technocredits;

class Example2{
	int num = 10;
	
	void updateNum(){
		int num;
		num = 0;
		num = num + 10;
		System.out.println(num + " ");
	}
	
	void display(){
		System.out.println(num + " ");
	}
	
	public static void main(String[] args){
		Example2 example2 = new Example2();
		//example2.display();
		example2.updateNum();
		//example2.display();
		example2.updateNum();
		example2.updateNum();
		example2.updateNum();
		//example2.display();
	}
}
