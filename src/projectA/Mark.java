package projectA;



public class Mark {

    private Double firstAttestation;
    private Double secondAttestation;
    private Double finalExam;
    private Double value;
    public Mark(double firstAttestation, double secondAttestation, double finalExam) {
        this.firstAttestation = firstAttestation;
        this.secondAttestation = secondAttestation;
        this.finalExam = finalExam;
    }
    public double getFirstAttestation() {
        return firstAttestation;
    }
    public void setFirstAttestation(double firstAttestation) {
        this.firstAttestation = firstAttestation;
    }
    public double getSecondAttestation() {
        return secondAttestation;
    }
    public void setSecondAttestation(double secondAttestation) {
        this.secondAttestation = secondAttestation;
    }
    public Mark(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }


    public double calculateTotal() {
        return firstAttestation  + secondAttestation  + finalExam * 0.4;
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

