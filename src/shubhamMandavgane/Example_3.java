package shubhamMandavgane;
class Example_3{

	void m1(){
		for(int num =1 ; num<= 100 ; num++){
			if(num %5 ==0 && num%7 == 0){
				System.out.println(num+ "It is divisible by 5 and 7");
			}else{
				if(num %5 ==0){
				System.out.println(num+ " It is divisible by 5 ");
				}
				if(num%7 == 0){
				System.out.println(num+ "It is divisible by 7");
				}
			}
		}
	}
	
	public static void main(String[] args){
		Example_3 example = new Example_3();
		example.m1();
	}
}