package poojaJoshi;

class Assignment15{
	
	void displayNumbers(int startNum, int endNum){
		System.out.println("Divisible by 5 & 3, numbers are: ");
		for (int i= startNum; i<=endNum; i++)
			if (i % 3 == 0 & i % 5 == 0){
				System.out.println(i);
			}
	}
	
	public static void main(String[]args){
		Assignment15 num = new Assignment15();
		num.displayNumbers(5,40);
	}
}