package nitinSharma;

public class FindNumber {  //to find maximum and minimum between two numbers
	
	void maximumNumber(int num1, int num2) {
		if(num1 > num2) {
			System.out.println(num1+" is greater than "+ num2);
		}else {
			System.out.println(num2+" is greater than "+ num1);	
		}
	}
	
	void mininumNumber(int num1, int num2) {
		if(num1 < num2) {
			System.out.println(num1+" is less than "+num2);
		}else {
			System.out.println(num2+" is less than "+num1);
		}
	}
	
	public static void main(String[] args) {
		FindNumber findNum = new FindNumber();
		findNum.maximumNumber(15, 8);
		findNum.mininumNumber(50, 160);
		System.out.println("---------------------------------");
		findNum.maximumNumber(20, 45);
		findNum.mininumNumber(500, 160);
	}

}
