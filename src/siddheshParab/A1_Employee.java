package siddheshParab;

class A1_Employee {

    // Instance variables to hold employee details.
    String firstName = "Siddhesh";  // Default first name
    String lastName = "Parab";      // Default last name
    int employeeId = 411027;        // Default employee ID

    // Method to update employee details.
    void updateData() {
        firstName = "Nikita";    // Changing first name to "Nikita"
        lastName = "Parab";      // Last name remains the same
        employeeId = 980678;     // Updating employee ID
    }

    // Method to print the employee's details.
    void printDetails() {
        // Printing first name, last name, and employee ID
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Employee ID: " + employeeId);
    }
    // Main method - Entry point of the program.
    
    public static void main(String[] args) {
        // Creating an object of the A1_Employee class
        A1_Employee employee = new A1_Employee();

        // Printing the initial details of the employee
        employee.printDetails();  // Expected Output: Siddhesh Parab 411027

        // Calling the updateData method to change the employee details
        employee.updateData();

        // Printing the updated details of the employee
        employee.printDetails();  // Expected Output: Nikita Parab 980678
    }
}
