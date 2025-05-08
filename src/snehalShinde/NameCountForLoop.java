package snehalShinde;

class NameCountForLoop{
	
	String name = "Snehal Shinde";

	void nameCount(){
		for(int count=1; count<=5; count++){
			System.out.println(name + " - " + count);
			System.out.println("---------------------------------------------");
		}
	}
	
	public static void main(String[] args){
		NameCountForLoop nameCountForLoop = new NameCountForLoop();
		nameCountForLoop.nameCount();
	}
}