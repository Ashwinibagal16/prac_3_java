package anushreePatra;

class DayType{
	void printDayInfo(int dayIndex){
		if(dayIndex==1){                                      //if else ladder
			System.out.println("It's a Weekday.");
			System.out.println("It's a Monday.");
			System.out.println(" ");
		}else if(dayIndex==2){
			System.out.println("It's a Weekday.");
			System.out.println("It's a Tuesday.");
			System.out.println(" ");
		}else if(dayIndex==3){
			System.out.println("It's a Weekday.");
			System.out.println("It's a Wednesday.");
			System.out.println(" ");
		}else if(dayIndex==4){
			System.out.println("It's a Weekday.");
			System.out.println("It's a Thursday.");
			System.out.println(" ");
		}else if(dayIndex==5){
			System.out.println("It's a Weekday.");
			System.out.println("It's a Friday.");
			System.out.println(" ");
		}else if(dayIndex==6){
			System.out.println("It's a Weekend.");
			System.out.println("It's a Saturday.");
			System.out.println(" ");
		}else if(dayIndex==7){
			System.out.println("It's a Weekend.");
			System.out.println("It's a Sunday.");
			System.out.println(" ");
		}else{
			System.out.println("Invalid day index.");
		}
	}	
		
	public static void main(String[] args){
		DayType dayType = new DayType();
		dayType.printDayInfo(3);
		dayType.printDayInfo(7);
		dayType.printDayInfo(0);
	}
}