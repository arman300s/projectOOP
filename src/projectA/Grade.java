package projectA;

public class Grade {
    private Student student;
    private Mark mark;

    public Grade(Student student, Mark mark) {
        this.student = student;
        this.mark = mark;
    }

    public Student getStudent() {
        return student;
    }

    public Mark getMark() {
        return mark;
    }

    public void setMark(Mark mark) {
        this.mark = mark;
    }
}

