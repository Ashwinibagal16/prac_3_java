//Assignment 10
package jeetHingrajiya;
class Month{
	String quater = "";
	void monthName(int index){
		if(index >=1 && index <=12 ){
			if(index>=1 && index<=3){
				quater="Q1";
				if(index == 1){
					System.out.println("Month Index 1 is in " +quater+ " It's January");
				}
				else if(index == 2){
					System.out.println("Month Index 2 is in " +quater+ " It's February");
				}
				else if(index == 3){
					System.out.println("Month Index 3 is in " +quater+ " It's March");
				}
			}
			else if(index>=4 && index<=6){
				quater="Q2";
				if(index == 4){
					System.out.println("Month Index 4 is in " +quater+ " It's April");
				}
				else if(index == 5){
					System.out.println("Month Index 5 is in " +quater+ " It's May");
				}
				else if(index == 6){
					System.out.println("Month Index 6 is in " +quater+ " It's June");
				}
			}
			else if(index>=7 && index<=9){
				quater="Q3";
				if(index == 7){
					System.out.println("Month Index 7 is in " +quater+ " It's July");
				}
				else if(index == 8){
					System.out.println("Month Index 8 is in " +quater+ " It's August");
				}
				else if(index == 9){
					System.out.println("Month Index 9 is in " +quater+ " It's September");
				}
			}
			else if(index>=10 && index<=12){
				quater="Q4";
				if(index == 10){
					System.out.println("Month Index 10 is in " +quater+ " It's October");
				}
				else if(index == 11){
					System.out.println("Month Index 11 is in " +quater+ " It's November");
				}
				else if(index == 12){
					System.out.println("Month Index 12 is in " +quater+ " It's December");
				}
			}
		}
		
		else if(index <=0){
			System.out.println("invalid month index, it can't be 0 or Nagetive");
		}
		
		else{
			System.out.println("invalid month index, it can't be greater than 12");
		}
	}
	
	public static void main(String [] args){
		Month month = new Month();
		month.monthName(5);
		month.monthName(2);
		month.monthName(-3);
		month.monthName(13);
	}
}