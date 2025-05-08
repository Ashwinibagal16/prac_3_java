package shrutiPundikar;

class DayIndex{
	
	void printDayInfo(int dayIndex){
		if(dayIndex >= 1 && dayIndex <= 7){
			if(dayIndex >= 1 && dayIndex <= 5){
				System.out.println("It's a weekday");
				if(dayIndex == 1){
					System.out.println("Monday");
				}else if(dayIndex == 2){
					System.out.println("Tuesday");
				}else if(dayIndex == 3){
					System.out.println("Wednesday");
				}else if(dayIndex == 4){
					System.out.println("Thursday");
				}else if(dayIndex == 5){
					System.out.println("Friday");
				}
				
			}else if(dayIndex >= 6 && dayIndex <= 7){
				System.out.println("It's weekend");
				if(dayIndex == 6){
					System.out.println("Saturday");
				}else if(dayIndex == 7){
					System.out.println("Sunday");
				}
			}
		}else{
			System.out.println("Invalid Day Index");
		}	
	}
	
	public static void main(String[] args){
		DayIndex dayindex = new DayIndex();
		dayindex.printDayInfo(3);
		System.out.println("");
		dayindex.printDayInfo(7);
		System.out.println("");
		dayindex.printDayInfo(1);
		System.out.println("");
		dayindex.printDayInfo(0);
		System.out.println("");
		dayindex.printDayInfo(8);
		System.out.println("");
	}
}