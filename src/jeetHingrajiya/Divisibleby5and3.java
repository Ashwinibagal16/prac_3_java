//Assignment 15
package jeetHingrajiya;
public class Divisibleby5and3 {
	void divisibleNumber() {
		for(int num = 5; num <= 40; num++) {
			if(num%5 == 0 && num%3 == 0){
		        System.out.println(num);
		    } 
		}
	}
	
	public static void main(String[] args) {
		Divisibleby5and3 divby5and3 = new Divisibleby5and3();
		System.out.println("Divisible by 5 and 3 Numbers are");
		divby5and3.divisibleNumber();
	}
}