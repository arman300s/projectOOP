package projectA;


import java.util.ArrayList;
import java.util.List;

/**
 * @generated
 */
public class Teacher extends Employee {
    private List<Course> courses;
    private TeacherTitle title;
    private Course course;
    private Lesson lesson;
    private Student student;
    private Mark mark;

    public Teacher(String id, String name, String email, String password, String role, String employeeId, String department, double salary, TeacherTitle title) {
        super(id, name, email, password, role, employeeId, department, salary);
        this.title = title;
        this.courses = new ArrayList<>();
    }

    public void assignGrade(Student student, Course course, Mark mark) {
    }

    public void sendComplaint(Student student, UrgencyLevel urgencyLevel, String message) {
    }

    public List<Course> viewCourses() {
        return courses;
    }


}
