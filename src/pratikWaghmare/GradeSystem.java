package pratikWaghmare;
class GradeSystem{
	int score;
	
	void grades(int score){
		if(score < 0 || score >100 ){
			System.out.println("Invalid score");
		}
		else if (score > 90 && score <= 100){
			System.out.println("A+");
		}
		else if (score > 80 && score <= 90){
			System.out.println("A");
		}
		else if (score > 70 && score <= 80){
			System.out.println("B+");
		}
		else if (score > 60 && score <= 70){
			System.out.println("B");
		}
		else if (score >= 50 && score <= 60){
			System.out.println("C");
		}
		else if (score > 0 && score < 50){
			System.out.println("Work harder");
		}
	}
	public static void main(String a[]){
		GradeSystem gardeSystem = new GradeSystem();
		gardeSystem.grades(92);
		gardeSystem.grades(76);
		gardeSystem.grades(23);
		gardeSystem.grades(-19);
		gardeSystem.grades(102);
	}
}