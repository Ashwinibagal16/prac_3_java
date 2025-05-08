package nitinSharma;
//find even numbers between 10-15
public class EvenNumbers {
	
	void FindEvenNumbers(int start, int end) {
		for(int num = start; num <= end; num++) {
			if(num%2 == 0) {
				System.out.println(num + " is an even number");
			}
		}
	}
	
	public static void main(String[] args) {
		EvenNumbers evenNumber = new EvenNumbers();
		evenNumber.FindEvenNumbers(10, 15);
		System.out.println("----------------------------");
		evenNumber.FindEvenNumbers(1, 20);
	}
}
