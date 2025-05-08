package vaibhavPatil;



class Grade{
	
	void isNumberValid(int num){
		if(num>=0 && num<=100){
			System.out.println("Given Marks " + num + " are valid");
		}else{
			System.out.println("Given Marks " + num + " are not valid");
		}
	}
	
	void result(int mark){
		if(mark>90 && mark<=100){
			System.out.println("Congartulations you got A Grade.");
		}else if(mark>80 && mark<=90){
			System.out.println("Congartulations you got B Grade.");
		}else if(mark>60 && mark<=80){
			System.out.println("Congartulations you got C Grade.");
		}else if(mark>50 && mark<=60){
			System.out.println("Congartulations you got D Grade.");
		}else if(mark<=50 && mark>0){
			System.out.println("Please Work Hard");
		}else{
			System.out.println("Marks are invalid. Marks should be in between 1 to 100");
		}
	}
	
	public static void main(String[] args){
		Grade grade = new Grade();
		
		int score= 92;
		grade.isNumberValid(score);
		grade.result(score);
		System.out.println("-------------------------------");
		score= 76;
		grade.isNumberValid(score);
		grade.result(score);
		System.out.println("-------------------------------");
		score= 23;
		grade.isNumberValid(score);
		grade.result(score);
		System.out.println("-------------------------------");
		score= -19;
		grade.isNumberValid(score);
		grade.result(score);
		System.out.println("-------------------------------");
		score= 102;
		grade.isNumberValid(score);
		grade.result(score);
	}
}