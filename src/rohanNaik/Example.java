//print all the numbers between 1 to 100, which are div by 5 or 7. 
//if number is div by 5, print "num is div by 5",
//if number is div by 7, print "num is div by 7",
//if number is div by both, print "num is div vy 5 and 7".


package rohanNaik;

class Example{

	int num;
	
	void processData(){
		
		for(int count = 1; count <= 100; count++){
			
			if(count % 5 == 0 && count% 7 == 0){
				System.out.println("num is div by 5 and 7 both  :" + count);
			}
			else if(count % 5 == 0){
				System.out.println("num is div by 5:" + count);
			}
			else if(count % 7 == 0){
				System.out.println("num is div by 7:" + count);
			} 
			
		}
	}
	
	public static void main(String args[]){
		Example example = new Example();
		example.processData();
	}
}