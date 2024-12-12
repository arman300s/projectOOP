package projectA;


import java.util.ArrayList;
import java.util.List;

/**
 * @generated
 */
public class TechSupporter extends Employee {

    private List<Order> assignedOrders;
    private Order order;
    public TechSupporter(String id, String name, String email, String password, String role, String employeeId, String department, double salary) {
        super(id, name, email, password, role, employeeId, department, salary);
        this.assignedOrders = new ArrayList<>();
    }

    public void viewNewOrders() {
        // Implementation here
    }

    public void acceptOrder(Order order) {
        // Implementation here
    }

    public void markOrderAsDone(Order order) {
        // Implementation here
    }


}
