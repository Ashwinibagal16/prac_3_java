package vivekDhole;

class Assignment14 {

	void evenNumber() {

		for(int count = 10; count <= 15; count++) {

			if(count % 2 == 0) {

				System.out.println(count);
			}
		}	
	}	

	public static void main(String[] args) {
		Assignment14 assignment14 = new Assignment14();
		System.out.println("Even numbers between 10 and 15 are ");
		assignment14.evenNumber();
	}
}