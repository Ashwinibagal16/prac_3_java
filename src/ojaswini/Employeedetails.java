package ojaswini;
class Employeedetails{
 int empid;
 String firstname;
 String lastname;
 int empsalary;
 
 void updateEmp(){
  empid=123;
  firstname="Maulik";
  lastname="kanani";
  empsalary=5000;
 } 
 
 void empSalaryUpdate(){
  empsalary=empsalary+2000;
 }
 
 void printDetail(){
  System.out.println("employee id is "+ empid);
  System.out.println("employee firstname is "+ firstname);
  System.out.println("employee lastname is "+ lastname);
  System.out.println("employee currentsalary is "+ empsalary);
 }
 
 public static void main(String[] args){
  Employeedetails e = new Employeedetails();
  e.updateEmp();
  e.empSalaryUpdate();
  e.printDetail();
 }
}