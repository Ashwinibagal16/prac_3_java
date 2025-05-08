package vivekRahate;
class ForLoopEx{
	void printName(int num){
		for (int i=1;i<=num;i++){
			System.out.println("Vivek Rahate - " +i); 
		}
	}
	
	public static void main(String a[]){
		ForLoopEx forloopex = new ForLoopEx();
		forloopex.printName(5);
	}
}