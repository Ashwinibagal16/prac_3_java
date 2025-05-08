package jyotiSukhwal;

class PrintName{
	
	void printNameForLoop(){
		for(int count=1 ; count<=5 ; count++){
			System.out.println("Jyoti - " + count);
		}
	}
	
	public static void main(String[] args){
		PrintName printName = new PrintName();
		printName.printNameForLoop();
	}
	
}
































/*
Requirement: Print Name with Count

* Using a for loop, print your name followed by a counter from 1 to 5.
* Each output should be on a new line in the format:
    <Name> - <Count>

Example Output:

Maulik - 1  
Maulik - 2  
Maulik - 3  
Maulik - 4  
Maulik - 5
*/