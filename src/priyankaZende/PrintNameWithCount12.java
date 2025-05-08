/*Requirement: Print Name with Count

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

package priyankaZende;
class PrintNameWithCount12{
	
	void printNameWithCount(String name, int count){
		for(int index =1; index <=count; index++){
			System.out.println(name +" - "+index);
		}
	}

	public static void main(String[] args){
		PrintNameWithCount12 printNameWithCount12 = new PrintNameWithCount12();
		printNameWithCount12.printNameWithCount("Maulik",5);
	}
}	
