/*print all the number between 1 to 100 which are div by 5 or 7.
if number is div 5 then print <num> num is div by 5.
if number is div 7 then print <num> num is div by 7.
if number is div 5 and 7 then print <num> num is div by 5 and 7. */

package pankajMiniyar;

class NumberDisplay{
	void displayNumber(){
		for(int num=1;num<=100;num++){
			if(num%5==0 && num%7==0){
				System.out.println(num+" num is div by 5 and 7");
			}else if(num%5==0){
				System.out.println(num+" num is div by 5.");
			}else if(num%7==0){
				System.out.println(num+" num is div by 7.");
			}
		}
	}
	
	public static void main(String[] args){
		NumberDisplay numberDisplay=new NumberDisplay();
		numberDisplay.displayNumber();	
	}
}