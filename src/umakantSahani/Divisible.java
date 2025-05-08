package umakantSahani;

public class Divisible {

	void divisibleBy5Or7(){
		for(int num=1; num<=100; num++){
			if(num%5==0 && num%7==0){
				System.out.println(num + " is div by 5 and 7");
			}
			else if(num%5 == 0){
				System.out.println(num + " is div by 5");
			}
			else if(num%7 == 0){
				System.out.println(num + " is div by 7");
			}
		}
	}
	
	public static void main(String[] args){
		Divisible divisible = new Divisible();
		divisible.divisibleBy5Or7();
	}
}
