package shrutiPundikar;

class Example5{
	
	void isNumberValid(int num){
		if(num >= 0){
			System.out.println(+ num + " is a valid number");
		}
		else{
			System.out.println(+ num + " is not a valid number");
		}
			
	}
	
	public static void main(String[] args){
		Example5 example5 = new Example5();
		example5.isNumberValid(67);
		example5.isNumberValid(-25);
		example5.isNumberValid(10);
		example5.isNumberValid(0);
	}
}