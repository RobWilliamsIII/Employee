public class Manager extends Employee {

    // Variables
    private String department;

    // Setter Method
    public void setDepartment(String department) {
        this.department = department;
    }

    //Getter Method

    public String getDepartment() {
        return this.department;
    }

    // Inheriting attributes from Superclass Employee
    public void employeeSummary() {
        super.employeeSummary();
        System.out.println("Department: " + this.department);
    }
}