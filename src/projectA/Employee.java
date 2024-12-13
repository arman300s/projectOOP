package projectA;


import java.util.ArrayList;
public class Employee extends User {
    private final String employeeId;
    private String department;
    private double salary;

    public Employee(String id, String name, String email, String password, String role, String employeeId, String department, double salary) {
        super(id, name, email, password, role);
        this.employeeId = employeeId;
        this.department = department;
        this.salary = salary;
    }

    public String getName(){
        return super.getName();
    }
    public String getEmail(){
        return super.getEmail();
    }

    public String getEmployeeId() {
        return employeeId;
    }


    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    public void sendMessage(Employee receiver, String content) {
        if (receiver == null || content == null || content.isEmpty()) {
            java.lang.System.out.println("Error: Invalid receiver or message content.");
            return;
        }

        java.lang.System.out.println("Message sent from " + this.getName() + " to " + receiver.getName());
        java.lang.System.out.println("Content: " + content);
    }


}