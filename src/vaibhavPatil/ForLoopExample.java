package vaibhavPatil;


class ForLoopExample{
	int count;
	
	void printName(){
		for(count=1; count<=5; count++){
			System.out.println("Vaibhav - " + count);
		}
	}
	
	public static void main(String[] args){
		ForLoopExample forLoopExample = new ForLoopExample();
		forLoopExample.printName();
	}
}