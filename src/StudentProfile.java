package src;

public class StudentProfile {

    String firstName;
    String lastName;
    int expectedYearToGraduate;
    double GPA;
    String declaredMajor;

    public void delayGraduation() {
        this.expectedYearToGraduate = this.expectedYearToGraduate + 1;
    }

    public StudentProfile(String firstName, String lastName, int expectedYearToGraduate, double GPA, String declaredMajor) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.expectedYearToGraduate = expectedYearToGraduate;
        this.GPA = GPA;
        this.declaredMajor = declaredMajor;
    }

}
