package poojaJoshi;

class MonthIndex_Assignment10{   
	
	void displayOutput(int month){
		if (month >1 && month <=3){
			if(month==1){
			System.out.println("Month index " +month+ " is in Q1, its January.");
			}else if(month==2){
			System.out.println("Month index " +month+ " is in Q1, its february.");
			}else if(month==3){
			System.out.println("Month index " +month+ " is in Q1, its march.");
			}
		}
		
		if (month >4 && month <=6){
			if(month==4){
			System.out.println("Month index " +month+ " is in Q1, its April.");
			}else if(month==5){
			System.out.println("Month index " +month+ " is in Q1, its May.");
			}else if(month==6){
			System.out.println("Month index " +month+ " is in Q1, its June.");
			}
		}
		if (month >7 && month <=9){
			if(month==7){
			System.out.println("Month index " +month+ " is in Q1, its July.");
			}else if(month==8){
			System.out.println("Month index " +month+ " is in Q1, its August.");
			}else if(month==9){
			System.out.println("Month index " +month+ " is in Q1, its September.");
			}
		}
			
		if (month >10 && month <=12){
			if(month==10){
			System.out.println("Month index " +month+ " is in Q1, its October.");
			}else if(month==11){
			System.out.println("Month index " +month+ " is in Q1, its November.");
			}else if(month==12){
			System.out.println("Month index " +month+ " is in Q1, its December.");
			}
		}
		
		if (month <1){
			System.out.println("invalid Input");
			}else if (month>12){
				System.out.println("invalid month index, it can't be greater than 13");
			}
	}
		
		public static void main(String[]args){
			MonthIndex_Assignment10 month = new MonthIndex_Assignment10();
			month.displayOutput(5);
			month.displayOutput(2);
			month.displayOutput(-3);
			month.displayOutput(13);
		}
}
