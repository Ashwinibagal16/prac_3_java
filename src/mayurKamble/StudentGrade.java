package mayurKamble;

class StudentGrade{
	
	void gradingSystem(int marks){
		if(marks >90&&marks<=100){
			System.out.println("Your score is "+marks);
			System.out.println("Grade is "+"A+");
		}else if(marks >80&&marks<=90){
			System.out.println("Your score is "+marks);
			System.out.println("Grade is "+"A");
		}else if(marks >70&&marks<=80){
			System.out.println("Your score is "+marks);
			System.out.println("Grade is "+"B+");
		}else if(marks >60&&marks<=70){
			System.out.println("Your score is "+marks);
			System.out.println("Grade is "+"B");
		}else if(marks >=50&&marks<=60){
			System.out.println("Your score is "+marks);
			System.out.println("Grade is "+"C");
		}else if(marks >0&&marks<50){
			System.out.println("Your score is "+marks);
			System.out.println("You Should Work Hard");
		}else{
			System.out.println("Invalid Score ");
		}
	} 
	
	public static void main(String[]args){
		StudentGrade studentGrade=new StudentGrade();
		studentGrade.gradingSystem(92);
		System.out.println("------------------");
		studentGrade.gradingSystem(76);
		System.out.println("------------------");
		studentGrade.gradingSystem(60);
		System.out.println("------------------");
		studentGrade.gradingSystem(-19);
		System.out.println("------------------");
		studentGrade.gradingSystem(102);
	}
}