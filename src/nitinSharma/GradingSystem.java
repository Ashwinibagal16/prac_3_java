package nitinSharma;
class GradingSystem{
	
	void marksObitain(int score){
		System.out.println("You scored: "+ score +" out of 100.");
		if(score>=90 && score <=100){
			System.out.println("Excellent! Your grade is A+.");
		}else if(score>=80 && score <90){
			System.out.println("Very Good! Your Grade is A.");
		}else if(score>=70 && score <80){
			System.out.println("Good! Your Grade is B+.");
		}else if(score>=60 && score <70){
			System.out.println("Sufficient! Your Grade is B.");
		}else if(score>=50 && score <60){
			System.out.println("Bearly pass! Your Grade is C.");
		}else if(score>=0 && score <50){
			System.out.println("Fail! You should work harder.");
		}else if(score<0 || score>100){
			System.out.println("Invalid input!, Enter value between 0 to 100.");
		}
	}
	
	public static void main(String[] args){
		GradingSystem gradingSystem = new GradingSystem();
		gradingSystem.marksObitain(95);
		System.out.println("---------------------");
		gradingSystem.marksObitain(56);
		System.out.println("---------------------");
		gradingSystem.marksObitain(102);
		System.out.println("---------------------");
		gradingSystem.marksObitain(49);
		System.out.println("---------------------");
		gradingSystem.marksObitain(-45);
	}
}