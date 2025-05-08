package technocredits.returntype;

public class Example2 {

	void processData(int startR, int endR) {
		int count = 0;

		for (int num = startR; num <= endR; num++) {
			if (num % 5 == 0) {
				System.out.println(num);
				count++;
				break;
			} else {
				System.out.println("Hi");
			}
			System.out.println("Hello");
		}
		System.out.println(count);
	}
	
	

	public static void main(String[] args) {
		Example2 example2 = new Example2();
		example2.processData(21, 100);
	}
}
