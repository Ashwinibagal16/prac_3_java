package siddheshParab;

class A11_DayTypeChecker {

    void getDayType(int dayIndex) {
        if (dayIndex < 1 || dayIndex > 7) {
            System.out.println("Invalid day index.");
        } else {
            String dayName = "";
            String dayType = "";

            // Determine the day name and type
            if (dayIndex == 1) {
                dayName = "Monday";
            } else if (dayIndex == 2) {
                dayName = "Tuesday";
            } else if (dayIndex == 3) {
                dayName = "Wednesday";
            } else if (dayIndex == 4) {
                dayName = "Thursday";
            } else if (dayIndex == 5) {
                dayName = "Friday";
            } else if (dayIndex == 6) {
                dayName = "Saturday";
            } else if (dayIndex == 7) {
                dayName = "Sunday";
            }

            // Determine the day type (Weekday or Weekend)
            if (dayIndex >= 1 && dayIndex <= 5) {
                dayType = "It's a Weekday.";
            } else {
                dayType = "It's a Weekend.";
            }

            // Output the results
            System.out.println(dayName + " " + dayType);
        }
    }

    public static void main(String[] args) {
        A11_DayTypeChecker checker = new A11_DayTypeChecker();
        checker.getDayType(3);
        checker.getDayType(7);
        checker.getDayType(0);
    }
}
