package mayurKamble;

class DayDetails{
	
	void printDayInfo(int dayIndex){
		if(dayIndex>=1 && dayIndex<=7){
			if(dayIndex>=1 && dayIndex<=5){
			System.out.println("It's a WeekDay");
				if(dayIndex==1){
					System.out.println("Monday");
				}else if(dayIndex==2){
					System.out.println("Tuesday");
				}else if(dayIndex==3){
					System.out.println("Wednesday");
				}else if(dayIndex==4){
					System.out.println("Thursday");
				}else{
					System.out.println("Friday");
				}
			}else{
				System.out.println("It's a Weekend");
				if(dayIndex==6){
					System.out.println("Saturday");
				}else{
					System.out.println("Sunday");
				}
			}
		}else
			System.out.println("Invalid Day Index ");
	}
	
	public static void main(String[]args){
		DayDetails dayDetails= new DayDetails();
		dayDetails.printDayInfo(3);
		dayDetails.printDayInfo(7);
		dayDetails.printDayInfo(0);
	}
}