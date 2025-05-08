/*1.	Assignment - 14 : 26th April'2025
Write only one program having the following methods.
print all even numbers in a range 10 to 15.
Hint : pass start and end index as a parameter.
Output : Even numbers are:
10
12
14*/

package rohanNaik;

class Assignment14{
	
	void processData(){
		
		System.out.println("Even numbers are: ");
		
		for(int num = 10; num <= 15; num++){
			if(num%2 == 0){
				System.out.println(num);
			}
		}
	}
	
	public static void main(String args[]){
		Assignment14 assignment14 = new Assignment14();
		assignment14.processData();
	}
}