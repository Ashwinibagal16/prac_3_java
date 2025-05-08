//A-14&15
package nishmita;
class EvenNumbers {
	void FindEvenNumbers(int start, int end) {
		System.out.println("Even numbers are:");
		for(int num = start; num <= end; num++) {
			if(num%2 == 0) {
				System.out.println(num);
		    }
	    }
    }

	public static void main(String[] args) {
		EvenNumbers evenNumber = new EvenNumbers();
		evenNumber.FindEvenNumbers(10, 15);
		evenNumber.FindEvenNumbers(1, 20);
	}
}