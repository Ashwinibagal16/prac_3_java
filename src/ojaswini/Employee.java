//Employee has firstname,lastname and employeeId(int) , it should be printable
package ojaswini;
class Employee{
 String fname="vini";
 String lname="kumari";
 int eId=123;
 
 void display(){
  System.out.println(fname);
  System.out.println(lname);
  System.out.println(eId);
 }
 
 public static void main(String[] args){
  Employee e=new Employee();
  e.display();
 }
}