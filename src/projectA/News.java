package projectA;


import java.time.LocalDate;

/**
 * @generated
 */
public class News {
    private String title;
    private String content;
    private LocalDate datePublished;
    private Boolean isPinned;
    private User user;
    public News(String title, String content, LocalDate datePublished) {
        this.title = title;
        this.content = content;
        this.datePublished = datePublished;
        this.isPinned = false;
    }

    public void pinNews() {
        this.isPinned = true;
    }

    public void unpinNews() {
        this.isPinned = false;
    }

    public void addComment(String comment) {
        // Implementation for adding comments
    }
}