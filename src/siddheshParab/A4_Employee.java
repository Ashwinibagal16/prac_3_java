package siddheshParab;

class A4_Employee {

    // Instance variables
    String firstName;
    String lastName;
    int empId;
    int managerId;
    String address;
    String phoneNumber;

    // Method to update primary information (firstName, lastName, empId, managerId)
    void updatePrimaryInfo(String firstName, String lastName, int empId, int managerId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.empId = empId;
        this.managerId = managerId;
    }

    // Method to update secondary information (address, phoneNumber)
    void updateSecondaryInfo(String address, String phoneNumber) {
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    // Method to display primary information (firstName, lastName, empId, managerId)
    void displayPrimaryInfo() {
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Employee ID: " + empId);
        System.out.println("Manager ID: " + managerId);
    }

    // Method to display secondary information (address, phoneNumber)
    void displayOtherInfo() {
        System.out.println("Address: " + address);
        System.out.println("Phone Number: " + phoneNumber);
    }

    // Method to display all information (firstName, lastName, empId, managerId, address, phoneNumber)
    void displayAllInfo() {
        displayPrimaryInfo();
        displayOtherInfo();
    }

    public static void main(String[] args) {
        // Create an A4_Employee object
        A4_Employee employee = new A4_Employee();

        // Update primary and secondary information
        employee.updatePrimaryInfo("John", "Doe", 12345, 6789);
        employee.updateSecondaryInfo("1234 Elm Street, Springfield", "+91-9876543210");

        // Display the information
        employee.displayPrimaryInfo();
        employee.displayOtherInfo();
        employee.displayAllInfo();
    }
}

