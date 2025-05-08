//Assignment 11
package jeetHingrajiya;
class Day{
	
	void dayName(int index){
		if(index>=1 && index<=7){
			if(index>=1 && index <=5){
				System.out.println("It's Weekday");
				if(index == 1){
					System.out.println("Monday");
				}
				else if(index == 2){
					System.out.println("Tuesday");
				}
				else if(index == 3){
					System.out.println("Wednesday");
				}
				else if(index == 4){
					System.out.println("Thursday");
				}
				else if(index == 5){
					System.out.println("Friday");
				}
				
			}
			else if(index==6 || index ==7){
				System.out.println("It's Weekend");
				if(index == 6){
					System.out.println("Saturday");
				}
				else if(index == 7){
					System.out.println("Sunday");
				}
				
			}
			
		}	
		else
			System.out.println("Invalid Day Index");
		
	}
	
	public static void main(String [] args){
		Day day = new Day();
		day.dayName(3);
		day.dayName(7);
		day.dayName(0);
	}
}