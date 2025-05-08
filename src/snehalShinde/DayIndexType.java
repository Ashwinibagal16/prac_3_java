package snehalShinde;

class DayIndexType{

	void dayIndexInfo(int dayIndex){
		if(dayIndex >= 1 && dayIndex <= 7){
			if(dayIndex >= 1 && dayIndex <= 5){
				System.out.println("The given day index is : " + dayIndex + "\n" + "Hence it's a Weekday.");
					if(dayIndex == 1){
						System.out.println("And for the given Index, the day is - Monday");
						System.out.println("---------------------------------------------");
					}else if(dayIndex == 2){
						System.out.println("And for the given Index, the day is - Tuesday");
						System.out.println("---------------------------------------------");
					}else if(dayIndex == 3){
						System.out.println("And for the given Index, the day is - Wednesday");
						System.out.println("---------------------------------------------");
					}else if(dayIndex == 4){
						System.out.println("And for the given Index, the day is - Thursday");
						System.out.println("---------------------------------------------");
					}else if(dayIndex == 5){
						System.out.println("And for the given Index, the day is - Friday");
						System.out.println("---------------------------------------------");
					}						
			}else{
				System.out.println("The given day index is : " + dayIndex + "\n" + "Hence it's a Weekend.");
					if(dayIndex == 6){
						System.out.println("And for the given Index, the day is - Saturday");
						System.out.println("---------------------------------------------");
					}else{
						System.out.println("And for the given Index, the day is - Sunday");
						System.out.println("---------------------------------------------");
					}
			}				
		}else{
			System.out.println("The given day index is :" + dayIndex + "\n" + "This is invalid day Index. Kindly provide value in between 1 and 7.");
			System.out.println("---------------------------------------------");
		}
	}		
	
	public static void main(String[] args){
			DayIndexType dayIndexType = new DayIndexType();
			dayIndexType.dayIndexInfo(3);
			dayIndexType.dayIndexInfo(7);
			dayIndexType.dayIndexInfo(0);
			dayIndexType.dayIndexInfo(-3);
			dayIndexType.dayIndexInfo(8);
	}
}