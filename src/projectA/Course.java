package projectA;


import java.util.ArrayList;
import java.util.List;

public class Course {

    private String courseId;

    private String name;

    private Integer credits;
    private List<Teacher> instructors;
    private Teacher teacher;
    private Manager manager;
    private Lesson lesson;
    private System system;
    private Mark mark;
    private Student student;
    public Course(String courseId, String name, int credits) {
        this.courseId = courseId;
        this.name = name;
        this.credits = credits;
        this.instructors = new ArrayList<>();
    }

    public void addInstructor(Teacher teacher) {
        instructors.add(teacher);
    }

    public List<Student> getStudents() {
        // Implementation here
        return new ArrayList<>();
    }
}
