public class Employee {
    // Variables
    private String firstName;
    private String lastName;

    private int employeeID;

    private double salary;

    // Methods
    //Constructor to initialize salary to be 0
    public Employee() {
        this.salary = 0;
    }

    //Setter Methods
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    // Getter Methods

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int getEmployeeID() {
        return this.employeeID;
    }
    // Summary Method

    public void employeeSummary() {
        System.out.println("First Name: " + this.firstName);
        System.out.println("Last Name: " + this.lastName);
        System.out.println("ID: " + this.employeeID);
        System.out.println("Salary: " + "$" + this.salary);
    }
}
