package vivekRahate;
class WeekDays{	
	void printDays(int days){
	if(days >=1 && days <= 7){
		if(days >=1 && days <= 5){
			System.out.println("It is a Weekday");
			if(days ==1){
				System.out.println("Mondays");
			}
			else if(days ==2){
				System.out.println("Tuesday");
			}
			else if(days ==3){
				System.out.println("Wednesday");
			}
			else if(days ==4){
				System.out.println("Thursday");
			}
			else if(days ==5){
				System.out.println("Friday");
			}
		}
		else{
			System.out.println("It is a Weekend");
			if (days ==6){
				System.out.println("Saturday");
			}
			else if (days ==7){
				System.out.println("Sunday");
			}
		}
	}else{
		System.out.println("It is not valid date");
		}
		
	}
		
	public static void main(String a[]){
		WeekDays weekdays = new WeekDays();
		weekdays.printDays(3);
		weekdays.printDays(7);
		weekdays.printDays(0);
	}
}