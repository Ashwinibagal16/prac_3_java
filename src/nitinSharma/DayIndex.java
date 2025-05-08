package nitinSharma;
class DayIndex{
	
	void dayInd(int dayCount){

		if(dayCount >= 1 && dayCount <=7){
			System.out.println("It's a day of the week");
			if(dayCount >= 1 && dayCount <=5){
				System.out.println("It's weekday");
				if(dayCount == 1){
					System.out.println("It's Monday");
				}else if(dayCount == 2){
					System.out.println("It's Tuesday");
				}else if(dayCount == 3){
					System.out.println("It's Wednesday");
				}else if(dayCount == 4){
					System.out.println("It's Thrusday");
				}else if(dayCount == 5){
					System.out.println("It's Friday");
				}
			}else{
				System.out.println("It's weekend");
				if(dayCount == 6){
					System.out.println("It's Saturday");
				}else if(dayCount == 7){
					System.out.println("It's Sunday");
				}
			}
		}else{
			System.out.println(dayCount + " is not a correct day Index, It should be between 1 to 7");
		}
	}
	
	public static void main(String[] args){
		DayIndex dayIndex = new DayIndex();
		dayIndex.dayInd(3);
		System.out.println("-----------------------------");
		dayIndex.dayInd(5);
		System.out.println("-----------------------------");
		dayIndex.dayInd(1);
		System.out.println("-----------------------------");
		dayIndex.dayInd(9);
		System.out.println("-----------------------------");
		dayIndex.dayInd(-4);
		System.out.println("-----------------------------");
		dayIndex.dayInd(7);
	}
}