package projectA;


/**
 * @generated
 */
public class Student extends User {

    /**
     * @generated
     */
    private String studentId;

    /**
     * @generated
     */
    private String major;

    /**
     * @generated
     */
    private Integer year;

    /**
     * @generated
     */
    private Double gpa;

    /**
     * @generated
     */
    private Integer credits;

    /**
     * @generated
     */
    private Speciality speciality;


    /**
     * @generated
     */
    private Teacher teacher;

    /**
     * @generated
     */
    private Course course;

    /**
     * @generated
     */
    private Lesson lesson;

    /**
     * @generated
     */
    private Mark mark;


    /**
     * @generated
     */
    private String getStudentId() {
        return this.studentId;
    }

    /**
     * @generated
     */
    private String setStudentId(String studentId) {
        this.studentId = studentId;
    }

    /**
     * @generated
     */
    private String getMajor() {
        return this.major;
    }

    /**
     * @generated
     */
    private String setMajor(String major) {
        this.major = major;
    }

    /**
     * @generated
     */
    private Integer getYear() {
        return this.year;
    }

    /**
     * @generated
     */
    private Integer setYear(Integer year) {
        this.year = year;
    }

    /**
     * @generated
     */
    private Double getGpa() {
        return this.gpa;
    }

    /**
     * @generated
     */
    private Double setGpa(Double gpa) {
        this.gpa = gpa;
    }

    /**
     * @generated
     */
    private Integer getCredits() {
        return this.credits;
    }

    /**
     * @generated
     */
    private Integer setCredits(Integer credits) {
        this.credits = credits;
    }

    /**
     * @generated
     */
    private Speciality getSpeciality() {
        return this.speciality;
    }

    /**
     * @generated
     */
    private Speciality setSpeciality(Speciality speciality) {
        this.speciality = speciality;
    }


    //                          Operations

    /**
     * @generated
     */
    public Student() {
        //TODO
    }
    /**
     * @generated
     */
    public Speciality getSpeciality() {
        //TODO
        return projectA.Speciality.Information_system;
    }

    /**
     * @generated
     */
    public String viewTranscript() {
        //TODO
        return "";
    }


}