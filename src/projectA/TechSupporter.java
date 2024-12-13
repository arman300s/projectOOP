package projectA;


import java.util.ArrayList;
import java.util.List;

public class TechSupporter extends Employee {

    private List<Order> assignedOrders;
    private Order order;
    public TechSupporter(String id, String name, String email, String password, String role, String employeeId, String department, double salary) {
        super(id, name, email, password, role, employeeId, department, salary);
        this.assignedOrders = new ArrayList<>();
    }

    public void viewNewOrders(List<Order> allOrders) {
        for (Order order : allOrders) {
            if (order.getStatus().equals("new") || order.getStatus().equals("pending")) {
                java.lang.System.out.println("Order ID: " + order.getOrderId());
            }
        }
    }

    public void acceptOrder(Order order) {
        if (!order.getStatus().equals("accepted")) {
            order.setStatus("accepted");
            assignedOrders.add(order);
            java.lang.System.out.println("Order " + order.getOrderId() + " has been accepted.");
        } else {
            java.lang.System.out.println("Order " + order.getOrderId() + " has already been accepted.");
        }
    }

    public void markOrderAsDone(Order order) {
        if (assignedOrders.contains(order) && order.getStatus().equals("accepted")) {
            order.setStatus("completed");
            java.lang.System.out.println("Order " + order.getOrderId() + " has been marked as completed.");
        } else {
            java.lang.System.out.println("Order not accepted or already completed.");
        }
    }

    public List<Order> getAssignedOrders() {
        return assignedOrders;
    }


}
