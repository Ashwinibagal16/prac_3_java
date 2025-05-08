package snehalPatil;


class Employee
{

String firstName ="Snehal";
String lastName = "Patil";
int employeeId = 1234;

void employeeDetails()
{
System.out.println(firstName);
System.out.println(lastName);
System.out.println(employeeId);

}
public static void main (String args[])
{
Employee e= new Employee();
e.employeeDetails();

}
}