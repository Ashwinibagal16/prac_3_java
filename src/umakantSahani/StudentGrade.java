package umakantSahani;
//Assignment9
class StudentGrade{
	
	void printStudentGrade(int score){
		if(score < 0 || score > 100){
			System.out.println("Invalid Score");
		}
		else if(score <= 100 && score > 90){
			System.out.println("A+");
		}
		else if(score <= 90 && score > 80){
			System.out.println("A");
		}
		else if(score <= 80 && score > 70){
			System.out.println("B+");
		}
		else if(score <= 70 && score > 60){
			System.out.println("B");
		}
		else if(score <= 60 && score >= 50){
			System.out.println("C");
		}
		else{
			System.out.println("Work Harder");
		}
	}
	
	public static void main(String[] args){
		StudentGrade studentGrade = new StudentGrade();
		studentGrade.printStudentGrade(92);
		studentGrade.printStudentGrade(76);
		studentGrade.printStudentGrade(23);
		studentGrade.printStudentGrade(-19);
		studentGrade.printStudentGrade(102);
	}	
}