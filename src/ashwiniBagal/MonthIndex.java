package ashwiniBagal;

class MonthIndex{
	
   void printMonthIndex(int monthInfo){
     if (monthInfo >=1 && monthInfo<=12){
	   if(monthInfo >=1 && monthInfo <=3){
	     System.out.println("Month Info " + monthInfo + " is in Q1");
		  if(monthInfo==1){
		   System.out.println("January");
	}
	    else if(monthInfo==2){
		   System.out.println("February");
     }
        else if(monthInfo==3){
		   System.out.println("March");
     }
    } else if(monthInfo>=4 && monthInfo<=6){
         System.out.println("Month Info " + monthInfo + "is in Q2");
          if(monthInfo==4){
           System.out.println("April");
     }
      else if(monthInfo==5){
        	System.out.println("May");
     }
      else if(monthInfo==6){
        	System.out.println("June");
     }
	}
	  else if (monthInfo>=7 && monthInfo<=9){
	   System.out.println("Month Index " +monthInfo + "is in Q3");
	    if(monthInfo==7){
		  System.out.println("july");
		}
         else if(monthInfo==8){
              System.out.println("August");
		}	
          else if(monthInfo==9){
              System.out.println("September");
		}
      }
         else{
             System.out.println("Month Info " + monthInfo + "is in Q4");
              if(monthInfo==10){
                System.out.println("October");
        }
          	else if(monthInfo==11){
                System.out.println("November");
        }
		     else if(monthInfo==12){
                System.out.println("December");
          }
	     }
       
          }     else{
              System.out.println("enter the valid month info, valid month info should be in between 1 to 12");
    }
  }	
     public static void main(String[] args){
	   MonthIndex monthIndex = new MonthIndex();
	   monthIndex.printMonthIndex(5);
	   monthIndex.printMonthIndex(4);
	   monthIndex.printMonthIndex(8);
	   monthIndex.printMonthIndex(12);
	
	  
	}
}

         		
         		
	   
      	 	 
		 