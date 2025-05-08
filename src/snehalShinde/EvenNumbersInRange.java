package snehalShinde;

class EvenNumbersInRange{

	void evenNumbers(int startIndex, int endIndex){
		System.out.println("Below are even numbers in the range - " + startIndex + " to " + endIndex);
		for(int num = startIndex ; num < endIndex ; num++){
			if (num %2 == 0){
				System.out.println(num);
			}
		}
	}
	
	public static void main (String[] args){
		EvenNumbersInRange evenNumbersInRange = new EvenNumbersInRange();
		evenNumbersInRange.evenNumbers(10,15);
	}
}