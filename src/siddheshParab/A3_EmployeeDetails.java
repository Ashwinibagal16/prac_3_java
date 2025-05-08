package siddheshParab;

class A3_EmployeeDetails {
    // Instance variables to hold employee details
    int empId;
    String empFirstName;
    String empLastName;
    double empSalary;

    // Method to initialize the employee details
    void initializeDetails(int id, String firstName, String lastName, double salary) {
        empId = id;
        empFirstName = firstName;
        empLastName = lastName;
        empSalary = salary;
    }

    // Method to update employee salary by 2000 rs
    void updateSalary() {
        empSalary += 2000;  // Increase the salary by 2000 rs
    }

    // Method to print all the employee details
    void printDetails() {
        System.out.println("Employee id is " + empId);
        System.out.println("Employee first name is " + empFirstName);
        System.out.println("Employee last name is " + empLastName);
        System.out.println("Employee current salary is " + empSalary);
    }

    public static void main(String[] args) {
        // Create an object of the A3_EmployeeDetails class
        A3_EmployeeDetails employee = new A3_EmployeeDetails();

        // Initialize employee details
        employee.initializeDetails(123, "Maulik", "Kanani", 5000);

        // Update salary
        employee.updateSalary();

        // Print employee details
        employee.printDetails();
    }
}

