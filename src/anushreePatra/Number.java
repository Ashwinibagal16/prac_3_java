package anushreePatra;

class Number{
	void printNum(){
	for(int num=1; num<=100; num++){
	if(num%5==0 || num%7==0){
		System.out.println(num + " is div by both 5 and 7.");
	}else if(num%5==0){
		System.out.println(num + " is div 5");
	}else if(num%7==0){
		System.out.println(num + " is div 7");
	}
	
		}
	}
		public static void main(String[] args){
			Number number = new Number();
			number.printNum();
		}
	}
	
	// ssh-keygen -t rsa -b 4096 -C "your_email@example.com"