package projectA;


import java.util.ArrayList;
import java.util.List;

public class Teacher extends Employee {
    private List<Course> courses;
    private TeacherTitle title;

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


    public void assignGrade(Student student, Course course, Mark mark) {}

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
