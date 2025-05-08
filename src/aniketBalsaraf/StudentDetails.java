package aniketBalsaraf;

class StudentDetails{
	
	void printStudentGrade(int marks){
		if(marks >90 && marks <=100){
			System.out.println("Student Grade is A+ ");
		}else if(marks >80 && marks <=90){
			System.out.println("Student Grade is A ");
		}else if(marks >70 && marks <=80){
			System.out.println("Student Grade is B+ ");
		}else if(marks >60 && marks <=70){
			System.out.println("Student Grade is B ");
		}else if(marks >50 && marks <=60){
			System.out.println("Student Grade is C ");
		}else if(marks <50 && marks >=0){
			System.out.println("Student needs to work hard !!! ");
		}else{
			System.out.println("Student Marks are Invalid ");
		}
	}
	
	public static void main(String[] args){
		StudentDetails studentDetails = new StudentDetails();
		studentDetails.printStudentGrade(92);
		studentDetails.printStudentGrade(76);
		studentDetails.printStudentGrade(23);
		studentDetails.printStudentGrade(-19);
		studentDetails.printStudentGrade(102);
	}
}