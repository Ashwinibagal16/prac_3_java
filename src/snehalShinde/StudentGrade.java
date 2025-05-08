package snehalShinde;

class StudentGrade{

	void marksCondition(int score){
		if(score > 90 && score <= 100){
			System.out.println("Your score is " + score + ". Bravo !!! You have achieved A+ grade." + "\n");
		}else if(score > 80 && score <= 90){
			System.out.println("Your score is " + score + ". Awesome !! You have achieved A grade." + "\n");
		}else if(score > 70 && score <= 80){
			System.out.println("Your score is " + score + ". Congratulations ! You have achieved B+ grade." + "\n");
		}else if(score > 60 && score <= 70){
			System.out.println("Your score is " + score + ". Congratulations ! You have achieved B grade." + "\n");
		}else if(score >= 50 && score <= 60){
			System.out.println("Your score is " + score + ". You have achieved C grade." + "\n");
		}else if(score >= 0 && score < 50){
			System.out.println("Your score is " + score + ". Buckle Up ! You need to work hard." + "\n");
		}else{ 
			System.out.println(score + " is invalid score. The score should be in between 0 and 100." + "\n");
		}
	}
	
	public static void main(String[] args){
	StudentGrade studentGrade = new StudentGrade();
	studentGrade.marksCondition(92);
	studentGrade.marksCondition(76);
	studentGrade.marksCondition(23);
	studentGrade.marksCondition(-19);
	studentGrade.marksCondition(102);
	}
}