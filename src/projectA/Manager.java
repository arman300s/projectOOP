package projectA;


import java.util.List;

/**
 * @generated
 */
public class Manager extends Employee {
    private ManagerType managerType;
    private Course course;
    private List<String> responsibilities;
    public Manager(String id, String name, String email, String password, String role, String employeeId, String department, double salary, List<String> responsibilities) {
        super(id, name, email, password, role, employeeId, department, salary);
        this.responsibilities = responsibilities;
    }

    public void assignTask(Employee employee, String task) {
        System.out.println("Assigned task: " + task + " to " + employee.getName());
    }

    public void evaluatePerformance(Employee employee) {
        System.out.println("Evaluating performance of " + employee.getName());
    }

}
