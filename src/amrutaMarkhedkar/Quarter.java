package amrutaMarkhedkar;

class Quarter{
	void getQuarter(int monthIndex){
		if(monthIndex>=1 && monthIndex<=3){
			System.out.println("Q1");
			System.out.println("Month index "+monthIndex+" is in Q1, its May.");
		}else if(monthIndex>=4 && monthIndex<=6){
			System.out.println("Q2");
		}else if(monthIndex>=7 && monthIndex<=9){
			System.out.println("Q3");
		}else if(monthIndex>=9 && monthIndex<=12){
			System.out.println("Q4");
		}
	}
	
	public static void main(String [] args){
		Quarter quarter = new Quarter();
		quarter.getQuarter(5);
		quarter.getQuarter(2);
		quarter.getQuarter(-3);
		quarter.getQuarter(13);
	}
}