package projectA;


import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;


public class Manager extends Employee {
    private ManagerType managerType;
    private Course course;
    private List<String> responsibilities;
    public Manager(String id, String name, String email, String password, String role, String employeeId, String department, double salary, List<String> responsibilities) {
        super(id, name, email, password, role, employeeId, department, salary);
        this.responsibilities = responsibilities;
    }

    public String getName(){
        return super.getName();
    }
    public ManagerType getManagerType() {
        return managerType;
    }
    public void setManagerType(ManagerType managerType) {
        this.managerType = managerType;
    }
    public String getId(){
        return super.getId();
    }
    public String getEmail(){
        return super.getEmail();
    }

    public void assignTask(Employee employee, String task) {
        java.lang.System.out.println(employee.getName() + " assigned to " + task);
    }

    public void approveStudentRegistration(Student student) {
        java.lang.System.out.println("Student " + student.getName() + " has been approved for registration.");
    }

    public void addCourseForRegistration(Course course, String major, int yearOfStudy) {
        java.lang.System.out.println("Course " + course.getName() + " added for major: " + major + " and year: " + yearOfStudy);
    }

    public void evaluatePerformance(Employee employee) {
        java.lang.System.out.println("Evaluating performance of " + employee.getName());
    }
    public void assignCourseToTeacher(Course course, Teacher teacher) {
        course.addInstructor(teacher);
        java.lang.System.out.println("Assigned course " + course.getName() + " to teacher " + teacher.getName());
    }
    public void viewInfoAboutStudents(List<Student> students, Comparator<Student> comparator) {
        students.sort(comparator);
        for (Student student : students) {
            java.lang.System.out.println("Student Name: " + student.getName() + ", GPA: " + student.getGpa());
        }
    }

    public void viewInfoAboutTeachers(List<Teacher> teachers, Comparator<Teacher> comparator) {
        teachers.sort(comparator);
        for (Teacher teacher : teachers) {
            java.lang.System.out.println("Teacher Name: " + teacher.getName());
        }
    }
}
