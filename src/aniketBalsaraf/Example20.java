package aniketBalsaraf;

class Example20{
		
	void numDivByFiveAndSeven(){
		for(int index = 1 ; index <= 100 ;index++){
			if(index % 5 == 0 && index % 7 == 0){
				System.out.println(index + " is div by 5 and 7");
			}
			else if(index % 5 ==0){
			System.out.println(index + " is div by 5");
			}
			else if(index % 7 == 0){
				System.out.println(index + " is div by 7");
			}
		}
	}
	
	public static void main(String[] args){
		Example20 example20 = new Example20();
		example20.numDivByFiveAndSeven();
	}
	
}