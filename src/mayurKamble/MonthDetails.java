package mayurKamble;

class MonthDetails{
	String month;
	
	void printMonthData(int monthIndex){
		if(monthIndex>=1 && monthIndex<=12){
			if(monthIndex>=1 && monthIndex<=3){
				if(monthIndex==1){
					month= "January";
				}else if(monthIndex==2){
					month= "February";
				}else{
					month= "March";
				}
				System.out.println("MonthIndex "+monthIndex+" is in Quarter 1,it's "+month);
			}else if(monthIndex>=4 && monthIndex<=6){
				if(monthIndex==4){
					month= "April";
				}else if(monthIndex==5){
					month= "May";
				}else{
					month= "June";
				}	
				System.out.println("MonthIndex "+monthIndex+" is in Quarter 2,it's "+month);
			}else if(monthIndex>=7 && monthIndex<=9){
				if(monthIndex==7){
					month= "April";
				}else if(monthIndex==8){
					month= "May";
				}else{
					month= "June";
				}
				System.out.println("MonthIndex "+monthIndex+" is in Quarter 3,it's "+month);
			}else{
				if(monthIndex==10){
					month= "April";
				}else if(monthIndex==11){
					month= "May";
				}else{
					month= "June";
				}
				System.out.println("MonthIndex "+monthIndex+" is in Quarter 4,it's "+month);
			}
		}else{
			if(monthIndex>12){
				System.out.println("Invalid Month Index , it cannot be greater than 12.");
			}else
				System.out.println("Invalid Month Index , it cannot be Negative");
		}
	}
	
	public static void main(String[]args){
		MonthDetails monthDetails= new MonthDetails();
		monthDetails.printMonthData(5);
		monthDetails.printMonthData(2);
		monthDetails.printMonthData(-3);
		monthDetails.printMonthData(13);
		monthDetails.printMonthData(6);
	}
}