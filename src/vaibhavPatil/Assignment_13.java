package vaibhavPatil;

public class Assignment_13 {

	void max(int num1, int num2){
		if (num1>num2) {
			System.out.println(num1 + " is bigger in between " + num1 + " & " + num2);
		}else {
			System.out.println(num2 + " is bigger in between " + num1 + " & " + num2);
		}
	}	
	
	void min(int num1, int num2) {
		if(num1<num2) {
			System.out.println(num1 + " is samller in between " + num1 + " & " + num2);
		}else {
			System.out.println(num2 + "is smaller in between " + num1 + " & " + num2);
		}
	}
	
	public static void main(String[] args) {
		Assignment_13 assighnment13 =new Assignment_13();
		assighnment13.max(10, 17);
		assighnment13.min(10, 17);
	}
}
