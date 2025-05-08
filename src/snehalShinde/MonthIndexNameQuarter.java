package snehalShinde;

class MonthIndexNameQuarter{
	
	void monthInfo(int monthIndex){
		if(monthIndex >= 1 && monthIndex <= 12){
			if(monthIndex >= 1 && monthIndex <= 3){
				System.out.println("The given month index is : " + monthIndex + "\n" + "Hence this month is from Quarter-I.");
					if(monthIndex == 1){
						System.out.println("The name of the month is : January");
						System.out.println("---------------------------------------------");
					}else if(monthIndex == 2){
						System.out.println("The name of the month is : February");
						System.out.println("---------------------------------------------");
					}else if(monthIndex == 3){
						System.out.println("The name of the month is : March");
						System.out.println("---------------------------------------------");
					}
			}else if(monthIndex >= 4 && monthIndex <= 6){
				System.out.println("The given month index is : " + monthIndex + "\n" + "Hence this month is from Quarter-II.");
					if(monthIndex == 4){
						System.out.println("The name of the month is : April");
						System.out.println("---------------------------------------------");
					}else if(monthIndex == 5){
						System.out.println("The name of the month is : May");
						System.out.println("---------------------------------------------");
					}else if(monthIndex == 6){
						System.out.println("The name of the month is : June");
						System.out.println("---------------------------------------------");
					}
			}else if(monthIndex >= 7 && monthIndex <= 9){
				System.out.println("The given month index is : " + monthIndex + "\n" + "Hence this month is from Quarter-III.");
					if(monthIndex == 7){
						System.out.println("The name of the month is : July");
						System.out.println("---------------------------------------------");
					}else if(monthIndex == 8){
						System.out.println("The name of the month is : August");
						System.out.println("---------------------------------------------");
					}else if(monthIndex == 9){
						System.out.println("The name of the month is : September");
						System.out.println("---------------------------------------------");
					}						
			}else{
				System.out.println("The given month index is : " + monthIndex + "\n" + "Hence this month is from Quarter-IV.");
					if(monthIndex == 10){
						System.out.println("The name of the month is : October");
						System.out.println("---------------------------------------------");
					}else if(monthIndex == 11){
						System.out.println("The name of the month is : November");
						System.out.println("---------------------------------------------");
					}else if(monthIndex == 12){
						System.out.println("The name of the month is : December");
						System.out.println("---------------------------------------------");
					}
			}				
		}else{
			System.out.println("The given month index is :" + monthIndex + "\n" + "This is invalid month Index. Kindly provide value in between 1 and 12.");
			System.out.println("---------------------------------------------");
		}
	}
	
	public static void main(String[] args){
			MonthIndexNameQuarter monthIndexNameQuarter = new MonthIndexNameQuarter();
			monthIndexNameQuarter.monthInfo(5);
			monthIndexNameQuarter.monthInfo(2);
			monthIndexNameQuarter.monthInfo(3);
			monthIndexNameQuarter.monthInfo(-3);
			monthIndexNameQuarter.monthInfo(13);
	}
}