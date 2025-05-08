/*Please use nested if else for below requirement.
Based on month index, print quarter and name of the month.
1 to 3 → Q1
4 to 6 → Q2
7 to 9 → Q3
10 to 12 → Q4
input : 5 output : Month index 5 is in Q2, its May.
input : 2 output : Month index 2 is in Q1, its Febuary.
input : -3 output: 
input : 13 output: invalid month index, it can't be greater than 13.
*/

package priyankaZende;
class PrintQuarterNNameOfMonth10{

	void printQuarterNNameOfMonth(int index){
		if(index >=1 && index <= 3){
			if(index == 1){
				System.out.println("input : "+ index +" output : Month index "+index+" is in Q1, it's January.");
			}else if(index == 2){
				System.out.println("input : "+ index +" output : Month index "+index+" is in Q1, it's February.");
			}else if(index == 3){
				System.out.println("input : "+ index +" output : Month index "+index+" is in Q1, it's March.");
			}	
		}else if(index >=4 && index <= 6){
		if(index == 4){
				System.out.println("input : "+ index +" output : Month index "+index+" is in Q2, it's April.");
			}else if(index == 5){
				System.out.println("input : "+ index +" output : Month index "+index+" is in Q2, it's May.");
			}else if(index == 6){
				System.out.println("input : "+ index +" output : Month index "+index+" is in Q2, it's June.");
			}	
		}else if(index >=7 && index <= 9){
		if(index == 7){
				System.out.println("input : "+ index +" output : Month index "+index+" is in Q3, it's July.");
			}else if(index == 8){
				System.out.println("input : "+ index +" output : Month index "+index+" is in Q3, it's Augest.");
			}else if(index == 9){
				System.out.println("input : "+ index +" output : Month index "+index+" is in Q3, it's September.");
			}	
		}else if(index >=10 && index <= 12){
		if(index == 10){
				System.out.println("input : "+ index +" output : Month index "+index+" is in Q4, it's Octomber.");
			}else if(index == 11){
				System.out.println("input : "+ index +" output : Month index "+index+" is in Q4, it's November.");
			}else if(index == 12){
				System.out.println("input : "+ index +" output : Month index "+index+" is in Q4, it's December.");
			}	
		}else if(index >=13){
			System.out.println("input : "+index+" output: invalid month index, it can't be greater than 13.");
		}else if(index <=0){
			System.out.println("input : "+index+" output: invalid month index, it can't be less than 0.");
		}
	}

	public static void main(String[] args){
		PrintQuarterNNameOfMonth10 printQuarterNNameOfMonth10 = new PrintQuarterNNameOfMonth10();
		printQuarterNNameOfMonth10.printQuarterNNameOfMonth(5);
		printQuarterNNameOfMonth10.printQuarterNNameOfMonth(2);
		printQuarterNNameOfMonth10.printQuarterNNameOfMonth(-3);
		printQuarterNNameOfMonth10.printQuarterNNameOfMonth(13);
	}
}	