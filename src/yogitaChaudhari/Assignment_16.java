package yogitaChaudhari;

public class Assignment_16 {
	int count=0;
	void printMaxDivisibleNo(int startRange , int endRanage) {
		int max=0;
		int sum=0;
		
		
		for ( int num = startRange ; num<=endRanage ; num++ ){
			if(num%7==0) {
				System.out.println(num);
				max=num;
				count++;
				sum=sum+num ;
				
			}
		}
		System.out.println(max +" is maximum number of given renge");
		System.out.println(sum + " is the sum of all numbers");
		
	}
	
	void PrintNumberTotalNum() {
		System.out.println(count);
	}
public static void main(String[] args) {
	Assignment_16 assignment_16 = new Assignment_16();
	assignment_16.printMaxDivisibleNo(15, 50);
}
}
