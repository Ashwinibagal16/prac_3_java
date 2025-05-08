package vidyaPatil;


class MaxNumber{
	
	void getBigNumber(int num1,int num2){
		if (num1>num2){
			System.out.println(num1 + " is bigger between "+ num1 + " and "+ num2);
		}else {
			System.out.println(num2 + " is bigger between "+ num1 + " and "+ num2);
		}
	}
	
	void getSmallNumber(int num1,int num2){
		if (num1<num2){
			System.out.println(num1 + " is smaller between "+ num1 + " and "+ num2);
		}else {
			System.out.println(num2 + " is smaller between "+ num1 + " and "+ num2);
		}
	}
	
	public static void main(String[] args){
		MaxNumber maxNumber = new MaxNumber();
		maxNumber.getBigNumber(10,17);
		maxNumber.getSmallNumber(10,17);
		maxNumber.getSmallNumber(30,15);
		maxNumber.getBigNumber(30,15);
	}
	
}