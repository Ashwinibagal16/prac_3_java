package harshMandhana;

class StudentGrade{
	int score;
	void gradeStatus(int score){
		if(score <= 100 && score > 90){
			System.out.println("A+");
		}
		else if (score <= 90 && score > 80 ){
			System.out.println("A");
		}
		else if (score > 70 && score <= 80){
			System.out.println("B+");
		}
		else if (score > 60 && score <= 70){
			System.out.println("B");
		}
		else if (score > 50 && score <= 60){
			System.out.println("C");
		}
		else if (score < 50 && score >= 0){
			System.out.println("work harder");
		}
		else if (score > 100 || score < 0){
			System.out.println("Invalid score");
		}
	}
	public static void main (String[] args){
		StudentGrade studentGrade = new StudentGrade();
		studentGrade.gradeStatus(92);
		studentGrade.gradeStatus(76);
		studentGrade.gradeStatus(23);
		studentGrade.gradeStatus(-19);
		studentGrade.gradeStatus(102);
	}
 
}