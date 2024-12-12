package projectA;


import java.time.LocalDate;
public class Order {
    private final String orderId;
    private String description;
    private String status;
    private LocalDate dateCreated;
    private LocalDate dateCompleted;
    private TechSupporter assignedTo;
    private TechSupporter techSupporter;
    private System system;


    public Order(String orderId, String description, String status) {
        this.orderId = orderId;
        this.description = description;
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

