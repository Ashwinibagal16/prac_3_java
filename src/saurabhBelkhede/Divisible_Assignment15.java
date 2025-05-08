package saurabhBelkhede;
//Assignment 15
class Divisible{

	void printEven(int startIndex, int endIndex){
		for(int i= startIndex ; i <= endIndex; i++){
			if(i % 5 ==0 && i % 3 == 0){
				System.out.println("Divisible numbers by 5 & 3 are: " + i);
			}
		}
	}
	
	public static void main(String[] args){
		Divisible evenno = new Divisible();
		evenno.printEven(20,100);
	}
}