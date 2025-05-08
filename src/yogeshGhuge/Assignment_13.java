package yogeshGhuge;

public class Assignment_13 {
	
	void minNum(int num1, int num2) {
		if(num1<num2) {
			System.out.println( num1 + "<- this is smallest number in between");
		}else {
			System.out.println(num2 + " <- this bigger number in between");
		}
		
	}
	
	void maxNum(int num1, int num2) {
		if(num2>num1) {
			System.out.println( num2 + "<- this is biggest number in between");
		}else {
			System.out.println(num1 + " <- this smaller number in between");
		}
		
	}

	public static void main(String[] args) {
		Assignment_13 assign_13 = new Assignment_13();
		assign_13.minNum(10, 17);
		assign_13.maxNum(10, 17);
		

	}

}

/*Write 2 methods, one method to find maximum number from 2 numbers,
other to find minimum number from given 2 numbers.
sample input :
num1 : 10
num2 : 17
output : 10 is smaller between 10 and 17.
sample input :
num1 : 10
num2 : 17
output : 17 is bigger between 10 and 17. */
