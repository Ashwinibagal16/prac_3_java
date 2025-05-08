package pushkarVedpathak;

class EvenNumber{
	
	int number;
	
	void processData(int startNumber, int endNumber){
		System.out.println("Even numbers are :");
		for (number=startNumber; number<=endNumber; number++){
			if(number%2 == 0){
				System.out.println(number);
			}
		}
	}
	
	public static void main(String[] args){
		EvenNumber evenNumber = new EvenNumber();
		evenNumber.processData(10,15);
	}
}