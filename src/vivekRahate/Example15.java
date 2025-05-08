package vivekRahate;
class Example15{
	void getMaxNumber(int num1,int num2){
		if(num1>num2){
			System.out.println("num1 is max");
		}
		else{
			System.out.println("num2 is max");
		}
		
	}
	
	public static void main(String a[]){
		Example15 example15 = new Example15();
		int input1 = 100;
		int input2 = 20;
		
		System.out.println(input1);
		System.out.println(input2);
		
		example15.getMaxNumber(input1,input2);
		example15.getMaxNumber(45,60);
			
	}
}