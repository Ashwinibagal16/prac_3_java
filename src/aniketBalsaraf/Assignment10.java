package aniketBalsaraf;

public class Assignment10 {

	void printMonthInfo(int monthIndex) {
		if (monthIndex >= 1 && monthIndex <= 12) {
			System.out.println(monthIndex + " is a valid monthIndex");
			if (monthIndex >= 1 && monthIndex <= 3) {
				System.out.println(monthIndex + " is in Quarter 1");
				if (monthIndex == 1) {
					System.out.println("It's a Jan");
				} else if (monthIndex == 2) {
					System.out.println("It's a Feb");
				} else {
					System.out.println("It's a March");
				}
			} else if (monthIndex >= 4 && monthIndex <= 6) {
				System.out.println(monthIndex + " is in Quarter 2");
				if (monthIndex == 4) {
					System.out.println("It's a Apr");
				} else if (monthIndex == 5) {
					System.out.println("It's a May");
				} else {
					System.out.println("It's a June");
				}
			} else if (monthIndex >= 7 && monthIndex <= 9) {
				System.out.println(monthIndex + " is in Quarter 3");
				if (monthIndex == 7) {
					System.out.println("It's a Jul");
				} else if (monthIndex == 8) {
					System.out.println("It's a Aug");
				} else {
					System.out.println("It's a Sep");
				}
			} else if (monthIndex >= 10 && monthIndex <= 12) {
				System.out.println(monthIndex + " is in Quarter 4");
				if (monthIndex == 10) {
					System.out.println("It's a Oct");
				} else if (monthIndex == 11) {
					System.out.println("It's a Nov");
				} else {
					System.out.println("It's a Dec");
				}
			}
		} else {
			System.out.println(monthIndex + " is invalid monthIndex");
		}
	}

	public static void main(String[] args) {
		Assignment10 assignment10 = new Assignment10();
		assignment10.printMonthInfo(5);
		assignment10.printMonthInfo(2);
		assignment10.printMonthInfo(-3);
		assignment10.printMonthInfo(13);
	}
}
