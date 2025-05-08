package vaibhavPatil;

class WeekInfo{
	
	void printWeekInfo(int dayIndex){
		if(dayIndex>=1 && dayIndex<=7){
			if(dayIndex>=1 && dayIndex<=5){
				System.out.println("Its a Weekday");
				if(dayIndex==1){
					System.out.println("Day is Monday");
				}else if(dayIndex==2){
					System.out.println("Day is Tuesday");
				}else if(dayIndex==3){
					System.out.println("Day is Wednesday");
				}else if(dayIndex==4){
					System.out.println("Day is Thursday");
				}else if(dayIndex==5){
					System.out.println("Day is Friday");
				}
				System.out.println("-----------------------------");
			}else{
				System.out.println("Its a WeekEnd");
				if(dayIndex==6){
					System.out.println("Day is Saturday");					
				}else{
					System.out.println("Day is Sunday");										
				}
				System.out.println("-----------------------------");
			}
		}else{
			System.out.println("Please Enter a Valid Day Index. Valid day index should be in between 1 to 7");
		}
	}
	
	public static void main(String[] args){
		WeekInfo weekInfo = new WeekInfo();
		weekInfo.printWeekInfo(3);
		weekInfo.printWeekInfo(7);
		weekInfo.printWeekInfo(0);
	}
}