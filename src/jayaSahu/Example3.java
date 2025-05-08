package jayaSahu;

class Example3{
    static int x = 10;
	int y = 100;
	
	void processData(){
	     x = x+1;
		 y = y+1;
	}
	
	void display (){
	System.out.println(x+ "" +y);
	}
	
	public static void main (String [] args){
	     Example3 ex3_1 = new Example3();
		 ex3_1.processData();
		 ex3_1.display();
		 
		 Example3 ex3_2 = new Example3();
		 ex3_2.processData();
		 ex3_2.display();
	}

}