package pratikWaghmare;
class Days{
	int num;
	
	void dayoFWeek(int num){
		if(num >=1 && num <=7){
			if(num >=1 && num <= 5){
				System.out.println("It's a weekday");
				
				if(num == 1){
					System.out.println("Monday");
				}
				else if(num == 2){
					System.out.println("Tuesday");
				}
				else if(num == 3){
					System.out.println("Wednsday");
				}
				else if(num == 4){
					System.out.println("Thursday");
				}
				else{
					System.out.println("Friday");
				}
			}else{
				System.out.println("It's a weekend");
				if(num == 6){
					System.out.println("Saturday");
				}
				else{
					System.out.println("Sunday");
					}
		
			}
		}else
			System.out.println("Invalid day index");
	}
	
	public static void main(String a[]){
		Days days = new Days();
		days.dayoFWeek(3);
		days.dayoFWeek(7);
		days.dayoFWeek(0);
	}


}
