package projectA;


import java.util.ArrayList;
import java.util.List;

public class Course {

    private final String courseId;

    private String name;
    private List<Student> students;
    private Integer credits;
    private List<Teacher> instructors;

    public Course(String courseId, String name, int credits) {
        this.courseId = courseId;
        this.name = name;
        this.credits = credits;
        this.instructors = new ArrayList<>();
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public void addInstructor(Teacher teacher) {
        instructors.add(teacher);
    }

    public List<Teacher> getInstructors() {
        return new ArrayList<>(instructors);
    }

    public void enrollStudent(Student student) {
        students.add(student);
    }

    public List<Student> getStudents() {
        return new ArrayList<>(students);
    }

    public void removeStudent(String studentId) {
        students.removeIf(student -> student.getId().equals(studentId));
    }

}
