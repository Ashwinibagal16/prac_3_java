package tejasKurhade;

class Example{

	int num1 = 10;
	int num2 = 20;
	
	void updateNum(){
		num1 = num1 + num2; 
		num2 = num2 + 10;
	}
	
	void display(){
		System.out.println("sum is:" +num1 + num2);
	}
	
	public static void main(String[] args){
	
		Example example = new Example();
		Example example2 = new Example();
		example.updateNum();
		example.display();
		example2.display();
		
	}
}