package shubhamMandavgane;
class Div5and3 {

		void m1(int num1, int  num2) {
			for(int num=num1; num>=num1 && num<=num2; num++) {
				if(num%5==0 && num%3 ==0) {
					System.out.println(+num);
				}
			}
		}
		
		
	public static void main(String[] args) {
		Div5and3 div5and3 = new Div5and3();
		System.out.println("Divisible by 5 & 3, numbers are");
		div5and3.m1(5,40);
	}

}
