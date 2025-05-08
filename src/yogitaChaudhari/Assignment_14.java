package yogitaChaudhari;

public class Assignment_14 {
	
	void printEvenNum(int num1 , int num2){
		System.out.println("");
		for(int i =num1 ;i<=num2; i++) {
			if(i%2 == 0) {
				System.out.println(i + " is even number");
			}else {
				System.out.println(i + " is odd number");
			}
		}
	}
	public static void main(String[] args) {
		Assignment_14 assignment_14 = new Assignment_14();
		assignment_14.printEvenNum(10,15);
	}

}
