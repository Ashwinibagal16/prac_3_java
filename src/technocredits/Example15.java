package technocredits;
class Example15{
	
	void getMaxNumber(int num1, int num2){
		if(num1>num2){
			System.out.println(num1 + " is max from both numbers");
		}else{
			System.out.println(num2 + " is max from both numbers");
		}
	}
	
	public static void main(String[] args){
		Example15 example15 = new Example15();
		int input1 = 55;
		int input2 = 22;
		System.out.println("First number is " + input1);
		System.out.println("Second number is " + input2);
		example15.getMaxNumber(input1,input2);
		System.out.println("------------------------------------");
		input1 = -22;
		input2 = -4;
		System.out.println("First number is " + input1);
		System.out.println("Second number is " + input2);
		example15.getMaxNumber(input1, input2);
		System.out.println("------------------------------------");
		input1 = 22;
		input2 = -43;
		System.out.println("First number is " + input1);
		System.out.println("Second number is " + input2);
		example15.getMaxNumber(input1,input2);
	}
}