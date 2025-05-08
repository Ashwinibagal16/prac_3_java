/*Please use nested if else for below requirement.
Based on month index, print quarter and name of the month.
1 to 3 → Q1
4 to 6 → Q2
7 to 9 → Q3
10 to 12 → Q4
input : 5 output : Month index 5 is in Q2, its May.
input : 2 output : Month index 2 is in Q1, its Febuary.
input : -3 output: 
input : 13 output: invalid month index, it can't be greater than 13.
*/

package amrutaMarkhedkar;

public class Assign10_QuarterBasedOnMonth {

	public static void main(String[] args) {
		Assign10_QuarterBasedOnMonth assign10_QuarterBasedOnMonth = new Assign10_QuarterBasedOnMonth();
		assign10_QuarterBasedOnMonth.getQuarterDetails(5);
		assign10_QuarterBasedOnMonth.getQuarterDetails(2);
		assign10_QuarterBasedOnMonth.getQuarterDetails(0);
		assign10_QuarterBasedOnMonth.getQuarterDetails(-3);
		assign10_QuarterBasedOnMonth.getQuarterDetails(13);
	}

	void getQuarterDetails(int monthIndex) {
		String month;
		if (monthIndex == 1) {
			month = "Jan";
			System.out.println("Month index is " + monthIndex + " and it is in Q1, " + "its " + month);
		} else if (monthIndex == 2) {
			month = "Feb";
			System.out.println("Month index is " + monthIndex + " and it is in Q1, " + "its " + month);
		} else if (monthIndex == 3) {
			month = "Mar";
			System.out.println("Month index is " + monthIndex + " and it is in Q1, " + "its " + month);
		}if (monthIndex == 4) {
			month = "Apr";
			System.out.println("Month index is " + monthIndex + " and it is in Q1, " + "its " + month);
		} else if (monthIndex == 5) {
			month = "May";
			System.out.println("Month index is " + monthIndex + " and it is in Q1, " + "its " + month);
		} else if (monthIndex == 6) {
			month = "Jun";
			System.out.println("Month index is " + monthIndex + " and it is in Q1, " + "its " + month);
		}if (monthIndex == 7) {
			month = "Jul";
			System.out.println("Month index is " + monthIndex + " and it is in Q1, " + "its " + month);
		} else if (monthIndex == 8) {
			month = "Aug";
			System.out.println("Month index is " + monthIndex + " and it is in Q1, " + "its " + month);
		} else if (monthIndex == 9) {
			month = "Sept";
			System.out.println("Month index is " + monthIndex + " and it is in Q1, " + "its " + month);
		}if (monthIndex == 10) {
			month = "Oct";
			System.out.println("Month index is " + monthIndex + " and it is in Q1, " + "its " + month);
		} else if (monthIndex ==11) {
			month = "Nov";
			System.out.println("Month index is " + monthIndex + " and it is in Q1, " + "its " + month);
		} else if (monthIndex ==12) {
			month = "Dec";
			System.out.println("Month index is " + monthIndex + " and it is in Q1, " + "its " + month);
		}else if(monthIndex >12) {
			System.out.println("invalid month index, it can't be greater than 12");
		}else if(monthIndex<=0) {
			System.out.println("invalid month index, it's either zero or a negative number");
		}

	}

}
