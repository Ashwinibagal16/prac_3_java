package umakantSahani;

public class MinMax {
	
	void printMin(int num1,int num2) {
		if(num1 < num2) {
			System.out.println(num1 + " is smaller between " + num1 + " and " + num2);
		} else if(num1 > num2) {
			System.out.println(num2 + " is smaller between " + num1 + " and " + num2);
		}
		else {
			System.out.println(num1 + " and " + num2 + " both are same");
		}
	}
	
	void printMax(int num1,int num2) {
		if(num1 > num2) {
			System.out.println(num1 + " is bigger between " + num1 + " and " + num2);
		} else if(num1 < num2) {
			System.out.println(num2 + " is bigger between " + num1 + " and " + num2);
		}
		else {
			System.out.println(num1 + " and " + num2 + " both are same");
		}
	}
	
	public static void main(String[] args) {
		MinMax minMax = new MinMax();
		minMax.printMin(10, 17);
		minMax.printMax(10, 17);
	}

}
