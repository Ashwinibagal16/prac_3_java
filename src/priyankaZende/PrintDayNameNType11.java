/*
Requirement: Day Index to Day Type

* For a valid dayIndex (1–7), print two lines:
    * Line 1: "It's a Weekday." for 1–5, or "It's a Weekend." for 6–7
    * Line 2: Print the corresponding day name (Monday to Sunday)
* If dayIndex is outside the range 1–7, print "Invalid day index." in a single line.

Examples:

* Input: 3
     Output:
    It's a Weekday.
    Wednesday.
* Input: 7
     Output:
    It's a Weekend.
    Sunday.
* Input: 0
     Output:
    Invalid day index.
*/

package priyankaZende;
class PrintDayNameNType11{

	void printDayNameNType(int index){
		if(index >= 1 && index <=5){
			System.out.println("Input : " + index);
			System.out.println("Output : ");
			System.out.println("It's a Weekday.");
			
			if(index ==1 ){
				System.out.println("Monday.");
			}else if(index ==2 ){
				System.out.println("Tuesday.");
			}else if(index ==3 ){
				System.out.println("Wednesday.");
			}else if(index ==4 ){
				System.out.println("Thrusday.");
			}else if(index ==5 ){
				System.out.println("Friday.");
			}
		} else if(index == 6 || index ==7){
			System.out.println("Input : " + index);
			System.out.println("Output : ");
			System.out.println("It's a Weekend.");
			
			if(index ==6){
				System.out.println("Saturday.");
			}else if(index ==7 ){
				System.out.println("Sunday.");
			}
		}else if(index <= 0 || index >7){
			System.out.println("Input : " + index);
			System.out.println("Output : ");
			System.out.println("Invalid day index.");
		}	
	}

	public static void main(String[] args){
		PrintDayNameNType11 printDayNameNType11 = new PrintDayNameNType11();
		printDayNameNType11.printDayNameNType(3);
		printDayNameNType11.printDayNameNType(7);
		printDayNameNType11.printDayNameNType(0);
	}
}	