package yogeshGhuge;

public class Assignment_10 {
	
	void printquarter(int month) {
		if(month>=1 && month<=12) {
			if(month>=1 && month<=3) {
				if(month==1) {
					System.out.println("Its Q1 and month janauary" +  month);
				} else if(month==2) {
					System.out.println("Its Q1 and month February" +  month);
				}else if(month==3) {
					System.out.println("Its Q1 and month March" +  month);
				}
				//System.out.println("its valid month of Q1 " + month );
			    }else if(month>=4 && month<=6) {
				if(month==4) {
					System.out.println("Its Q2 and month April " + month);
				}else if(month==5) {
					System.out.println("Its Q2 and month May  " + month);
				}else if(month==6) {
					System.out.println("Its Q2 and month june" + month);
				}
				
				//System.out.println("its valid month of Q2  " + month);
				
			}else if(month>=7 && month<=9) {
				if(month==7) {
					System.out.println("Its Q3 and month july " + month);
				}else if (month==8) {
					System.out.println("Its Q3 and month August " + month);
				}else if(month==9) {
					System.out.println("Its Q3 and month September " + month);
				}
				
				//System.out.println("its valid month of Q3  " + month);
			}else if(month>=10 && month<=12) {
				if(month==10){
					System.out.println("Its Q4 and month October " + month);
				}else if(month==11) {
					System.out.println("Its Q4 and month November " + month);
				}else if(month==12) {
					System.out.println("Its Q4 and month December " + month);
				}
				//System.out.println("its valid month of Q3  " + month);
			}
			
		}else {
			System.out.println("invalid input month should be in between 1 to 12 only");
			 }
			//System.out.println("invalid input month should be in between 1 to 12 only");
	}
	public static void main(String[] args) {
		Assignment_10 quarter = new Assignment_10();
		quarter.printquarter(5);
		quarter.printquarter(8);
		quarter.printquarter(16);
		
	}

}

/*Please use nested if else for below requirement.
Based on month index, print quarter and name of the month.
1 to 3 → Q1
4 to 6 → Q2
7 to 9 → Q3
10 to 12 → Q4
input : 5 output : Month index 5 is in Q2, its May.
input : 2 output : Month index 2 is in Q1, its Febuary.
input : -3 output: 
input : 13 output: invalid month index, it can't be greater than 13. */
