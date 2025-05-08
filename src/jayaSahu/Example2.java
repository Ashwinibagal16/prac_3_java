package jayaSahu;

class Example2{
  
   int num1;
   int num2;
   
   void display (){
     System.out.println(num1 + num2);
	 
   }
   
   void updateValue (){
       num1 = 100;
	   num2 = 200;
	   
   }
   
   public static void main(String [] args){
          Example2 example2 = new Example2 ();
		  example2.display ();
   
   }




}