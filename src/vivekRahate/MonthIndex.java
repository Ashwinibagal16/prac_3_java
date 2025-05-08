package vivekRahate;
class MonthIndex{
	void printMonth(int month){
		if(month >= 1 && month <= 12){
			if(month >= 1 && month <= 3){
				{
					if(month == 1){
						System.out.println("Month index " + month + " is in Q1, its January.");
					}
					else if(month == 2){
						System.out.println("Month index " + month + " is in Q1, its February.");
					}
					else if (month == 3){
						System.out.println("Month index " + month + " is in Q1, its March.");
					}
					
				}
			}
			else if(month >= 4 && month <= 6){
				{
					if(month == 4){
						System.out.println("Month index " + month + " is in Q2, its April.");
					}
					else if(month == 5){
						System.out.println("Month index " + month + " is in Q2, its May.");
					}
					else if (month == 6){
						System.out.println("Month index " + month + " is in Q2, its June.");
					}
					
				}
			}
			else if(month >= 7 && month <= 9){
				{
					if(month == 7){
						System.out.println("Month index " + month + " is in Q3, its July.");
					}
					else if(month == 8){
						System.out.println("Month index " + month + " is in Q3, its August.");
					}
					else if (month == 9){
						System.out.println("Month index " + month + " is in Q3, its September.");
					}
					
				}
			}
			else if(month >= 10 && month <= 12){
				{
					if(month == 10){
						System.out.println("Month index " + month + " is in Q4, its October.");
					}
					else if(month == 11){
						System.out.println("Month index " + month + " is in Q4, its November.");
					}
					else if (month == 12){
						System.out.println("Month index " + month + " is in Q4, its December.");
					}
					
				}
			}
		}
		else{
			System.out.println("This is not valid Month and it can be more than 12 month");
		}
	}
	
	public static void main(String[] a){
		MonthIndex monthindex = new MonthIndex();
		monthindex.printMonth(3);
		monthindex.printMonth(5);
		monthindex.printMonth(7);
		monthindex.printMonth(11);
		monthindex.printMonth(13);
	}
}