package projectA;


import java.time.LocalDate;

/**
 * @generated
 */
public class Order {

    /**
     * @generated
     */
    private String id;

    /**
     * @generated
     */
    private String description;

    /**
     * @generated
     */
    private String status;

    /**
     * @generated
     */
    private LocalDate dateCreated;

    /**
     * @generated
     */
    private LocalDate dateCompleted;

    /**
     * @generated
     */
    private TechSupporter assignedTo;


    /**
     * @generated
     */
    private TechSupporter techSupporter;

    /**
     * @generated
     */
    private System system;


    /**
     * @generated
     */
    private String getId() {
        return this.id;
    }

    /**
     * @generated
     */
    private String setId(String id) {
        this.id = id;
    }

    /**
     * @generated
     */
    private String getDescription() {
        return this.description;
    }

    /**
     * @generated
     */
    private String setDescription(String description) {
        this.description = description;
    }

    /**
     * @generated
     */
    private String getStatus() {
        return this.status;
    }

    /**
     * @generated
     */
    private String setStatus(String status) {
        this.status = status;
    }

    /**
     * @generated
     */
    private LocalDate getDateCreated() {
        return this.dateCreated;
    }

    /**
     * @generated
     */
    private LocalDate setDateCreated(LocalDate dateCreated) {
        this.dateCreated = dateCreated;
    }

    /**
     * @generated
     */
    private LocalDate getDateCompleted() {
        return this.dateCompleted;
    }

    /**
     * @generated
     */
    private LocalDate setDateCompleted(LocalDate dateCompleted) {
        this.dateCompleted = dateCompleted;
    }

    /**
     * @generated
     */
    private TechSupporter getAssignedTo() {
        return this.assignedTo;
    }

    /**
     * @generated
     */
    private TechSupporter setAssignedTo(TechSupporter assignedTo) {
        this.assignedTo = assignedTo;
    }


    //                          Operations

    /**
     * @generated
     */
    public TechSupporter getAssignedTo() {
        //TODO
        return null;
    }

    /**
     * @generated
     */
    public boolean isCompleted() {
        //TODO
        return false;
    }


}

