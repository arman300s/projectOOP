package projectA;


/**
 * @generated
 */
public class Message {
    private final String messageId;
    private String senderId;
    private String receiverId;
    private String content;
    private Boolean isRead;
    private User user;


    public Message(String messageId, String senderId, String receiverId, String content) {
        this.messageId = messageId;
        this.senderId = senderId;
        this.receiverId = receiverId;
        this.content = content;
        this.isRead = false;
    }

    public void markAsRead() {
        this.isRead = true;
    }

    public String getContent() {
        return content;
    }

    public boolean isRead() {
        return isRead;
    }
}