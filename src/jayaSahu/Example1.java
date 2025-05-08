package jayaSahu;

class Example1{
	
	int num1 = 10;
	int num2 = 20;
	
	void processData(){
		num1 = num1+num2;
		num2 = num2+10;
    }
	
	void display (){
		System.out.println(num1 + ":" +num2);
		
	}
	
	public static void main(String[] args){
		Example1 example1_1 = new Example1();
		Example1 example1_2 = new Example1();
		example1_1.display();
		example1_2.display();
			
	}

}