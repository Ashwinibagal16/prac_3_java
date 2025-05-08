package suchetaGhogare;

class NameForLoop{
	
	void processNameForLoop(String name){
		for(int count=1; count<=5; count++){
			System.out.println(name + " - " +count);
		}
	}

	public static void main(String[] args){
		NameForLoop nameForLoop = new NameForLoop();
		nameForLoop.processNameForLoop("Sucheta");
	}
}