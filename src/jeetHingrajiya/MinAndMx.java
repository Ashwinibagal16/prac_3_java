//Assignment 13
package jeetHingrajiya;
public class MinAndMx {
	void minNumber(int num1,int num2) {
		if(num1<num2) {
			System.out.println(num1+ " is Smaller between " +num1+ " and " +num2);
		}
		else {
			System.out.println(num2+ " is Smaller between " +num1+ " and " +num2);
		}
	}
		
	void maximumNumber(int num1,int num2) {
		if(num1>num2) {
			System.out.println(num1+ " is bigger between " +num1+ " and " +num2);
		}
		else {
			System.out.println(num2+ " is bigger between " +num1+ " and " +num2);
		}
	}
	
	public static void main(String[] args) {
		MinAndMx minmax = new MinAndMx();
		minmax.minNumber(10,17);
		minmax.maximumNumber(10,17);
	}
}