//A-13
package nishmita;
public class Number {

	void maximumNumber(int num1, int num2) {
		if(num1 > num2) {
			System.out.println(num1+" is bigger between "+ num2);
		}else {
			System.out.println(num2+" is bigger between "+ num1);	
		}
	}

	void mininumNumber(int num1, int num2) {
		if(num1 < num2) {
			System.out.println(num1+" is smaller than "+num2);
		}else {
			System.out.println(num2+" is smaller than "+num1);
		}
	}

	public static void main(String[] args) {
		Number num = new Number();
		num.maximumNumber(10, 8);
		num.mininumNumber(50, 1);
	}

}