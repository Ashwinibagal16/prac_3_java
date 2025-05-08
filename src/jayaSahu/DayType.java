package jayaSahu;

class DayType{
      
	  void dayIndex(int index){
	  if(index>=1 && index<=7){
		if(index>=1 && index<=5){
			System.out.println("it is a weekday");
		if(index == 1){
		   System.out.println("Monday");	
		}
         else if (index ==2){
			 System.out.println("Tuesday");
	    }
		 else if (index ==3){
			 System.out.println("Wednesday");
		}  
		 else if (index ==4){
			 System.out.println("Thursday");
		}
		else if (index ==5){
			 System.out.println("Friday");
		}
		 }
		 else{
			 System.out.println("It is Weekend");
			if (index == 6){
				System.out.println("Saturday");
			}
             else{
				 System.out.println("Sunday");
				 
			}			
		}
	}
		else{
			System.out.println("Invalid day index");
		} 
	}
	
	 public static void main(String [] args){
		DayType daytype = new DayType();
        daytype.dayIndex(3);
		daytype.dayIndex(7);
		daytype.dayIndex(0);
	}
	
	
}
	