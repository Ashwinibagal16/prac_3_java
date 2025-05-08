package shrutiPundikar;

class EvenNumbers{
	 
	 void isNumEven(int startindex, int endindex){
		 System.out.println("Even numbers are :");
		 for(int i=startindex; i<=endindex; i++){
			if(i%2 ==0){
			System.out.println(i);
			}
		}
	}
	 
	 public static void main(String[] args){
		EvenNumbers evennum = new EvenNumbers();
		evennum.isNumEven(10,15);
		System.out.println();
		evennum.isNumEven(20,30);
	}
	
}