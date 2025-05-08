//A-11
package nishmita;
class DayIndex{
	void printDay(int index){
		if(index>=1 && index<=7){
			if(index>=1 && index<=5){
				System.out.println("It's a Weekday.");
				if(index==1){
					System.out.println("Monday");
				}else if(index==2){
					System.out.println("Tuesday");
				}else if(index==3){
					System.out.println("Wednesday");
				}else if(index==4){
					System.out.println("Thursday");
				}else{
					System.out.println("Friday");
				}
			}else{
				System.out.println("It's a Weekend.");
				if(index==6){
					System.out.println("Saturday");
				}else{
					System.out.println("Sunday");
				}
			}
		}else{
			System.out.println("Invalid day Index.");
		}
	}

	public static void main(String[] args){
		DayIndex dayIndex=new DayIndex();
		dayIndex.printDay(3);
		dayIndex.printDay(7);
		dayIndex.printDay(0);
	}
}