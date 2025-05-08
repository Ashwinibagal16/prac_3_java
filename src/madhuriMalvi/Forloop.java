/** Using a for loop, print your name followed by a counter from 1 to 5.
* Each output should be on a new line in the format:
    <Name> - <Count>
Example Output:

Maulik - 1  
Maulik - 2  
Maulik - 3  
Maulik - 4  
Maulik - 5*/
package madhuriMalvi;
class ForLoop{
	void printName(String name){
		for(int index=1;index<=5;index++){
			System.out.println(name + " - " + index);
		}
	}
	public static void main(String[] args){
		ForLoop forloop = new ForLoop();
		forloop.printName("Madhuri");
	}
}

