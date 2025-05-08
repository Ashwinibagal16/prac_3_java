package vaibhavPatil;

public class Assignment_15 {

	void divisible(int startIndex, int endIndex) {
		System.out.println("Number divisible by 5 & 3 between range "+startIndex + " & " + endIndex);
		for(int num =startIndex; num<=endIndex; num++) {
			if(num%5==0 && num%3==0) {
				System.out.println(num);
			}
		}
	}
	
	public static void main(String[] args) {
		Assignment_15 assignment_15 = new Assignment_15();
		assignment_15.divisible(5,40);
	}

}
