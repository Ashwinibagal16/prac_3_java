package omkarBhujbal;

public class Assignment14 {
	void evenNumber() {
		for(int count = 10 ; count <= 15 ; count ++) {
			if (count % 2==0) {
				System.out.println(count + " is an Even number ");
			}
		}
	}
	public static void main(String[] args) {
		Assignment14 assign14 = new Assignment14();
		System.out.println("\n Even numbers are \n");

		assign14.evenNumber();
	}
}
