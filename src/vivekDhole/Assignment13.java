package vivekDhole;

class Assignment13 {

	void maxNumber(int num1, int num2) {

		if(num1 > num2) {

			System.out.println(num1 + " is larger number between " + num1 + " and " + num2 );

		}else {

			System.out.println(num2 + " is larger number between " + num1 + " and " + num2 );
		}
	} 

	void minNumber(int num1, int num2) {

		if(num1 < num2) {

			System.out.println(num1 + " is smaller number between " + num1 + " and " + num2 );

		}else {

			System.out.println(num2 + " is smaller number between " + num1 + " and " + num2 );

		}	
	}
	
	
	public static void main(String[] args) {
		Assignment13 numberorder = new Assignment13();
		numberorder.maxNumber(10,17);
		numberorder.minNumber(10,17);
	}
}	
