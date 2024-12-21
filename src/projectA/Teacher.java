package projectA;


import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;


public class Teacher extends Employee {
    private List<Course> courses;
    private TeacherTitle title;
    private HashMap<String, Integer> studentGrades;


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


    public void assignGrade(String studentName, int grade) {
        if (grade < 0 || grade > 100) {
            java.lang.System.out.println("Invalid grade. Please enter a grade between 0 and 100.");
            return;
        }

        studentGrades.put(studentName, grade);
        java.lang.System.out.println("Grade assigned: " + studentName + " received " + grade + ".");
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
