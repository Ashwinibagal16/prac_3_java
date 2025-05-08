/* Assignment - 9 : 24th April'25
Print student grade based on obtain score.
If score is between 90 (excluding) to 100 (including) → "A+"
If score is between 80 (excluding) to 90 (including) → "A"
If score is between 70 (excluding) to 80 (including) → "B+"
If score is between 60 (excluding) to 70 (including) → "B"
If score is between 50 (including) to 60 (including) → "C"
If score is between 50 (excluding) to 0 (including) → "work harder"
Any other score should be considered as Invalid score.

input : 92
output : A+

input : 76
output : B+

input : 23
output : work harder

input : -19
output : Invalid score

input : 102
output : Invalid score */

package pranitaPurnik;
class Assignment9{

	void result(int marks){
		if(marks>90 && marks<=100){
			System.out.println("Grade A+");
		}
		else if(marks>80 && marks<=90){
			System.out.println("Grade A");
		}
		else if(marks >70 && marks<=80){
			System.out.println("Grade B+");
		}
		else if(marks >60 && marks<=70){
			System.out.println("Grade B");
		}
		else if(marks >=50 && marks<=60){
			System.out.println("Grade C");
		}
		else if(marks <50 && marks>=0){
			System.out.println("Work harder");
		}else{
			System.out.println(marks+" Invalid score");
		}
	}

	public static void main(String[] args){
		Assignment9 assignment9 = new Assignment9();
		assignment9.result(92);
		assignment9.result(76);
		assignment9.result(23);
		assignment9.result(-19);
		assignment9.result(102);
	}
}