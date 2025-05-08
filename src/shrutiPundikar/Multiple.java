package shrutiPundikar;

class Multiple{
	
	void printNum(){
		for(int num = 1; num <=100; num++){
			if(num %5 ==0 && num %7 ==0){
				System.out.println(num+" Number is divisible by both 5 & 7");
			}else if(num % 5 ==0){
				System.out.println(num+" Number is divisible by 5");
			}else if(num % 7 ==0){
				System.out.println(num+" Number is divisible by 7");
			}
		}
	}
	public static void main(String[] args){
		Multiple multiple = new Multiple();
		multiple.printNum();
	}
}