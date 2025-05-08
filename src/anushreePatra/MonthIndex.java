package anushreePatra;

class MonthIndex {
    void printMonthIndex(int month) {
        if (month < 0) {
            System.out.println(month + " is an invalid month index, it can't be negative.");
        } else if (month >= 1 && month <= 12) {
            if (month >= 1 && month <= 3) {
                if (month == 1) {
                    System.out.println("Month index 1 is in Q1, its January.");
                } else if (month == 2) {
                    System.out.println("Month index 2 is in Q1, its February.");
                } else {
                    System.out.println("Month index 3 is in Q1, its March.");
                }
            } else if (month >= 4 && month <= 6) {
                if (month == 4) {
                    System.out.println("Month index 4 is in Q2, its April.");
                } else if (month == 5) {
                    System.out.println("Month index 5 is in Q2, its May.");
                } else {
                    System.out.println("Month index 6 is in Q2, its June.");
                }
            } else if (month >= 7 && month <= 9) {
                if (month == 7) {
                    System.out.println("Month index 7 is in Q3, its July.");
                } else if (month == 8) {
                    System.out.println("Month index 8 is in Q3, its August.");
                } else {
                    System.out.println("Month index 9 is in Q3, its September.");
                }
            } else {
                if (month == 10) {
                    System.out.println("Month index 10 is in Q4, its October.");
                } else if (month == 11) {
                    System.out.println("Month index 11 is in Q4, its November.");
                } else {
                    System.out.println("Month index 12 is in Q4, its December.");
                }
            }
        } else {
            System.out.println(month + " is an invalid month index, it can't be greater than 12.");
        }
    }

    public static void main(String[] args) {
        MonthIndex monthIndex = new MonthIndex();
        monthIndex.printMonthIndex(5);   
        monthIndex.printMonthIndex(2);  
        monthIndex.printMonthIndex(-3);  
        monthIndex.printMonthIndex(13);  
    }
}