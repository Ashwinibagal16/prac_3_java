package yogeshGhuge;

public class Assignment_9 {

	
	void studentResult(int score) {
		
		if(score>90 && score<=100) {
			System.out.println("Congrats you got A+ grade" +"your score is:" + score);
		}else if(score>80 && score<=90){
			System.out.println("Congrats you got A grade" +"your score is:" + score);
		}else if(score>70 && score<=80) {
			System.out.println("Congrats you got B+ grade" +"your score is:" + score);
		}else if(score>60 && score<=70) {
			System.out.println("Congrats you got B grade" +"your score is:" + score);
		}else if(score>50 && score<=60) {
			System.out.println("Congrats you got C grade" +"your score is:" + score);
		}else if(score>0 && score<=50) {
			System.out.println("Work hard" + score + "This is low score");
		}else {
			System.out.println("invalid score, score should in between 0 to 100" );
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment_9 result = new Assignment_9();
		result.studentResult(92);
		result.studentResult(72);
		result.studentResult(65);
		result.studentResult(15);
		result.studentResult(-15);
	}

}
