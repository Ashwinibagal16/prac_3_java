package omkarBhujbal;

public class Assignment13 {
	void maxNumber(int num1,int num2) {
		if(num1 > num2) {
			System.out.println(num1 + " is largest number" + num1 + " & " + num2 );
		}else{
			System.out.println( num2 + " is largest Number" + num1 + " & " + num2) ;
		}
	}	
	void minNumber(int num1 , int num2) {
		if(num1 < num2) {
			System.out.println(num1 + " is Smallest Number Between " + num1 + " & " + num2);
		}else {
			System.out.println(num2 + " is Smallest Number Between " + num1 + " & " + num2);
		}
	}
	public static void main(String[] args){
		Assignment13 assign13= new Assignment13();
		assign13.maxNumber(10, 17);
		assign13.minNumber(10, 17);
	}
}
