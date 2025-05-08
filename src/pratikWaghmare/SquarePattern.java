package pratikWaghmare;
class SquarePattern{
	
	void printSquare(int num){
		
		for (int i = 1; i <= num; i++){
			
			if (i ==1 || i == num){
				System.out.println("* * * * * *");
			}
			else{
				System.out.println("*         *");
			}
		}
		
	}
	
	public static void main(String a[]){
		SquarePattern squarePattern = new SquarePattern();
		squarePattern.printSquare(6);
	}
}