package umakantSahani;
//Assignment10
class MonthIndex{
	
	void printMonthWithQuarter(int monthIndex){
		if(monthIndex > 12 || monthIndex < 1){
			if(monthIndex > 12){
				System.out.println("invalid month index, it can't be greater than 12");
			}
			else{
				System.out.println("invalid month index, it can't be less than 1");
			}
		}
		else if(monthIndex > 9 && monthIndex <= 12){
			if(monthIndex == 12){
				System.out.println("Month index 12 is in Q4, its December.");
			}
			else if(monthIndex == 11){
				System.out.println("Month index 11 is in Q4, its November.");
			}
			else{
				System.out.println("Month index 10 is in Q4, its October.");
			}
		}
		else if(monthIndex > 6 && monthIndex <= 9){
			if(monthIndex == 9){
				System.out.println("Month index 9 is in Q3, its September.");
			}
			else if(monthIndex == 8){
				System.out.println("Month index 8 is in Q3, its August.");
			}
			else{
				System.out.println("Month index 7 is in Q3, its July.");
			}
		}
		else if(monthIndex > 3 && monthIndex <= 6){
			if(monthIndex == 6){
				System.out.println("Month index 6 is in Q2, its June.");
			}
			else if(monthIndex == 5){
				System.out.println("Month index 5 is in Q2, its May.");
			}
			else{
				System.out.println("Month index 4 is in Q2, its April.");
			}
		}
		else{
			if(monthIndex == 3){
				System.out.println("Month index 3 is in Q1, its March.");
			}
			else if(monthIndex == 2){
				System.out.println("Month index 2 is in Q1, its February.");
			}
			else{
				System.out.println("Month index 1 is in Q1, its January.");
			}
		}
	}
	
	public static void main(String[] args){
		MonthIndex monthIndex = new MonthIndex();
		monthIndex.printMonthWithQuarter(5);
		monthIndex.printMonthWithQuarter(2);
		monthIndex.printMonthWithQuarter(-3);
		monthIndex.printMonthWithQuarter(13);
	}
}