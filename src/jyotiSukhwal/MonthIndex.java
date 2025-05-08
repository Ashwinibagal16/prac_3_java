package jyotiSukhwal;

class MonthIndex{
	 
	void printDetail(int index){
		String quarter = "";
		if(index >= 1 && index <= 12){
			if(index >=1 && index <= 3){
				quarter = "Q1";
				if(index == 1){
					System.out.println("Month index 1 is in " + quarter + ", its January.");
				}else if(index == 2){
					System.out.println("Month index 2 is in " + quarter + ", its Febuary.");
				}else{
					System.out.println("Month index 3 is in " + quarter + ", its March.");
				}
			}else if(index>=4 && index <=6){
				quarter = "Q2";
				if(index == 4){
					System.out.println("Month index 4 is in " + quarter + ", its April.");
				}else if(index == 5){
					System.out.println("Month index 5 is in " + quarter + ", its May.");
				}else{
					System.out.println("Month index 6 is in " + quarter + ", its June.");
				}
			}else if(index>=7 && index <=9){
				quarter = "Q3";
				if(index == 7){
					System.out.println("Month index 7 is in " + quarter + ", its July.");
				}else if(index == 8){
					System.out.println("Month index 8 is in " + quarter + ", its August.");
				}else{
					System.out.println("Month index 9 is in " + quarter + ", its September.");
				}
			}else{
				quarter = "Q4";
				if(index == 10){
					System.out.println("Month index 10 is in " + quarter + ", its October.");
				}else if(index == 11){
					System.out.println("Month index 11 is in " + quarter + ", its November.");
				}else{
					System.out.println("Month index 12 is in " + quarter + ", its December.");
				}
			}
		}else if(index <= 0){
			System.out.println("invalid month index, it can't be zero or negative");
		}else {
			System.out.println("invalid month index, it can't be greater than 12");
		} 
	}
	
	public static void main(String[] args){
		MonthIndex monthIndex= new MonthIndex();
		monthIndex.printDetail(5);
		monthIndex.printDetail(2);
		monthIndex.printDetail(-3);
		monthIndex.printDetail(13);		
	}
}	