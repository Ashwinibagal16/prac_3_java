package omkarBhujbal;

public class Assignment15 {
	void numDiv() {
		for(int num=5; num<=40; num ++) {
			if(num% 3 ==0 && num % 5 ==0) {
				System.out.println(num);
			}
		}
	}
	public static void main(String[] args) {
		Assignment15 assign15 = new Assignment15();
		System.out.println("\n Number divisible by 3 & 5 is : \n ");
		assign15.numDiv();
	}
}
