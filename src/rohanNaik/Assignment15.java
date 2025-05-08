/*1.	Assignment - 15 : 26th April'2025
In the given range 5 to 40, print all numbers which are divisible by 5 and divisible by 3.
Hint : pass start and end index as a parameter.

Output : Divisible by 5 & 3, numbers are:
15
30*/
package rohanNaik;

class Assignment15{

	void processData(int num1, int num2){
		System.out.println("Divisible by"+ num1 + " and " + num2 + " , numbers are: ");
		for( ; num1 <= num2; num1++){
			if(num1%5==0 && num1%3==0){
				System.out.println(num1);
			}
		}
	}
	
	public static void main(String args[]){
		Assignment15 assignment15 = new Assignment15();
		assignment15.processData(5,40);
	}
}