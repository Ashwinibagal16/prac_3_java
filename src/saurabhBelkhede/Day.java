package saurabhBelkhede;



class Day{

	void printDay(int dayIndex){
		if(dayIndex >= 1 && dayIndex <=5){
			System.out.println("It's a weekday");
				if (dayIndex ==1){
					System.out.println("It's a monday");
				}
				if (dayIndex ==2){
					System.out.println("It's a tuesday");
					}
				if (dayIndex ==3){
					System.out.println("It's a wed");
				}
				if (dayIndex ==4){
					System.out.println("It's a thu");
				}
				if (dayIndex ==5){
					System.out.println("Thank god its Fri");
				}
			}else{
				System.out.println("It's a Weekend");
				if (dayIndex ==6){
					System.out.println("It's a Saturday");
				}
				if (dayIndex ==7){
					System.out.println("It's a Sunday");
				}
			}
					
		}

		
		public static void main(String[] args){
			Day day = new Day();
			day.printDay(1);
			day.printDay(2);
			day.printDay(3);
			day.printDay(4);
			day.printDay(5);
			day.printDay(6);
			day.printDay(7);
		}
	
}

	
	