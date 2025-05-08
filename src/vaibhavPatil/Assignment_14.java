package vaibhavPatil;

public class Assignment_14 {

	void evenNum(int startIndex, int endIndex) {
		System.out.println("Even numbers are");
		for(int i= startIndex; i<=endIndex; i++) {
			if(i%2==0) {
				System.out.println(i);
			}
			
		}
	}
	
	public static void main(String[] args) {
		Assignment_14 assignment_14 = new Assignment_14();
		assignment_14.evenNum(10,15);
	}

}
