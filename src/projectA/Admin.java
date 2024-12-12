package projectA;


import java.util.ArrayList;
import java.util.List;

/**
 * @generated
 */
public class Admin extends Employee {
    private List<String> permissions;

    public Admin(String id, String name, String email, String password, String role, String employeeId, String department, double salary, List<String> permissions) {
        super(id, name, email, password, role, employeeId, department, salary);
        this.permissions = permissions;
    }

    public void manageUsers(User user) {
        // Implementation here
    }

}