
package omkarBhujbal;
class Month {
    void printMonth(int index) {
        if (index >= 1 && index <= 3) {
            if (index == 1) {
                System.out.println("1st month in Q1 -> January");
            } else if (index == 2) {
                System.out.println("2nd month in Q1 -> February");
            } else if (index == 3) {
                System.out.println("3rd month in Q1 -> March");
            }
        } else if (index >= 4 && index <= 6) {
            if (index == 4) {
                System.out.println("1st month in Q2 -> April");
            } else if (index == 5) {
                System.out.println("2nd month in Q2 -> May");
            } else if (index == 6) {
                System.out.println("3rd month in Q2 -> June");
            }
        } else if (index >= 7 && index <= 9) {
            if (index == 7) {
                System.out.println("1st month in Q3 -> July");
            } else if (index == 8) {
                System.out.println("2nd month in Q3 -> August");
            } else if (index == 9) {
                System.out.println("3rd month in Q3 -> September");
            }
        } else if (index >= 10 && index <= 12) {
            if (index == 10) {
                System.out.println("This is --> October");
            } else if (index == 11) {
                System.out.println("This is --> November");
            } else if (index == 12) {
                System.out.println("This is --> December");
            }
        } else {
            System.out.println("Invalid month index!");
        }
    }
    public static void main(String[] args) {
        Month mo = new Month();
		mo.printMonth(2); 
        mo.printMonth(5);     
		mo.printMonth(6); 
		mo.printMonth(11); 
        mo.printMonth(13); 
	    mo.printMonth(8); 
    }
}
