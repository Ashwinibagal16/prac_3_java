package najneenMalgave;

class MaxMin{
	
	void maxNumber(int num1, int num2){
		if(num2 > num1){
			System.out.println(num2 + " is bigger between "+ num1 + " and " +num2);
		}
	}
		
	void minNumber(int num1, int num2){
		if(num1 < num2){
			System.out.println(num1 + " is smaller between "+ num1 + " and " +num2);
		}
	}
	
	public static void main(String[] args){
		MaxMin maxMin = new MaxMin();
		maxMin.maxNumber(10,17);
		maxMin.minNumber(10,17);
	}
}