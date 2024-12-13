package projectA;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Admin extends User {
    private List<String> permissions;

    public Admin(String id, String name, String email, String password, String role, List<String> permissions) {
        super(id, name, email, password, role);
        this.permissions = permissions;
    }

    public void manageUsers(List<User> users) {
        Scanner scanner = new Scanner(java.lang.System.in);

        while (true) {
            java.lang.System.out.println("\nManage Users:");
            java.lang.System.out.println("1. Add User");
            java.lang.System.out.println("2. Remove User");
            java.lang.System.out.println("3. Update User");
            java.lang.System.out.println("4. List Users");
            java.lang.System.out.println("5. Exit");
            java.lang.System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    java.lang.System.out.print("Enter User ID: ");
                    String id = scanner.nextLine();
                    java.lang.System.out.print("Enter User Name: ");
                    String name = scanner.nextLine();
                    java.lang.System.out.print("Enter User Email: ");
                    String email = scanner.nextLine();
                    java.lang.System.out.print("Enter User Password: ");
                    String password = scanner.nextLine();
                    java.lang.System.out.print("Enter User Role: ");
                    String role = scanner.nextLine();
                    users.add(new User(id, name, email, password, role));
                    java.lang.System.out.println("User added successfully.");
                    break;

                case 2:
                    java.lang.System.out.print("Enter User ID to remove: ");
                    String removeId = scanner.nextLine();
                    users.removeIf(user -> user.getId().equals(removeId));
                    java.lang.System.out.println("User removed successfully.");
                    break;

                case 3:
                    java.lang.System.out.print("Enter User ID to update: ");
                    String updateId = scanner.nextLine();
                    User userToUpdate = users.stream()
                            .filter(user -> user.getId().equals(updateId))
                            .findFirst()
                            .orElse(null);
                    if (userToUpdate != null) {
                        java.lang.System.out.print("Enter new name (leave blank to keep current): ");
                        String newName = scanner.nextLine();
                        if (!newName.isEmpty()) {
                            userToUpdate.setName(newName);
                        }

                        java.lang.System.out.print("Enter new email (leave blank to keep current): ");
                        String newEmail = scanner.nextLine();
                        if (!newEmail.isEmpty()) {
                            userToUpdate.setEmail(newEmail);
                        }

                        java.lang.System.out.print("Enter new password (leave blank to keep current): ");
                        String newPassword = scanner.nextLine();
                        if (!newPassword.isEmpty()) {
                            userToUpdate.setPassword(newPassword);
                        }

                        java.lang.System.out.print("Enter new role (leave blank to keep current): ");
                        String newRole = scanner.nextLine();
                        if (!newRole.isEmpty()) {
                            userToUpdate.setRole(newRole);
                        }

                        java.lang.System.out.println("User updated successfully.");
                    } else {
                        java.lang.System.out.println("User not found.");
                    }
                    break;

                case 4:
                    java.lang.System.out.println("\nUser List:");
                    for (User user : users) {
                        java.lang.System.out.println("ID: " + user.getId() + ", Name: " + user.getName() + ", Email: " + user.getEmail() + ", Role: " + user.getRole());
                    }
                    break;

                case 5:
                    java.lang.System.out.println("Exiting user management.");
                    return;

                default:
                    java.lang.System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
