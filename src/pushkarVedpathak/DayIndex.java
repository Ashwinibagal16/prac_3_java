package pushkarVedpathak;

class DayIndex{
	
	String week;
	
	void Day(int day){
		if(day>=1 && day<=7){
			if(day>=1 && day<=5){
				week = "Weekday";
				if(day == 1){
					System.out.println("Its a " + week);
					System.out.println("Monday");
				}else if(day == 2){
					System.out.println("Its a " + week);
					System.out.println("Tuesday");
				}else if(day == 3){
					System.out.println("Its a " + week);
					System.out.println("Wednesday");
				}else if(day == 4){
					System.out.println("Its a " + week);
					System.out.println("Thursday");
				}else{
					System.out.println("Its a " + week);
					System.out.println("Friday");
				}
			}else if(day>=6 && day<=7){
				week = "Weekend";
				if(day == 6){
					System.out.println("Its a " + week);
					System.out.println("Saturday");
				}else{
					System.out.println("Its a " + week);
					System.out.println("Sunday");
				}
			}
		}else if(day<1){
			System.out.println(day + " is Invalid Day Index");
		}else{
			System.out.println(day + " is Invalid Day Index");
		}
	}
	
	public static void main(String[] args){
		DayIndex dayIndex = new DayIndex();
		dayIndex.Day(2);
		dayIndex.Day(7);
		dayIndex.Day(0);
		dayIndex.Day(9);
	}
}