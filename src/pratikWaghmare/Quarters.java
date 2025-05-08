package pratikWaghmare;
class Quarters{
	int num;
	void quarterMonth(int num){
		if(num >=1 && num <=12){
				if(num >=1 && num <= 3){
					if(num == 1){
						System.out.println("Month index is " + num + " is in Q1, it's January");
					}
					else if(num == 2){
						System.out.println("Month index is " + num + " is in Q1, it's February");
					}
					else{
						System.out.println("Month index is " + num + " is in Q1, it's March");
					}
				}
				if(num >= 4 && num <= 6){
					if(num == 4){
						System.out.println("Month index is " + num + " is in Q2, it's April");
					}
					else if(num == 5){
						System.out.println("Month index is " + num + " is in Q2, it's May");
					}
					else{
						System.out.println("Month index is " + num + " is in Q2, it's June");
					}
				}
				if(num >= 7 && num <= 9){
					
					if(num == 6){
						System.out.println("Month index is " + num + " is in Q3, it's July");
					}
					else if(num == 7){
						System.out.println("Month index is " + num + " is in Q3, it's August");
					}
					else{
						System.out.println("Month index is " + num + " is in Q3, it's September");
					}
				}
				if(num >= 10 && num <= 12){
					
					if(num == 10){
						System.out.println("Month index is " + num + " is in Q4, it's October");
					}
					else if(num == 11){
						System.out.println("Month index is " + num + " is in Q4, it's November");
					}
					else{
						System.out.println("Month index is " + num + " is in Q4, it's December");
					}
				}
		}
		else{
			if(num <=0){
				System.out.println("Invalid month index is " + num + ", it can't ne negative or zero");
			}
			else{
				System.out.println("Invalid month index is "+ num +", it can't be greater than 12");
			}
		}
	}
	
	public static void main(String a[]){
		Quarters quarter = new Quarters();
		quarter.quarterMonth(5);
		quarter.quarterMonth(2);
		quarter.quarterMonth(-3);
		quarter.quarterMonth(13);
	}


}