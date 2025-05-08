package shubhamMandavgane;
class PrintNameCount{

	void printNameCount(String name){
		for(int count=1; count<=5; count++){
			System.out.println(name +" - " +count );
		}	
	}
	
	public static void main(String[] args){
		PrintNameCount printnamecount = new PrintNameCount();
		printnamecount.printNameCount("Shubham");
	}
}