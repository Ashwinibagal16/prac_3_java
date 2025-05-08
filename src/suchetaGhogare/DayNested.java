package suchetaGhogare;

class DayNested{

	void DayIndex(int dayIndex){
		if ((dayIndex >= 1) && (dayIndex <=7)){
			if ((dayIndex >=1) && (dayIndex <=5)){
				System.out.println("It's a Weekday.");
				if (dayIndex==1){
					System.out.println("Monday");
				}
				else if (dayIndex==2){
					System.out.println("Tuesday");
				}
				else if (dayIndex==3){
					System.out.println("Wednesday");
				}
				else if (dayIndex==4){
					System.out.println("Thursday");
				}
				else{
					System.out.println("Friday");
				}
			}
			else{
				System.out.println("It's a Weekend.");
					if (dayIndex==6){
					System.out.println("Saturday");
					}
					else 
					{
					System.out.println("Sunday");
					}
				}
		}
		else{
			System.out.println("Invalid day index.");
		}
	}

	public static void main(String[] args){
		DayNested dayNested = new DayNested();
		dayNested.DayIndex(1);
		dayNested.DayIndex(3);
		dayNested.DayIndex(7);
		dayNested.DayIndex(6);
		dayNested.DayIndex(5);
		dayNested.DayIndex(0);
		dayNested.DayIndex(-1);
	}
}