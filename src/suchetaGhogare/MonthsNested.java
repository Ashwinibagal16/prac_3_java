package suchetaGhogare;

class MonthsNested{
	String monthName;
	
	void processMonthsIndex(int index){
		if ((index >= 1) && (index <= 12)){
			if ((index >= 1) && (index <= 3)){
				if (index==1){
					monthName = "January";
				}
				else if (index==2){
					monthName = "February";
				}
				else{ 
					monthName = "March";
				}					
				System.out.println("Month index " + index + " is in Q1, its " +monthName);				
			}				
			if ((index >= 4) && (index <= 6)){
				if (index==4){
					monthName = "April";
				}
				else if (index==5){
					monthName = "May";
				}
				else{ 
					monthName = "June";
				}					
				System.out.println("Month index " + index + " is in Q2, its " +monthName);	
			}				
			if ((index >= 7) && (index <= 9)){				
				if (index==7){
					monthName = "July";
				}
				else if (index==8){
					monthName = "August";
				}
				else{ 
					monthName = "September";
				}					
				System.out.println("Month index " + index + " is in Q3, its " +monthName);	
			}				
			if ((index >= 10) && (index <= 12)){
				if (index==10){
					monthName = "October";
				}
				else if (index==11){
					monthName = "November";
				}
				else{ 
					monthName = "December";
				}					
				System.out.println("Month index " + index + " is in Q4, its " +monthName);	
			}				
		}
		else{ 
			if ((index<0) || (index==0)){
					System.out.println("Invalid month index, it can't be zero or negative");
			}
			else if (index>12){
					System.out.println("Invalid month index, it can't be greater than 12");
			}	
		}
	}

	public static void main(String[] args){
		MonthsNested monthsNested = new MonthsNested();
		monthsNested.processMonthsIndex(7);
		monthsNested.processMonthsIndex(1);
		monthsNested.processMonthsIndex(5);
		monthsNested.processMonthsIndex(12);
		monthsNested.processMonthsIndex(0);
		monthsNested.processMonthsIndex(13);
		monthsNested.processMonthsIndex(100);
		monthsNested.processMonthsIndex(-1);
	}
}