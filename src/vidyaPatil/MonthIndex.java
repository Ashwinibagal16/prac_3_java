package vidyaPatil;

class MonthIndex{
	
	String Quarter;

	void displayQuarterMonth(int index){
		if (index >=1 && index <= 12){
			if (index >= 1 && index <= 3){
				Quarter = "Q1";
				if (index == 1){
					System.out.println("Month Index is "+ index + " is in "+ Quarter + ", Its January");
				}else if (index ==2){
					System.out.println("Month Index is "+ index + " is in "+ Quarter + ", Its February");
				}else {
					System.out.println("Month Index is "+ index + " is in "+ Quarter + ", Its March");
				}
			}else if (index >=4 && index <= 6){
				Quarter = "Q2";
				if (index == 4){
					System.out.println("Month Index is "+ index + " is in "+ Quarter + ", Its April");
				}else if (index == 5){
					System.out.println("Month Index is "+ index + " is in "+ Quarter + ", Its May");
				}else {
					System.out.println("Month Index is "+ index + " is in "+ Quarter + ", Its June");
				}	
			}else if (index >=7 && index <= 9){
				Quarter = "Q3";
				if (index == 7){
					System.out.println("Month Index is "+ index + " is in "+ Quarter + ", Its July");
				}else if (index == 8){
					System.out.println("Month Index is "+ index + " is in "+ Quarter + ", Its August");
				}else {
					System.out.println("Month Index is "+ index + " is in "+ Quarter + ", Its September");
				}	
			}else {
				Quarter = "Q4";
				if (index == 10){
					System.out.println("Month Index is "+ index + " is in "+ Quarter + ", Its October");
				}else if (index == 11){
					System.out.println("Month Index is "+ index + " is in "+ Quarter + ", Its November");
				}else {
					System.out.println("Month Index is "+ index + " is in "+ Quarter + ", Its December");
				}
			}			
		}else if (index <0){
			System.out.println(index + " is invalid month index, it can't be negative.");
		}else{
			System.out.println(index + " is invalid month index, it can't be greater than 12.");
		}		
	}
	
	public static void main(String [] args){
		MonthIndex monthIndex = new MonthIndex();
		monthIndex.displayQuarterMonth(5);
		monthIndex.displayQuarterMonth(1);
		monthIndex.displayQuarterMonth(9);
		monthIndex.displayQuarterMonth(6);
		monthIndex.displayQuarterMonth(11);
		monthIndex.displayQuarterMonth(-6);
		monthIndex.displayQuarterMonth(13);
		monthIndex.displayQuarterMonth(14);
	}

}