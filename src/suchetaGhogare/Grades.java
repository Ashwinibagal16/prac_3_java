package suchetaGhogare;

class Grades{
	void grade(int score){
		if (score > 90 && score <= 100)
		{
			System.out.println("Grade: A+");
		}else if (score > 80 && score <= 90)
		{
			System.out.println("Grade: A");
		}else if (score > 70 && score <= 80)
		{
			System.out.println("Grade: B+");
		}else if (score > 60 && score <= 70)
		{
			System.out.println("Grade: B");
		}else if (score >= 50 && score <= 60)
		{
			System.out.println("Grade: C");
		}else if (score >=0 && score <50)
		{
			System.out.println("Please work harder");
		}else{
			System.out.println("Invalid score");
		}		
	}

	public static void main(String[] args){
		Grades grades = new Grades();
		grades.grade(92);
		grades.grade(76);
		grades.grade(23);
		grades.grade(19);
		grades.grade(102);
		grades.grade(81);
		grades.grade(57);
		grades.grade(50);
		grades.grade(100);
	}
}