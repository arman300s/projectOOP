package projectA;
import java.util.Scanner;
public class User {

    private String id;
    private String name;
    private String email;
    private String password;
    private String role;
    private News news;

    public User(String id, String name, String email, String password, String role) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.role = role;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
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
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }
    public News getNews() {
        return news;
    }
    public void setNews(News news) {
        this.news = news;
    }

    public boolean login() {
        Scanner scanner = new Scanner(java.lang.System.in);

        java.lang.System.out.print("Enter email: ");
        String inputEmail = scanner.nextLine();

        java.lang.System.out.print("Enter password: ");
        String inputPassword = scanner.nextLine();

        if (this.email.equals(inputEmail) && this.password.equals(inputPassword)) {
            java.lang.System.out.println("Login successful! Welcome, " + name);
            return true;
        } else {
            java.lang.System.out.println("Login failed! Invalid email or password.");
            return false;
        }
    }

    public void logout() {
        java.lang.System.out.println("User " + name + " has been logged out.");
    }

    public void updateProfile() {
        Scanner scanner = new Scanner(java.lang.System.in);

        java.lang.System.out.print("Enter new name (leave blank to keep current): ");
        String newName = scanner.nextLine();
        if (!newName.isEmpty()) {
            this.name = newName;
        }

        java.lang.System.out.print("Enter new email (leave blank to keep current): ");
        String newEmail = scanner.nextLine();
        if (!newEmail.isEmpty()) {
            this.email = newEmail;
        }

        java.lang.System.out.print("Enter new password (leave blank to keep current): ");
        String newPassword = scanner.nextLine();
        if (!newPassword.isEmpty()) {
            this.password = newPassword;
        }

        java.lang.System.out.println("Profile updated successfully!");
    }


    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", role='" + role + '\'' +
                '}';
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        User user = (User) obj;
        return id.equals(user.id);
    }

    public int hashCode() {
        return id.hashCode();
    }



}
