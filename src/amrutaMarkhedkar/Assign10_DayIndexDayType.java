/*Requirement: Day Index to Day Type

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

package amrutaMarkhedkar;

public class Assign10_DayIndexDayType {

	void getDayType(int dayIndex) {
		if (dayIndex >= 1 && dayIndex <= 7) {
			if (dayIndex >= 1 && dayIndex <= 5) {
				System.out.println("It's a Weekday.");
				if (dayIndex == 1) {
					System.out.println("Monday!!");
				} else if (dayIndex == 2) {
					System.out.println("Tuesday!!");
				} else if (dayIndex == 3) {
					System.out.println("Wednesday!!");
				} else if (dayIndex == 4) {
					System.out.println("Thursday!!");
				} else if (dayIndex == 5) {
					System.out.println("Friday!!");
				}
			} else {
				System.out.println("It's a Weekend.");
				if (dayIndex == 6) {
					System.out.println("Saturday!!");
				} else {
					System.out.println("Sunday!!");
				}
			}
		} else {
			System.out.println("Invalid day index.");
		}
	}

	public static void main(String[] args) {
		Assign10_DayIndexDayType assign10_DayIndexDayType = new Assign10_DayIndexDayType();
		assign10_DayIndexDayType.getDayType(3);
		System.out.println("****************************************");
		assign10_DayIndexDayType.getDayType(7);
		System.out.println("****************************************");
		assign10_DayIndexDayType.getDayType(0);

	}

}
