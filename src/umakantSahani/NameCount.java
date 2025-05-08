package umakantSahani;

class NameCount{

	void printNameCount(String name){
		for(int count=0;count<5;count++){
			System.out.println(name + " - " + count);
		}
	}
	
	public static void main(String[] args){
		NameCount nameCount = new NameCount();
		nameCount.printNameCount("Umakant");
	}
}