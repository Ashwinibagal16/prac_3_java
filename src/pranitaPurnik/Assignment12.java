/* Assignment - 12 : 25th April'2025

Requirement: Print Name with Count

* Using a for loop, print your name followed by a counter from 1 to 5.
* Each output should be on a new line in the format:
    <Name> - <Count>

Example Output:

Maulik - 1  
Maulik - 2  
Maulik - 3  
Maulik - 4  
Maulik - 5 */

package pranitaPurnik;
class Assignment12{
	
	public static void main(String[]args){
		Assignment12 assignment12 = new Assignment12();
		assignment12.printName("Maulik");	
	}
	
	void printName(String name){
		for(int counter=1;counter<=5;counter++){
			System.out.println(name +" - "+counter);
		}
		
	}

}