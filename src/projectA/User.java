package projectA;

public class User {

    private String id;
    private String name;
    private String email;
    private String password;
    private String role;
    private News news;
    private System system;
    private Message message;

    public User(String id, String name, String email, String password, String role) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean login() {
        // Implementation here
        return true;
    }

    public void logout() {
        // Implementation here
    }

    public void updateProfile() {
        // Implementation here
    }


}
