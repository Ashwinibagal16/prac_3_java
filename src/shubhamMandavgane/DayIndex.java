package shubhamMandavgane;
class DayIndex{

	void dayIndex(int num){
		if(num>=1 && num<=7){
			if(num==1 || num==2 || num==3 || num==4|| num==5){
				System.out.println("It's a Weekday");
				if(num==1){
					System.out.println("Monday");
				}else if(num==2){
					System.out.println("Tuesday");
				}else if(num==3){
					System.out.println("Wednesday");
				}else if(num==4){
					System.out.println("Thursday");
				}else{
					System.out.println("Friday");
				}
			}
			else if(num ==6){
				System.out.println("It's a Weekend");
				System.out.println("Saturday");
				}
			else{
				System.out.println("It's a Weekend");
				System.out.println("Sunday");
			}
			
		}
		else{
			System.out.println("Invalid day index.");
		}
	}
	
	public static void main(String[] args){
		DayIndex dayindex = new DayIndex();
		dayindex.dayIndex(3);
		dayindex.dayIndex(7);
		dayindex.dayIndex(0);
	} 
}