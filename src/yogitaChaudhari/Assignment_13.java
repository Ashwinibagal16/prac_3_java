package yogitaChaudhari;

public class Assignment_13 {

	void printMaxNum(int num1 , int num2) {
		if(num1 > num2) {
			System.out.println(num1 +" is Maximun beetween" +num1 + " and " + num2);
			
		}else {
			System.out.println(num2 +" is Maximun beetween" +num1 + " and " + num2);
		}
		
	}
	 void printMinNumber(int num1 , int num2) {
		 System.out.println("");
		 if(num1 < num2) {
			 System.out.println(num1 +" is samaller beetween " +num1 + " and " + num2);
		 }else {
			 System.out.println(num2 +" is samaller beetween  " +num1 + " and " + num2);
		 }
	 }
	public static void main(String[] args) {
		Assignment_13 assignment_13 = new Assignment_13();
		assignment_13.printMaxNum(10, 17);
		assignment_13.printMinNumber(10, 17);
	}
}
