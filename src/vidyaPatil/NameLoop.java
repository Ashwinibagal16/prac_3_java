package vidyaPatil;

class NameLoop{
	
	void displayName(String name){
		for (int count=1; count<=5; count++){
			System.out.println(name + " - " + count);
		}
	}
	
	public static void main(String[] args){
		NameLoop nameLoop = new NameLoop();
		nameLoop.displayName("Vidya");
	}
}