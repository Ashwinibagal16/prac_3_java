package siddheshParab;

class A10_MonthQuarterChecker {

    void getMonthInfo(int index) {
        if (index < 1) {
            System.out.println("invalid month index, it can't be less than 1.");
        } else if (index > 12) {
            System.out.println("invalid month index, it can't be greater than 12.");
        } else {
            // Determine the quarter
            int quarter = (index - 1) / 3 + 1;

            // Determine the month name
            String monthName = "";
            if (index == 1) {
                monthName = "January";
            } else if (index == 2) {
                monthName = "February";
            } else if (index == 3) {
                monthName = "March";
            } else if (index == 4) {
                monthName = "April";
            } else if (index == 5) {
                monthName = "May";
            } else if (index == 6) {
                monthName = "June";
            } else if (index == 7) {
                monthName = "July";
            } else if (index == 8) {
                monthName = "August";
            } else if (index == 9) {
                monthName = "September";
            } else if (index == 10) {
                monthName = "October";
            } else if (index == 11) {
                monthName = "November";
            } else {
                monthName = "December";
            }

            System.out.println("Month index " + index + " is in Q" + quarter + ", its " + monthName + ".");
        }
    }

    public static void main(String[] args) {
        A10_MonthQuarterChecker checker = new A10_MonthQuarterChecker();
        checker.getMonthInfo(5);
        checker.getMonthInfo(2);
        checker.getMonthInfo(-3);
        checker.getMonthInfo(13);
    }
}

