package yogitaChaudhari;

public class Assignment_15 {
	
	void printNumDivisible(int num1 , int num2) {
		System.out.println("");
		for(int i = num1 ; i<=num2 ;i++) {
			if(i%3==0 && i%15==0 ) {
				System.out.println(i +" is divisible by 3 and 15" );
			}
		}
	}
	public static void main(String[] args) {
		Assignment_15 assignment_15 = new Assignment_15();
		assignment_15.printNumDivisible(5, 40);
		
	}
 
}
