package vivekRahate;
class Example16{
	void validNumber(int num1){
		if(num1>0 && num1<=100){
			System.out.println("num is valid");
		}
		else{
			System.out.println("num is not valid");
		}
		
	}
	
	public static void main(String a[]){
		Example16 example16 = new Example16();
		example16.validNumber(101);
			
	}
}