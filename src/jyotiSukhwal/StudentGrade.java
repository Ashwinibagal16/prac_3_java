package jyotiSukhwal;


class StudentGrade{
		
	void printGrade(int score){
		if(score>90 && score<=100){
			System.out.println("Input: " + score );
			System.out.println("The grade obtained by student is: A+" + "\n" ); 
		}else if(score>80 && score<=90){
			System.out.println("Input: " + score );
			System.out.println("The grade obtained by student is: A" + "\n" ); 
		}else if(score>70 && score<=80){
			System.out.println("Input: " + score );
			System.out.println("The grade obtained by student is: B+" + "\n" ); 
		}else if(score>60 && score<=70){
			System.out.println("Input: " + score );
			System.out.println("The grade obtained by student is: B" + "\n" ); 
		}else if(score>=50 && score<=60){
			System.out.println("Input: " + score );
			System.out.println("The grade obtained by student is: C" + "\n" ); 
		}else if(score>=0 && score<50){
			System.out.println("Input: " + score );
			System.out.println("work harder" + "\n" ); 
		}else 
			System.out.println("Invalid score" ); 		
	}
	
	public static void main(String[] args){
		StudentGrade studentGrade = new StudentGrade();
		int studentScore = 92 ;
		studentGrade.printGrade(studentScore);
		studentScore = 76 ;
		studentGrade.printGrade(studentScore);
		studentScore = 23 ;
		studentGrade.printGrade(studentScore);
		studentScore = -19 ;
		studentGrade.printGrade(studentScore);
		studentScore = 102 ;
		studentGrade.printGrade(studentScore);
	}
}