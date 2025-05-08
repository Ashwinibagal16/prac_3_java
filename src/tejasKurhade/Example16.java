package tejasKurhade;

class Example16{
	
	void isNumValid(int num){
		if (num >0 && num <101){
			System.out.println("num is valid");
		}else{
			System.out.println("numb is invalid");
		}
		
	}
	public static void main(String[] args){
		int input1 = 105;
		Example16 example16 = new Example16();
		example16.isNumValid(input1);
	}

}