package shrutiPundikar;

class MonthIndex{
	
	void printMonthIndex(int monthIndex){
		if(monthIndex>=1 && monthIndex<=12){
			if(monthIndex >= 1 && monthIndex <= 3){
				System.out.print("Month Index " + monthIndex + " is in Q1,");
				if(monthIndex == 1){
					System.out.println(" its January");
				}else if(monthIndex ==2){
					System.out.println(" its February");
				}else if(monthIndex == 3){
					System.out.println(" its March");
				}
			}else if(monthIndex >= 4 && monthIndex <= 6){
				System.out.print("Month Index " + monthIndex + " is in Q2,");
				if(monthIndex == 4){
					System.out.println(" its April");
				}else if(monthIndex == 5){
					System.out.println(" its May");
				}else if(monthIndex == 6){
					System.out.println(" its June");
				}
			}else if(monthIndex >= 7 && monthIndex <= 9){
				System.out.print("Month Index " + monthIndex + " is in Q3,");
				if(monthIndex == 7){
					System.out.println(" its July");
				}else if(monthIndex == 8){
					System.out.println(" its August");
				}else if(monthIndex == 9){
					System.out.println(" its September");
				}
		    }else if(monthIndex >= 10 && monthIndex <= 12){
				System.out.print("Month Index " + monthIndex + " is in Q4,");
				if(monthIndex == 10){
					System.out.println(" its October");
				}else if(monthIndex == 11){
					System.out.println(" its November");
				}else if(monthIndex == 12){
					System.out.println(" its December");
				}
			}
		}else{
			if(monthIndex < 0){
				System.out.println(monthIndex+ " Month Index can't be negative.");
			}else if(monthIndex > 12){
				System.out.println(monthIndex+ " Invalid Month Index, it can't be greater than 12.");
			}
		}
	}
	
	public static void main(String[] args){
		MonthIndex monthindex = new MonthIndex();
		monthindex.printMonthIndex(5);
		monthindex.printMonthIndex(2);
		monthindex.printMonthIndex(8);
		monthindex.printMonthIndex(10);
		monthindex.printMonthIndex(-3);
		monthindex.printMonthIndex(13);
	}
}