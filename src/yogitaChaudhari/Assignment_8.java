package yogitaChaudhari;

public class Assignment_8 {

		int num1=10;
		int num2 =2;
		int total;
		
		void add(){
			int ans =num1+num2;
			System.out.println("Addition of " + num1 +" and "+num2 +" is " + ans);
			total=total+ans;
		}
		void sub(){
			int ans =num1-num2;
			System.out.println("Subtraction of " + num1 +" and "+ num2 +" is " + ans);
			total=total+ans;
		}
		void div(){
			int ans =num1/num2;
			System.out.println("Division of " + num1 +" and "+num2 +" is " + ans);
			total=total+ans;
		}
		void mult(){
			int ans =num1*num2;
			System.out.println("Multiplication of " + num1+ " and "+num2 +" is " + ans);
			total=total+ans;
		}
		
		public static void main(String[] args){
			Assignment_8 calculater = new Assignment_8();
			calculater.add();
			calculater.sub();
			calculater.div();
			calculater.mult();
			System.out.println("Total is" + calculater.total);
		}
	
}
