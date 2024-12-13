package projectA;

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

    public String getMajor() {
        return this.major;
    }
    public Integer getYear() {
        return this.year;
    }
    public Double getGpa() {
        return this.gpa;
    }
    public Integer getCredits() {
        return this.credits;
    }
    public Speciality getSpeciality() {
        return this.speciality;
    }
    public Teacher getTeacher() {
        return this.teacher;
    }
    public Course getCourse() {
        return this.course;
    }
    public Lesson getLesson() {
        return this.lesson;
    }
    public Mark getMark() {
        return this.mark;
    }


    public void registerForCourse(Course course) {
        if (course != null) {
            this.course = course;
            java.lang.System.out.println("Successfully registered for the course: " + course.getName());
        } else {
            java.lang.System.out.println("Failed to register. Invalid course.");
        }
    }


    public String viewTranscript() {
        return "Student ID: " + this.studentId + "\n" +
                "Name: " + this.getName() + "\n" +
                "GPA: " + (this.gpa != null ? this.gpa : "N/A") + "\n" +
                "Credits: " + (this.credits != null ? this.credits : "N/A") + "\n" +
                "Year: " + this.year + "\n" +
                "Major: " + (this.major != null ? this.major : "N/A");
    }


    public void rateTeacher(Teacher teacher, int rating) {
        if (teacher != null && rating >= 1 && rating <= 5) {
            java.lang.System.out.println("Rated teacher " + teacher.getName() + " with " + rating + " stars.");
        } else {
            java.lang.System.out.println("Invalid rating or teacher.");
        }
    }


    public void dropFromCourse(Course course) {
        if (this.course != null && this.course.equals(course)) {
            this.course = null;
            java.lang.System.out.println("Successfully dropped from the course: " + course.getName());
        } else {
            java.lang.System.out.println("Cannot drop from the course. Not registered in the course.");
        }
    }



}