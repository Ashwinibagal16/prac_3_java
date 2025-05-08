package krupa;

class PrintName {

  void printNameWithLoop() {
	  for(int i=1; i<=5; i++) {
		  System.out.println("Krupa");
	  }
	  
  }
  
  public static void main(String[] args) {
	  PrintName printName = new PrintName();
	  printName.printNameWithLoop();
  }

}