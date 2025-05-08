package vaibhavPatil;


class MonthInfo{
	
	void printMonthInfo(int monthIndex){
		if(monthIndex>=1 && monthIndex<=12){
			if(monthIndex>=1 && monthIndex<=3){
				System.out.println("Month Index " + monthIndex + " is in Q1");
				if(monthIndex==1){
					System.out.println("its January");
				}else if(monthIndex==2){
					System.out.println("its February");
				}else if(monthIndex==3){
					System.out.println("its March");
				}
			}else if(monthIndex>=4 && monthIndex<=6){
				System.out.println("Month Index " + monthIndex + " is in Q2");
				if(monthIndex==4){
					System.out.println("its April");
				}else if(monthIndex==5){
					System.out.println("its May");
				}else if(monthIndex==6){
					System.out.println("its June");
				}
			}else if(monthIndex>=7 && monthIndex<=9){
				System.out.println("Month Index " + monthIndex + " is in Q3");
				if(monthIndex==7){
					System.out.println("its july");
				}else if(monthIndex==8){
					System.out.println("its August");
				}else if(monthIndex==9){
					System.out.println("its September");
				}
			}else{
				System.out.println("Month Index " + monthIndex + " is in Q3");
				if(monthIndex==10){
					System.out.println("its October");
				}else if(monthIndex==11){
					System.out.println("its November");
				}else if(monthIndex==12){
					System.out.println("its December");
				}
			}
		}else{
			System.out.println("Please enter the valid month index, valid month index should be in between 1 to 12");
		}
	}
	
	public static void main(String[] args){
		MonthInfo monthInfo = new MonthInfo();
		monthInfo.printMonthInfo(5);
		monthInfo.printMonthInfo(2);
		monthInfo.printMonthInfo(3);
		monthInfo.printMonthInfo(13);
	}
}