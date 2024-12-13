package projectA;


import java.time.LocalDate;
public class Order {
    private  String orderId;
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

    public LocalDate getDateCreated() {
        return dateCreated;
    }
    public void setDateCreated(LocalDate dateCreated) {
        this.dateCreated = dateCreated;
    }
    public LocalDate getDateCompleted() {
        return dateCompleted;
    }
    public void setDateCompleted(LocalDate dateCompleted) {
        this.dateCompleted = dateCompleted;
    }
    public TechSupporter getAssignedTo() {
        return assignedTo;
    }
    public void setAssignedTo(TechSupporter assignedTo) {
        this.assignedTo = assignedTo;
    }
    public TechSupporter getTechSupporter() {
        return techSupporter;
    }
    public void setTechSupporter(TechSupporter techSupporter) {
        this.techSupporter = techSupporter;
    }
    public String getOrderId() {
        return orderId;
    }
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
    public boolean isCompleted() {
        return "Completed".equalsIgnoreCase(this.status) || this.dateCompleted != null;
    }


}

