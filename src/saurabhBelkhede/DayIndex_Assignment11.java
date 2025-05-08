package saurabhBelkhede;
//assignment 11
class DayIndex {

	void indexvalue (int index){
		if (index >= 1 && index <= 5){
			System.out.println("It's a Weekday");
			if (index == 1)
				System.out.println("It's Mon");
				else if (index == 2)
					System.out.println("It's Tue");
				else if (index == 3)
					System.out.println("It's Wed");
				else if (index == 4)
					System.out.println("It's Thu");
				else if (index == 5)
					System.out.println("It's Fri");
		}else {
			System.out.println("It's a Weekend");
			if (index == 6){
				System.out.println("Its Saturday");
			}else if (index == 7){
				System.out.println("Its Sunday");
			}else{
				System.out.println("The index " + index + " is invalid");
			}
		}
	}	
	
	public static void main(String[] args) {
		DayIndex monin = new DayIndex();
		monin.indexvalue(5);
		monin.indexvalue(1);
		monin.indexvalue(7);
		monin.indexvalue(11);
		monin.indexvalue(13);
	}
}

