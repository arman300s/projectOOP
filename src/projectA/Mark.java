package projectA;



public class Mark {

    private Double firstAttestation;
    private Double secondAttestation;
    private Double finalExam;
    private Course course;
    private Teacher teacher;
    private Student student;
    public Mark(double firstAttestation, double secondAttestation, double finalExam) {
        this.firstAttestation = firstAttestation;
        this.secondAttestation = secondAttestation;
        this.finalExam = finalExam;
    }

    public double calculateTotal() {
        return firstAttestation * 0.3 + secondAttestation * 0.3 + finalExam * 0.4;
    }

    public String getGrade() {
        double total = calculateTotal();
        if (total >= 90) return "A";
        if (total >= 80) return "B";
        if (total >= 70) return "C";
        if (total >= 60) return "D";
        return "F";
    }
}

