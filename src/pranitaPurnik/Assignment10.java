/* 1. Assignment - 10 : 25th April'25

Please use nested if else for below requirement.
Based on month index, print quarter and name of the month.
1 to 3 → Q1
4 to 6 → Q2
7 to 9 → Q3
10 to 12 → Q4
input : 5 output : Month index 5 is in Q2, its May.
input : 2 output : Month index 2 is in Q1, its Febuary.
input : -3 output: invalid month index, it can't be negative.
input : 13 output: invalid month index, it can't be greater than 13 */

package pranitaPurnik;
class Assignment10{
	
	void monthDetails(int index){
		String month="";
		if(index>=1 && index<=3){
			if(index==1){
				month="January";
			}
			else if(index==2){
				month="February";
			}
			else if(index==3){
				month="March";
			}
			System.out.println("Month index "+index+" is on Q1,its "+month);
		}
		else if(index>=4 && index<=6){
			if(index==4){
				month="April";
			}
			else if(index==5){
				month="May";
			}
			else if(index==6){
				month="June";
			}
			System.out.println("Month index "+index+" is on Q2,its "+month);
		}
		else if(index>=7 && index<=9){
			if(index==7){
				month="July";
			}
			else if(index==8){
				month="August";
			}
			else if(index==9){
				month="September";
			}
			System.out.println("Month index "+index+" is on Q3,its "+month);
			
		}
		else if(index>=10 && index<=12){
			if(index==10){
				month="October";
			}
			else if(index==11){
				month="November";
			}
			else if(index==12){
				month="December";
			}
			System.out.println("Month index "+index+" is on Q4,its "+month);
			
		}
		else if(index<0){
			System.out.println("invalid month index, it can't be negative.");
		}
		else{
			System.out.println("invalid month index, it can't be greater than 12");
		}		
	}
	
	public static void main(String[] args){
		Assignment10 ex10 = new Assignment10();
		ex10.monthDetails(5);
		ex10.monthDetails(2);
		ex10.monthDetails(-3);
		ex10.monthDetails(13);
	}
}