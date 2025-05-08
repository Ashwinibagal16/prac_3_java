package technocredits;

class Example6{
	
	int num1; //0
	int num2; //0
	String name; // null
	
	void display(){
		System.out.println(num1 + ":" + num2 + ":" + name);
	}
	
	void updateValue(){
		int input;
		num1 = 100;
		num2 = 200;
	}
	
	public static void main(String[] args){
		Example6 example6 = new Example6();
		example6.display();
	}
}