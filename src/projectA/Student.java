package projectA;


/**
 * @generated
 */
public class Student extends User {
    private String studentId;
    private String major;
    private Integer year;
    private Double gpa;
    private Integer credits;
    private Speciality speciality;
    private Teacher teacher;
    private Course course;
    private Lesson lesson;
    private Mark mark;
    private String getStudentId() {
        return this.studentId;
    }

    public Student(String id, String name, String email, String password, String role, String studentId, Speciality speciality, int year) {
        super(id, name, email, password, role);
        this.studentId = studentId;
        this.speciality = speciality;
        this.year = year;
    }

    public void registerForCourse(Course course) {
    }

    public String viewTranscript() {
        return "Transcript";
    }

    public void rateTeacher(Teacher teacher, int rating) {
    }


}