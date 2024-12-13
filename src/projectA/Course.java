package projectA;


import java.util.ArrayList;
import java.util.List;

public class Course {

    private final String courseId;

    private String name;
    private List<Student> students;
    private Integer credits;
    private List<Teacher> instructors;
    private Teacher teacher;
    private Manager manager;
    private Lesson lesson;
    private System system;
    private Mark mark;
    private Student student;
    private List<Grade> grades;

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
    public Grade getGradeForStudent(Student student) {
        return grades.stream()
                .filter(grade -> grade.getStudent().equals(student))
                .findFirst()
                .orElse(null);
}

    public void assignGradeToStudent(Student student, Mark mark) {
        if (students.contains(student)) {
            Grade grade = getGradeForStudent(student);
            if (grade == null) {
                grade = new Grade(student, mark);
                grades.add(grade);
            } else {
                grade.setMark(mark);
            }
            java.lang.System.out.println("Grade for " + student.getName() + " in " + name + " assigned: " + mark);
        } else {
            java.lang.System.out.println(student.getName() + " is not enrolled in this course.");
        }
    }
}
