package projectA;


import java.util.ArrayList;
import java.util.List;

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

    public String getName(){
        return super.getName();
    }
    public String getEmail(){
        return super.getEmail();
    }
    public String employeeId(){
        return employeeId();
    }


    public void assignGrade(Student student, Course course, Mark mark) {
        course.assignGradeToStudent(student, mark); // Call the course method to assign the grade
    }

    public void sendComplaint(Student student, UrgencyLevel urgencyLevel, String message) {
        java.lang.System.out.println("Complaint from Teacher " + getName() + ": \n" +
                "Student: " + student.getName() + "\n" +
                "Urgency Level: " + urgencyLevel + "\n" +
                "Message: " + message);
    }

    public List<Course> viewCourses() {
        return courses;
    }


}
