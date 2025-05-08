package vivekRahate;
class Example4{
	int num1=10;
	int num2=20;
	
	void processData(){
		num1 = num1+num2;
		num2 = num2+10;	
	}
	void display(){
		System.out.println(num1 + ":"+ num2);
		
	}
	
	public static void main(String a[]){
		Example4 example4_1 = new Example4();
		example4_1.processData();
		example4_1.display();
		Example4 example4_2 = new Example4();
		example4_2.display();
		
	} 
}