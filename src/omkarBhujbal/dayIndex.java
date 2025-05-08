package omkarBhujbal;

public class dayIndex {
	void day(int index) {
		if(index>=1 && index<=7) {
			if(index>=1 && index<=5) {
				if(index==1) {
					System.out.println("it is weekday");
					System.out.println("its Monday");
				}else if(index==2) {
					System.out.println("it is weekday");
					System.out.println("its Tuesday");
				}else if(index==3) {
					System.out.println("it is weekday");
					System.out.println("its Wednesday");
				}else if(index==4) {
					System.out.println("it is weekday");
					System.out.println("its Thursday");
				}else if(index==5) {
					System.out.println("it is weekday");
					System.out.println("its Friday");
				}else if(index==6 || index==7)	{
					if(index==6) {
					System.out.println("It is Weekend");
					System.out.println("Its Saturday");
					}else if(index==7){
						System.out.println("It is Weekend");
						System.out.println("Its Sunday");
					}
				}
			}
			
		}
		
	}
	
	public static void main(String[] args) {
		dayIndex di= new dayIndex();
		di.day(1);
		di.day(3);
		di.day(5);
	
	}
}
