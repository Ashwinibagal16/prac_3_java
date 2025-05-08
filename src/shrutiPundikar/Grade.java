package shrutiPundikar;

class Grade{
	
	void studentGrade(int score){
		if(score > 90 && score <=100){
			System.out.println("Obtained score: " + score + " Grade: A+");
		}else if(score > 80 && score <=90){
			System.out.println("Obtained score: " + score + " Grade: A");
		}else if(score > 70 && score <=80){
			System.out.println("Obtained score: " + score + " Grade: B+");
		}else if(score >= 60 && score <=70){ 
			System.out.println("Obtained score: " + score + " Grade: B");
		}else if(score >= 50 && score < 60){
			System.out.println("Obtained score: " + score + " Grade: C");
		}else if(score >=0 && score < 50){
			System.out.println("Obtained score: " + score + " Please Work Hard");
		}
		else{
			System.out.println(score + " Invalid Score");
		}
	}
	public static void main(String[] args){
		Grade grade = new Grade();
		grade.studentGrade(98);
		grade.studentGrade(50);
		grade.studentGrade(67);
		grade.studentGrade(110);
		grade.studentGrade(87);
		grade.studentGrade(77);
		grade.studentGrade(25);	
	}
}