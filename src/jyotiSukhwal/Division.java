package jyotiSukhwal;

/*
print all the numbers between 1 to 100, which are div by 5 or 7. 
if number is div by 5, print "num is div by 5",
if number is div by 7, print "num is div by 7",
if number is div by both, print "num is div vy 5 and 7". 
*/

class Division{
	
	void div(){
	
		for(int num=1; num<=100; num++){
				
			if(num%5 == 0 &&  num%7 == 0 ){
				System.out.println(num + " is div by 5 and 7");
			}else if(num%5 == 0){
				System.out.println(num + " is div by 5");
			}else if(num%7 == 0){
				System.out.println(num + " is div by 7");
			}
		}
	}
	
	public static void main(String args[]){
		Division division = new Division();
		division.div();
	}
}