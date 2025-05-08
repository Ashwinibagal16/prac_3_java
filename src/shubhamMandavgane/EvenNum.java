package shubhamMandavgane;
class EvenNum {
	
		void m1() {
			for(int num=10; num<=15; num++) {
				if(num%2==0) {
				System.out.println(+num);
				}
			}
		}

	public static void main(String[] args) {
		EvenNum evennum= new EvenNum();
		System.out.println("Even Numbers are");
		evennum.m1();
		}
}
