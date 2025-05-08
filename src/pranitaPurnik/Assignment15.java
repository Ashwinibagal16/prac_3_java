/* Assignment - 15 : 26th April'2025
In the given range 5 to 40, print all numbers which are divisible by 5 and divisible by 3.
Hint : pass start and end index as a parameter.

Output : Divisible by 5 & 3, numbers are:
15
30 */

package pranitaPurnik;
class Assignment15{
	public static void main(String[] args){
		Assignment15 assignment15 = new Assignment15();
		assignment15.numDivBy5And3(5,40);
		
	}
	
	void numDivBy5And3(int startIndex,int endIndex){
		System.out.println("Divisible by 5 & 3, numbers are: ");
		for(int i=startIndex;i<=endIndex;i++){
			if(i% 5 == 0 && i% 3==0){
				System.out.println(i);
			}
		}
		
	}
	
}
