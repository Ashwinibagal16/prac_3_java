package yogitaChaudhari;

public class Assignment_6 {
	
		
		void printQuarter(int month){
			
			if(month >= 1  && month<=12){
				if(month>=1 && month <=3){
					System.out.println("This is Q1 Index");
					if(month==1){
						System.out.println("January");
					}else if(month==2){
						System.out.println("February");
					}else{
						System.out.println("March");
					}
				}else if(month>=4 && month<=6){
					System.out.println("This is Q2 Index");
					if(month==4){
						System.out.println("April");
					}else if(month==5){
						System.out.println("May");
					}else{
						System.out.println("June");
					}
				}else if(month>=7 && month<=9){
					System.out.println("This is Q3 Index");
					if(month==7){
						System.out.println("Jully");
					}else if(month==8){
						System.out.println("August");
					}else{
						System.out.println("Subtember");
					}
				}else{
					System.out.println("This is Q4 Index");
					if(month==10){
						System.out.println("October");
					}else if(month==11){
						System.out.println("November");
					}else{
						System.out.println("December");
					}
				}
					
			}
			else{
				System.out.println("Invalid Quater" +month);
				System.out.println("Invalid Quater" +month);
			}
		}
		public static void main (String[] args){
			Assignment_6 monthIndex = new Assignment_6();
			monthIndex.printQuarter(1);
			monthIndex.printQuarter(2);
			monthIndex.printQuarter(3);
			monthIndex.printQuarter(4);
			monthIndex.printQuarter(5);
			monthIndex.printQuarter(6);
			monthIndex.printQuarter(7);
			monthIndex.printQuarter(8);
			monthIndex.printQuarter(9);
			monthIndex.printQuarter(10);
			monthIndex.printQuarter(11);
			monthIndex.printQuarter(12);
			monthIndex.printQuarter(13);
			monthIndex.printQuarter(-4);
		
		}
		
		
		
	



}
