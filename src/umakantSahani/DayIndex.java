package umakantSahani;

//Assignment11
class DayIndex{
	
	void displayDetails(int dayIndex){
		System.out.println("Input: " + dayIndex);
		System.out.println("Output: ");
		if(dayIndex < 1 || dayIndex > 7){
			System.out.println("Invalid day index.");
		}
		else if(dayIndex >= 1 && dayIndex <= 5){
			System.out.println("It's a Weekday.");
			if(dayIndex == 1){
				System.out.println("Monday.");
			}
			else if(dayIndex == 2){
				System.out.println("Tuesday.");
			}
			else if(dayIndex == 3){
				System.out.println("Wednesday.");
			}
			else if(dayIndex == 4){
				System.out.println("Thursday.");
			}
			else{
				System.out.println("Friday.");
			}
		}
		else{
			System.out.println("It's a Weekend.");
			if(dayIndex == 6){
				System.out.println("Saturday.");
			}
			else{
				System.out.println("Sunday.");
			}
		}
	}
	
	public static void main(String[] args){
		DayIndex dayIndex = new DayIndex();
		dayIndex.displayDetails(3);
		dayIndex.displayDetails(7);
		dayIndex.displayDetails(0);
	}
}