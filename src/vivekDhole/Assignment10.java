package vivekDhole;

class Assignment10 {

	void monthName (int month) {

		if(month >= 1 && month <=12) {

			if(month >=1 && month <= 3) {

				if(month == 1) {
				 	System.out.println("Month index " + month + " is in Q1 and the month is January");
				} else if (month == 2) {
					System.out.println("Month index " + month + " is in Q1 and the month is February");
				} else if (month == 3) {
					System.out.println("Month index " + month + " is in Q1 and the month is March");
				} 
				
			} else if(month >=4 && month <= 6) {

				if(month == 4) {
				 	System.out.println("Month index " + month + " is in Q2 and the month is April");
				} else if (month == 5) {
					System.out.println("Month index " + month + " is in Q2 and the month is May");
				} else if (month == 6) {
					System.out.println("Month index " + month + " is in Q2 and the month is June");
				} 
			} else if(month >=7 && month <= 9) {

				if(month == 7) {
				 	System.out.println("Month index " + month + " is in Q3 and the month is July");
				} else if (month == 8) {
					System.out.println("Month index " + month + " is in Q3 and the month is August");
				} else if (month == 9) {
					System.out.println("Month index " + month + " is in Q3 and the month is September");
				} 
			}	else if(month >=10 && month <= 12) {

				if(month == 10) {
				 	System.out.println("Month index " + month + " is in Q4 and the month is October");
				} else if (month == 11) {
					System.out.println("Month index " + month + " is in Q4 and the month is November");
				} else if (month == 12) {
					System.out.println("Month index " + month + " is in Q4 and the month is December");
				}
			}


		} else {

			System.out.println("Invalid month index, it can't be greater than 12 and less the 1");
		}
	}	


		public static void main(String[] args) {
			Assignment10 monthindex = new Assignment10();
			monthindex.monthName(5);
			monthindex.monthName(2);
			monthindex.monthName(-3);
			monthindex.monthName(13);
			monthindex.monthName(9);
	
		}
}
	
