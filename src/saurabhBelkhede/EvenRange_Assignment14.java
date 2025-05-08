package saurabhBelkhede;
//Assignment 14
class EvenRange{

	void printEven(int startIndex, int endIndex){
		System.out.println("Even numbers in the range of: " +startIndex + " - " + endIndex );
		for(int i= startIndex ; i <= endIndex; i++){
			if(i % 2 ==0){
				System.out.println(i);
			}
		}
	}
	
	public static void main(String[] args){
		EvenRange evenno = new EvenRange();
		evenno.printEven(20,40);
	}
}