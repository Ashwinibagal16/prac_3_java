//Assignment 9
package jeetHingrajiya;
class StudentGrade{
	
	void printGrade(int score){
		if(score>90 && score <= 100){
			System.out.println("A+");
		}
		else if(score>80 && score <= 90){
			System.out.println("A");
		}
		else if(score>70 && score <= 80){
			System.out.println("B+");
		}
		else if(score>60 && score <= 70){
			System.out.println("B");
		}
		else if(score>50 && score <= 60){
			System.out.println("C");
		}
		else if(score>=0 && score < 50){
			System.out.println("Work Harder");
		}
		else {
			System.out.println("Invalid Score");
		}
	}
	
	 public static void main(String[] args) {
		 StudentGrade s_grade = new StudentGrade();
		 s_grade.printGrade(92);
		 s_grade.printGrade(76);
		 s_grade.printGrade(23);
		 s_grade.printGrade(19);
		 s_grade.printGrade(102);
	 }

}