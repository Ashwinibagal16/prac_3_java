package pratikWaghmare;
class PrintNumbers{
	int start, end;
	
	void printEven(int start, int end){
		
		System.out.println("Even numebrs between " + start + " and " + end + " are:");
		for(int i = start; i <= end; i++){
			
			if(i%2 == 0){
				System.out.println(i);
			}
		}
	}
	
	public static void main(String a[]){
		PrintNumbers printNumbers = new PrintNumbers();
		printNumbers.printEven(10,15);
	}
}	