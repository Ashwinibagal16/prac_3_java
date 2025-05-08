package anushreePatra;

class EvenNumbers{
	void evenNumIndex(){
		for(int count=10; count<=15; count++){
		if(count%2==0){
			System.out.println(count);
		}
		}
	}
	
	public static void main(String[] args){
	EvenNumbers evenNumbers = new EvenNumbers();
	evenNumbers.evenNumIndex();
	}
}