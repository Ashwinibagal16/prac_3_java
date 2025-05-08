package shrutiPundikar;

class Counter{
	int count;
	
	void printName(){
		for(count =1; count <=5; count++){
			System.out.println("Shruti - "+ count);
		}
	}
	
	public static void main(String[] args){
		Counter counter = new Counter();
		counter.printName();
	}
}