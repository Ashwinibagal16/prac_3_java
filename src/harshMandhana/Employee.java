package harshMandhana;

class Employee
{
	String firstName = "Harsh";
	String lastName = "Mandhana";
	int employeeId = 13;
	int a = 17;
	
	void employeeDetails()
	{
		System.out.println(firstName);
		System.out.println(lastName);
		System.out.println(employeeId);
	}
	
	public static void main(String args[])
	{
		Employee e = new Employee();
		e.employeeDetails();
		System.out.println(e);
	}
}