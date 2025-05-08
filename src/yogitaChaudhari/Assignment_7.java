package yogitaChaudhari;

public class Assignment_7 {
	
		
		void printDay(int day){
			if(day >=1 && day<=7){
				if(day >= 1 && day <=5){
					System.out.println("its a weekdays");
					if(day==1){
						System.out.println("its a Monday");
					}else if(day==2){
						System.out.println("its a Tuesday");
					}else if(day==3){
						System.out.println("its a Wednesday");
					}else if(day==4){
						System.out.println("its a Thursday");
					}else if(day==5){
						System.out.println("its a friday");
					}
				}else {
					System.out.println("its a weekend");
					if(day==6){
						System.out.println("its a Saturday");
					}else{
						System.out.println("its a Sunday");
					}
				}
				
			}else{
				System.out.println("its a invalid days" + day);
			}
			
		}
		public static void main (String[] args){
			Assignment_7 dayIndex = new Assignment_7();
		dayIndex.printDay(1);
		dayIndex.printDay(2);
		dayIndex.printDay(3);
		dayIndex.printDay(4);
		dayIndex.printDay(5);
		dayIndex.printDay(6);
		dayIndex.printDay(7);
		dayIndex.printDay(8);
		dayIndex.printDay(-5);
		}
		
		
		
	



}
