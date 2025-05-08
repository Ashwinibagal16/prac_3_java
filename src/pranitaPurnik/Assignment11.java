/* Assignment - 11 : 25th April'25

Got it! Here's the updated requirement in that format:
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

Let me know if you'd like this as a test case table too. */

package pranitaPurnik;
class Assignment11{
	
	void printDayInfo(int dayIndex){
		if(dayIndex>=1 && dayIndex<=7){
			if(dayIndex>=1 && dayIndex<=5){
				System.out.println("It's a Weekday.");
				if(dayIndex==1){
					System.out.println("Monday.");
				}
				else if(dayIndex==2){
					System.out.println("Tuesday.");
				}
				else if(dayIndex==3){
					System.out.println("Wednesday.");
				}
				else if(dayIndex==4){
					System.out.println("Thursday.");
				}
				else if(dayIndex==5){
					System.out.println("Friday.");
				}
			}
			else{
				System.out.println("It's a Weekend.");
				if(dayIndex==6){
					System.out.println("Saturday.");
				}
				else{
					System.out.println("Sunday.");
				}
			}
		}else{
			System.out.println("Invalid day index.");
		}	
	}
	
	public static void main(String[] args){
		Assignment11 assignment11 = new Assignment11();
		assignment11.printDayInfo(3);
		assignment11.printDayInfo(7);
		assignment11.printDayInfo(0);
	}
}