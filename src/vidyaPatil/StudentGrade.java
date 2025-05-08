package vidyaPatil;

class StudentGrade{

	void printGrade(int score){		
		if (score >90 && score <=100 ){
			System.out.println("Student score is " + score + " and Grade is : A+");
		}else if (score >80 && score <=90){
			System.out.println("Student score is " + score + " and Grade is : A");
		}else if (score >70 && score <=80){
			System.out.println("Student score is " + score + " and Grade is : B+");
		}else if (score >60 && score <=70){
			System.out.println("Student score is " + score + " and Grade is : B");
		}else if (score >=50 && score <=60){
			System.out.println("Student score is " + score + " and Grade is : C");
		}else if (score >=0 && score <50){
			System.out.println("Student score is " + score + " Comment: Work Harder");
		}else{
			System.out.println("Student score is " + score + " Comment: Invalid score");
		}
	}

	public static void main(String[] args){
		
		StudentGrade studentGrade = new StudentGrade();
		studentGrade.printGrade(94);
		studentGrade.printGrade(90);
		studentGrade.printGrade(78);
		studentGrade.printGrade(61);
		studentGrade.printGrade(50);
		studentGrade.printGrade(60);
		studentGrade.printGrade(0);
		studentGrade.printGrade(20);
		studentGrade.printGrade(-30);
		studentGrade.printGrade(101);
	}
}