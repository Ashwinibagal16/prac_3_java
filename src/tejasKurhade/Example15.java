package tejasKurhade;
class Example15{
	void getMaxNumber(int num1, int num2){
		if (num1>num2){
			System.out.println("input1 " + num1 + "is greater than " + num2);
		}else {
			System.out.println("input2 is greater" +num2);
	}
	}
	public static void main(String[] args){
		Example15 example15 = new Example15();
		int input1 = 30;
		int input2  = 50;
		
		example15.getMaxNumber(input1,input2);
		
	}
}
