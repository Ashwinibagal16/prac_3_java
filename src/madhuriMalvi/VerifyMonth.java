/*Please use nested if else for below requirement.
Based on month index, print quarter and name of the month.
1 to 3 → Q1
4 to 6 → Q2
7 to 9 → Q3
10 to 12 → Q4
input : 5 output : Month index 5 is in Q2, its May.
input : 2 output : Month index 2 is in Q1, its Febuary.
input : -3 output: invalid month index, it can't be negative.
input : 13 output: invalid month index, it can't be greater than 13.*/
package madhuriMalvi;
class VerifyMonth{
	void printMonthInfo(int monthIndex){
		if(monthIndex>=1 && monthIndex<=12){	
			if(monthIndex >=1 && monthIndex<=3){
				System.out.print("Month index " +monthIndex+ " is in Q1 its");
					if(monthIndex == 1){
						System.out.println(" January");
					}
					else if(monthIndex == 2){
						System.out.println(" Feburary");
					}
					else if(monthIndex == 3){
						System.out.println(" March");
					}
			}
			else if(monthIndex >=4 && monthIndex<=6){
				System.out.print("Month index " +monthIndex+ " is in Q2 its");
					if(monthIndex == 4){
						System.out.println(" April");
					}
					else if(monthIndex == 5){
						System.out.println(" May");
					}
					else if(monthIndex == 6){
						System.out.println(" June");
					}
			}
			else if(monthIndex >=7 && monthIndex<=9){
				System.out.print("Month index " +monthIndex+ " is in Q3 its");
					if(monthIndex == 7){
						System.out.println(" July");
					}
					else if(monthIndex == 8){
						System.out.println(" August");
					}
					else if(monthIndex == 9){
						System.out.println(" September");
					}
			}
			else if(monthIndex >=10 && monthIndex<=12){
				System.out.print("Month index " +monthIndex+ " is in Q4 its");
					if(monthIndex == 10){
						System.out.println(" October");
					}
					else if(monthIndex == 11){
						System.out.println(" November");
					}
					else if(monthIndex == 12){
						System.out.println(" December");
					}
			}
		}else if(monthIndex <= 0){
			System.out.println("invalid month index, it can't be negative or Zero");
		}
		else{
			System.out.println("invalid month index, it can't be greater than 13");
		}
	}
	
	public static void main(String[] args){
		VerifyMonth verifymonth = new VerifyMonth();
		verifymonth.printMonthInfo(1);
		verifymonth.printMonthInfo(2);
		verifymonth.printMonthInfo(3);
		verifymonth.printMonthInfo(4);
		verifymonth.printMonthInfo(5);
		verifymonth.printMonthInfo(6);
		verifymonth.printMonthInfo(7);
		verifymonth.printMonthInfo(8);
		verifymonth.printMonthInfo(9);
		verifymonth.printMonthInfo(10);
		verifymonth.printMonthInfo(11);
		verifymonth.printMonthInfo(12);
		verifymonth.printMonthInfo(0);
		verifymonth.printMonthInfo(-3);
		verifymonth.printMonthInfo(13);
	}
}
