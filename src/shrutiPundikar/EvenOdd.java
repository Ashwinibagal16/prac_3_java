package shrutiPundikar;

class EvenOdd{
	
	void isNumberEven( int num){
		if(num % 2 == 0){
			System.out.println(+ num + " Number is even");
		}
		else{
			System.out.println(+ num + " Number is odd");
		}
	}
	
	public static void main(String[] args){
		EvenOdd ed = new EvenOdd();
		ed.isNumberEven(25);
		ed.isNumberEven(10);
		ed.isNumberEven(6);
		ed.isNumberEven(7);
		ed.isNumberEven(12);
	}
}