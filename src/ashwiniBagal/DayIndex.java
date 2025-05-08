package ashwiniBagal;

class DayIndex{

  void printDetail(int index){
    if(index >=1 && index <= 7){
	  if(index >=1 && index <= 5){
	      System.out.println("It's a Weekday");
	   if(index == 1){
	      System.out.println("Monday");
	 }
	   else if(index ==2){
	     System.out.println("Tuesday");
	 }	 
	    else if(index ==3){
	     System.out.println("Wedenesday");
	 }
	    else if(index ==4){
	     System.out.println("Thursday");
	 }
	     else{
	     System.out.println("Friday");
     } 
	  }	 
	    else{
            System.out.println("It's a Weekend");
		  if(index == 6){
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
      public static void main(String[] args){
        DayIndex dayindex = new DayIndex();
	    dayindex.printDetail(4);
		dayindex.printDetail(7);
		dayindex.printDetail(0);
	}
 }	