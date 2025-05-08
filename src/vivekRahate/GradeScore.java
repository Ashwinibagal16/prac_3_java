package vivekRahate;
class GradeScore{

	void printGrade(int score){
		if(score > 90 && score <=100){
			System.out.println("A+");
		}
		else if (score > 80 && score <=90){
			System.out.println("A");
		}
		else if (score > 70 && score <=80){
			System.out.println("B+");
		}
		else if (score > 60 && score <=70){
			System.out.println("B");
		}
		else if (score > 50 && score <=60){
			System.out.println("c");
		}
		else if(score > 0 && score <=50){
			System.out.println("Work Harder");
		}
		else{
			System.out.println("Invalid Score");
		}
	}
	
	public static void main(String a[]){
		GradeScore gradeScore = new GradeScore();
		gradeScore.printGrade(95);
		gradeScore.printGrade(85);
		gradeScore.printGrade(75);
		gradeScore.printGrade(65);
		gradeScore.printGrade(55);
		gradeScore.printGrade(45);
		gradeScore.printGrade(195);
	}
}