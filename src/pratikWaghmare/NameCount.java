package pratikWaghmare;
class NameCount{
	int num;
	
	void printName(int num){
		int i;
		for (i = 1; i <= num; i++){
			System.out.println("Pratik - " + i);
		}
	}
	public static void main(String a[]){
		NameCount nameC = new NameCount();
		nameC.printName(5);
	}
}