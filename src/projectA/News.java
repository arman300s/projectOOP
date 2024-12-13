package projectA;


import java.time.LocalDate;

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

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public LocalDate getDatePublished() {
        return datePublished;
    }
    public void setDatePublished(LocalDate datePublished) {
        this.datePublished = datePublished;
    }
    public Boolean getIsPinned() {
        return isPinned;
    }
    public void setIsPinned(Boolean isPinned) {
        this.isPinned = isPinned;
    }

    public void pinNews() {
        this.isPinned = true;
    }

    public void unpinNews() {
        this.isPinned = false;
    }

    public void addComment(String comment) {
    }
}