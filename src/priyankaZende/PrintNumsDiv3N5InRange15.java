/*
In the given range 5 to 40, print all numbers which are divisible by 5 and divisible by 3.
Hint : pass start and end index as a parameter.

Output : Divisible by 5 & 3, numbers are:
15
30
*/

package priyankaZende;
class PrintNumsDiv3N5InRange15{
	
	void printNumsDiv3N5InRange(int start, int end){
		System.out.println("Input : Print all numbers which are divisible by 5 and divisible by 3 in the range : "+ start +" to "+end);
		System.out.println("Output : Divisible by 5 & 3, numbers are:");
		for(int index = start; index <= end; index++){
			if(index % 3 == 0 && index % 5 == 0){
				System.out.println(index);
			}
		}
	}

	public static void main(String[] args){
		PrintNumsDiv3N5InRange15 printNumsDiv3N5InRange15 = new PrintNumsDiv3N5InRange15();
		printNumsDiv3N5InRange15.printNumsDiv3N5InRange(5, 40);
	}
}	
	