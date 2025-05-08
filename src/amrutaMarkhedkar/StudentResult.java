package amrutaMarkhedkar;

class StudentResult{

	void printGrade(int marks){
		if(marks >90 && marks <=100){
			System.out.println("A+");
		}else if(marks >80 && marks <=90){
			System.out.println("A");
		}else if(marks >70 && marks <=80){
			System.out.println("B+");
		}else if(marks >60 && marks <=70){
			System.out.println("B");
		}else if(marks >50 && marks <=60){
			System.out.println("C");
		}else if(marks<50 && marks >=0){
			System.out.println("Work harder!!");
		}else if(marks>100){
			System.out.println("Invalid score!!. Your number is greater than 100");
		}else if(marks<0){
			System.out.println("Invalid score!!. You have entered a negative number");
		}

	}	
	public static void main(String [] args){
		StudentResult result = new StudentResult();
		result.printGrade(92);
		result.printGrade(76);
		result.printGrade(23);
		result.printGrade(19);
		result.printGrade(120);
		result.printGrade(-12);
	}
}