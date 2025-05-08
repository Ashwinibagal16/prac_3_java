package vivekDhole;

class Assignment11 {

	void  dayValue(int value) {

		if(value >= 1 && value <= 7) {

			if(value >= 1 && value <=5) {

				if(value == 1) {
					System.out.println("Its a Weekday and the Day is Monday");
				} else if(value == 2) {
					System.out.println("Its a Weekday and the Day is Tuesday");
				} else if(value == 3) {
					System.out.println("Its a Weekday and the Day is Wednesday");
				} else if(value == 4) {
					System.out.println("Its a Weekday and the Day is Thrusday");
				} else if(value == 5) {
					System.out.println("Its a Weekday and the Day is Friday");
				} 

			}else if(value >= 6 && value <=7) {

				if(value == 6) {
					System.out.println("Its a Weekend and the Day is Saturday");
				} else if(value == 7) {
					System.out.println("Its a Weekend and the Day is Sunday");
				}

			} 
				
		} else {
		System.out.println("Invalid day index.");	
		}
	}		

	public static void main(String[] args) {
		Assignment11 dayindex = new Assignment11();
		dayindex.dayValue(3);
		dayindex.dayValue(7);
		dayindex.dayValue(0);
		dayindex.dayValue(27);
		dayindex.dayValue(-3);	
	}
}
