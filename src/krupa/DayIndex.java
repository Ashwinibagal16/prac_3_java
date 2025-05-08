package krupa;

public class DayIndex {

	void printDayIndex(int dayNumber) {
		if (dayNumber >= 1 && dayNumber <= 7) {
			if (dayNumber >= 1 && dayNumber <= 5) {
				System.out.println(dayNumber + " is a Weekday");
				if (dayNumber == 1) {
					System.out.println("Monday");
				} else if (dayNumber == 2) {
					System.out.println("Tuesday");
				} else if (dayNumber == 3) {
					System.out.println("Wednesday");
				} else if (dayNumber == 4) {
					System.out.println("Thusday");
				} else {
					System.out.println("Friday");
				}

			} else {
				System.out.println(dayNumber + " is a Weekend");
				if (dayNumber == 6) {
					System.out.println("Saturday");
				} else {
					System.out.println("Sunday");
				}
			}

		} else {
			System.out.println(dayNumber + " is invalid day index");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DayIndex dayIndex = new DayIndex();
		dayIndex.printDayIndex(3);
		System.out.println("-------------------");
		dayIndex.printDayIndex(7);
		System.out.println("-------------------");
		dayIndex.printDayIndex(0);
		System.out.println("-------------------");
		dayIndex.printDayIndex(9);

	}

}
