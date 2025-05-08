/*Write only one program having the following methods.
print all even numbers in a range 10 to 15.
Hint : pass start and end index as a parameter.
Output : Even numbers are:
10
12
14*/

package priyankaZende;
class PrintAllEvenNumsInRange14{
	
	void printAllEvenNumsInRange(int start, int end){
		System.out.println("Input : Print even numbers in range: "+ start +" to "+end);
		System.out.println("Output : Even numbers are:");
		for(int index = start; index <= end; index++){
			if(index % 2 ==0){
				System.out.println(index);
			}
		}
	}
	
	public static void main(String[] args){
		PrintAllEvenNumsInRange14 printAllEvenNumsInRange14 = new PrintAllEvenNumsInRange14();
		printAllEvenNumsInRange14.printAllEvenNumsInRange(10, 15);
	}
}	

	
