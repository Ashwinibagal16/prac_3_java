/* Assignment - 14 : 26th April'2025
Write only one program having the following methods.
print all even numbers in a range 10 to 15.
Hint : pass start and end index as a parameter.
Output : Even numbers are:
10
12
14 */

package pranitaPurnik;
class Assignment14{
	public static void main(String[] args){
		Assignment14 assignment14 = new Assignment14();
		assignment14.printEvenNumbers(10,15);
		
		
	}
	void printEvenNumbers(int startIndex,int endIndex){
		System.out.println("Even numbers are: ");
		for(int i=startIndex;i<=endIndex;i++){
			if(i%2==0){
				System.out.println(i);
			}
		}
	}
}
