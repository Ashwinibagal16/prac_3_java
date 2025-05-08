package nitinSharma;
class MonthIndex{
	
	void monthCount(int month){
		if(month >= 1 && month <= 12){
			System.out.println("It's a valid output");
			if(month >= 1 && month <= 3){
				System.out.println("It's Quarter one");
				if(month == 1){
					System.out.println("It's January");
				}else if(month == 2){
					System.out.println("It's February");
				}else if(month == 3){
					System.out.println("It's March");
				}
			}
			if(month >= 4 && month <= 6){
				System.out.println("It's Quarter two");
				if(month == 4){
					System.out.println("It's April");
				}else if(month == 5){
					System.out.println("It's May");
				}else if(month == 6){
					System.out.println("It's June");
				}
			}
			if(month >= 7 && month <= 9){
				System.out.println("It's Quarter three");
				if(month == 7){
					System.out.println("It's July");
				}else if(month == 8){
					System.out.println("It's August");
				}else if(month == 9){
					System.out.println("It's September");
				}
			}
			if(month >= 10 && month <= 12){
				System.out.println("It's Quarter four");
				if(month == 10){
					System.out.println("It's October");
				}else if(month == 11){
					System.out.println("It's November");
				}else if(month == 12){
					System.out.println("It's December");
				}
			}
		}else{
			System.out.println("It's not a valid MonthIndex: "+ month +" It should be between 1 to 12");
		}
	}
	
	public static void main(String[] args){
		MonthIndex monthIndex = new MonthIndex();
		monthIndex.monthCount(5);
		System.out.println("-----------------------------------");
		monthIndex.monthCount(10);
		System.out.println("-----------------------------------");
		monthIndex.monthCount(15);
		System.out.println("-----------------------------------");
		monthIndex.monthCount(-5);
	}
}