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

package amrutaMarkhedkar;

public class Assign12_NameAndCount {

	public static void main(String[] args) {
		Assign12_NameAndCount assign12_NameAndCount = new Assign12_NameAndCount();
		assign12_NameAndCount.printNameCountTimes(5);
	}

	void printNameCountTimes(int count) {
		for (int index = 1; index <= count; index++) {
			System.out.println("Amruta - " + index);
		}
	}
}
