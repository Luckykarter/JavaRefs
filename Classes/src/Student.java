public class Student {
    String firstName, lastName, declaredMajor;
    int expectedYear;
    double gpa;

    public Student(String firstName, String lastName,
                   int expectedYear, double gpa, String declaredMajor) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.expectedYear = expectedYear;
        this.gpa = gpa;
        this.declaredMajor = declaredMajor;
    }

    public void addYear() {
        this.expectedYear++;
    }

}
