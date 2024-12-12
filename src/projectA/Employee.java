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

    public List<Task> viewAssignedTasks() {
        // Implementation here
        return new ArrayList<>();
    }

    public void sendMessage(Employee receiver, String content) {
        // Implementation here
    }

}