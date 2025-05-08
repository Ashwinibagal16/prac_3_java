package krupa;

class MonthIndex {
 
  void printMonthIndex(int monthNumber) {
	 if(monthNumber>=1 && monthNumber<=12) {
		if(monthNumber>=1 && monthNumber<=3) {
			System.out.println("Q1") ;
			  if(monthNumber==1) {
				  System.out.println("January");
			  }else if(monthNumber==2) {
				  System.out.println("February");
			  }else {
				  System.out.println("March");
			  }
			  
			
		} else if(monthNumber>=4 && monthNumber<=6) {
			System.out.println("Q2") ;
			if(monthNumber==4) {
				  System.out.println("April");
			  }else if(monthNumber==5) {
				  System.out.println("May");
			  }else {
				  System.out.println("June");
			  }
			
		} else if(monthNumber>=7 && monthNumber<=9) {
			System.out.println("Q3") ;
			if(monthNumber==7) {
				  System.out.println("July");
			  }else if(monthNumber==8) {
				  System.out.println("August");
			  }else {
				  System.out.println("September");
			  }
		} else {
			System.out.println("Q4") ;
			if(monthNumber==10) {
				  System.out.println("October");
			  }else if(monthNumber==11) {
				  System.out.println("November");
			  }else {
				  System.out.println("December");
			  }
	 } 	 
	  
  }else {
		System.out.println("invalid month index, it should be between 1 to 12") ;
	 }
  }
  
  public static void main(String[] args) {
	  MonthIndex monthIndex = new MonthIndex();
	  monthIndex.printMonthIndex(6);
	  monthIndex.printMonthIndex(9);
	  monthIndex.printMonthIndex(12);
	  monthIndex.printMonthIndex(13);
	  
  }
  

}