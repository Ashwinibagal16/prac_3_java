package aniketBalsaraf;

public class Assignment11 {

	void printDaysInfo(int dayIndex) {
		if (dayIndex >= 1 && dayIndex <= 7) {
			System.out.println("Day index is valid");
			if (dayIndex >= 1 && dayIndex <= 5) {
				System.out.println("It's a weekDay");
				if (dayIndex == 1) {
					System.out.println("It's a Monday");
				} else if (dayIndex == 2) {
					System.out.println("It's a Tuesday");
				} else if (dayIndex == 3) {
					System.out.println("It's a Wednsday");
				} else if (dayIndex == 4) {
					System.out.println("It's a Thursday");
				} else if (dayIndex == 5) {
					System.out.println("It's a Friday");
				}
			} else {
				System.out.println("It's a weekend");
				if (dayIndex == 6) {
					System.out.println("It's a Saturday");
				} else {
					System.out.println("It's a Sunday");
				}
			}
		} else {
			System.out.println("Day index is invalid");
		}
	}

	public static void main(String[] args) {
		Assignment11 dayInfo = new Assignment11();
		dayInfo.printDaysInfo(3);
		dayInfo.printDaysInfo(7);
		dayInfo.printDaysInfo(0);
	}
}
