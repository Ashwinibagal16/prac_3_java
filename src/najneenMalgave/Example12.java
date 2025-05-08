package najneenMalgave;

class Example12{
	int num1;
	int num2;
	
	void processData(int temp){
		num1=num1-100;
		int output = num1 + num2 - temp;
		num1 = output;
		num2 = num2 + output + 100;
		System.out.println(output); //-25
	}
	
	void display(){
		System.out.println(num1 + ":" + num2); // -25:75
	}
	
	public static void main(String[] args){
		Example12 example12 = new Example12();
		example12.processData(25);
		example12.display();
		
		Example12 example12_1 = new Example12();
		example12_1.display();
	}
}
