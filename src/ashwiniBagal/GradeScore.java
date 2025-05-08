package ashwiniBagal;

class GradeScore{

    void printGrade(int score){
	  if(score > 90 && score <=100){
	    System.out.println("A+");
	 }  
	  else if (score >80 && score <=90){
	      System.out.println("A");
	}
	   else if (score >70 && score <=80){
	      System.out.println("B+");
	}	  
	
	    else if (score >60 && score <=70){
	      System.out.println("B");
	}	  
	   else if (score >50 && score <=60){
	      System.out.println("C");
	}	  
	   else if (score > 0 && score <=50){
	      System.out.println("Work Harder");
	}	  
	
      else{
	       System.out.println("Invalid Score");
		   
	 }
 }
 
    public static void main(String args[]){
	   GradeScore gradescore =  new GradeScore ();
	   gradescore.printGrade(95);
	   gradescore.printGrade(85);
	   gradescore.printGrade(75);
	   gradescore.printGrade(65);
	   gradescore.printGrade(55);
	   gradescore.printGrade(45);
	   gradescore.printGrade(195);
	   
	  }
}	  
	