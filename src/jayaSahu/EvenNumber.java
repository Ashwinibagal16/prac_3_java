package jayaSahu;

class EvenNumber{
 
	void printEvenNumber(int start, int end){
		System.out.println("Even number are");
		for(int i = start; i <= end; i++){
			if(i%2 == 0){
				System.out.println(i);
			}  
		}
   
	}
  
	public static void main(String[] args){
	   EvenNumber evennumber = new EvenNumber();
	   evennumber.printEvenNumber(10, 15);   
	}
 
}
  
  
	