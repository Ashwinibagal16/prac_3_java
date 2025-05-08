package ashwiniBagal;

class Employee{
    String fName="Ashwini";
	String lName="bagal";
    int empId = 102;

    void display(){
      System.out.println(fName);
	  System.out.println(lName);
	  System.out.println(empId);
  }
   public static void main(String[] args){
      Employee e = new Employee();
      e.display();
}  
} 
	 