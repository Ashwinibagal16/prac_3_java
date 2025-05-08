package krupa;

public class FindMaxMinNumber {
	
	void printMaxNum(int num1, int num2) {
		if(num1>num2) {
			System.out.println(num1 + " is bigger between " + num1 + " and " + num2);
		} else {
			System.out.println(num2 + " is bigger between " + num1 + " and " + num2);
		}
	}
	
	void printMinNum(int num1, int num2) {
		if(num1<num2) {
			System.out.println(num1 + " is smaller between " + num1 + " and " + num2);
		} else {
			System.out.println(num2 + " is smaller between " + num1 + " and " + num2);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindMaxMinNumber findNumber = new FindMaxMinNumber();
		findNumber.printMaxNum(10, 17);
		findNumber.printMinNum(10, 17);

	}

}
