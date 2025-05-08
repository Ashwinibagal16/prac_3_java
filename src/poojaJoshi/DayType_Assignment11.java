package poojaJoshi;

class DayType_Assignment11{

		void dayIndex(int day){
		
			if(day >=1 && day <=5){
				System.out.println("Day " +day+ ": Its a weekday");
				if (day ==1){
					System.out.println("Monday");
				}else if (day==2){
					System.out.println("Tuesday");
				}else if (day==3){
					System.out.println("Wednesday");
				}else if (day==4){
					System.out.println("Thursday");
				}else if (day==5){
					System.out.println("friday");
				}
			}
			
			if (day>=6 && day <=7){
				System.out.println("Day " +day+" :It's a Weekend");
				if (day ==6){
					System.out.println("Saturday");
				}else {
					System.out.println("Sunday");
				}
			}
				
			if (day <1 || day>7){
				System.out.println("Value " +day+ " :Invalid day index");
			}
		}
			
			public static void main(String[]args){
				DayType_Assignment11 day = new DayType_Assignment11();
				day.dayIndex(3);
				day.dayIndex(7);
				day.dayIndex(0);
				day.dayIndex(1);
				day.dayIndex(10);
			}
}