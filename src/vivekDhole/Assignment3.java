package vivekDhole;

class Assignment3 {
	
	int empId;
	String empFirstName;
	String empLastName;
	int empSalary;

	void initialise() {
		empId = 123;
		empFirstName = "Maulik";
		empLastName = "Kanani";
		empSalary = 5000;
	}

	void updateSalary() {
		empSalary = empSalary + 2000;
	}

	void printDetails() {
		System.out.println("Employee ID is " + empId);
		System.out.println("Employee first name is " + empFirstName);
		System.out.println("Employee last name is " + empLastName);
		System.out.println("Employee current salary is " + empSalary);
	}

	public static void main(String[] args) {
		Assignment3 empD = new Assignment3();
		empD.initialise();
		empD.updateSalary();
		empD.printDetails();
	}
}