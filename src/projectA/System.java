package projectA;


import java.util.ArrayList;
import java.util.List;
public class System {
    private ResearchPaper researchPaper;
    private List<User> users;
    private List<Employee> employees;
    private List<Student> students;
    private List<Teacher> teachers;
    private List<Course> courses;
    private List<News> newsList;
    private List<Message> messages;
    private List<ResearchProject> researchProjects;

    public System() {
        this.users = new ArrayList<>();
        this.employees = new ArrayList<>();
        this.students = new ArrayList<>();
        this.teachers = new ArrayList<>();
        this.courses = new ArrayList<>();
        this.newsList = new ArrayList<>();
        this.messages = new ArrayList<>();
        this.researchProjects = new ArrayList<>();
    }

    // User management
    public void addUser(User user) {
        users.add(user);
    }

    public void removeUser(User user) {
        users.remove(user);
    }

    public User findUserById(String id) {
        return users.stream().filter(u -> u.getId().equals(id)).findFirst().orElse(null);
    }

    // Course management
    public void addCourse(Course course) {
        courses.add(course);
    }

    public void removeCourse(Course course) {
        courses.remove(course);
    }

    public List<Course> getCourses() {
        return courses;
    }

    // News management
    public void addNews(News news) {
        newsList.add(news);
    }

    public void removeNews(News news) {
        newsList.remove(news);
    }

    public List<News> getNewsList() {
        return newsList;
    }

    // Message management
    public void sendMessage(Message message) {
        messages.add(message);
    }

    public List<Message> getMessages() {
        return messages;
    }

    // Research project management
    public void addResearchProject(ResearchProject project) {
        researchProjects.add(project);
    }

    public List<ResearchProject> getResearchProjects() {
        return researchProjects;
    }

    // Example of a general method
    public void displayAllUsers() {
        users.forEach(user -> System.out.println(user.getName()));
    }

    public void displayCourses() {
        courses.forEach(course -> System.out.println(course.getName()));
    }
}

