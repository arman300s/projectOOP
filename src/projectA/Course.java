package projectA;


import java.util.List;

/**
 * @generated
 */
public class Course {

    /**
     * @generated
     */
    private String courseId;

    /**
     * @generated
     */
    private String name;

    /**
     * @generated
     */
    private Integer credits;

    /**
     * @generated
     */
    private invalid type;

    /**
     * @generated
     */
    private List<Teacher> instructors;


    /**
     * @generated
     */
    private Teacher teacher;

    /**
     * @generated
     */
    private Manager manager;

    /**
     * @generated
     */
    private Lesson lesson;

    /**
     * @generated
     */
    private System system;

    /**
     * @generated
     */
    private Mark mark;

    /**
     * @generated
     */
    private Student student;


    /**
     * @generated
     */
    private String getCourseId() {
        return this.courseId;
    }

    /**
     * @generated
     */
    private String setCourseId(String courseId) {
        this.courseId = courseId;
    }

    /**
     * @generated
     */
    private String getName() {
        return this.name;
    }

    /**
     * @generated
     */
    private String setName(String name) {
        this.name = name;
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
    private invalid getType() {
        return this.type;
    }

    /**
     * @generated
     */
    private invalid setType(invalid type) {
        this.type = type;
    }

    /**
     * @generated
     */
    private List<Teacher> getInstructors() {
        return this.instructors;
    }

    /**
     * @generated
     */
    private List<Teacher> setInstructors(List<Teacher> instructors) {
        this.instructors = instructors;
    }


    //                          Operations

    /**
     * @generated
     */
    public List<Student> getStudents() {
        //TODO
        return null;
    }


}
