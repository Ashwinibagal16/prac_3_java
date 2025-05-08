package vidyaPatil;


class DayIndex{
	
	void displayDay(int num){
		if(num>=1 && num <=7){
			if (num >=1 && num <= 5){
				System.out.println("It's Weekday.");
				if (num==1){
					System.out.println("Monday");
				}else if(num==2){
					System.out.println("Tuesday");
				}else if(num==3){
					System.out.println("Wednesday");
				}else if(num==4){
					System.out.println("Thursday");
				}else {
					System.out.println("Friday");
				}
			}else{
				System.out.println("It's Weekend.");
				if (num==6){
					System.out.println("Saturday");
				}else{
					System.out.println("Sunday");
				}
			}
		}else {
			System.out.println("Invalid day index.");
		}
	}
	
	public static void main(String[] args){
		DayIndex dayIndex = new DayIndex();
		dayIndex.displayDay(1);
		dayIndex.displayDay(5);
		dayIndex.displayDay(6);
		dayIndex.displayDay(7);
		dayIndex.displayDay(8);
		dayIndex.displayDay(0);
	}
	
} 