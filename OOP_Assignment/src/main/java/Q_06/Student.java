package Q_06;

public class Student {
    private String firstName;
    private String lastName;
    private double gpa;

    public Student() {
    }

    public Student(String firstName, String lastName, double gpa) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gpa = gpa;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {

        if(0.0 <= gpa && gpa <= 4.0){
            this.gpa = gpa;
        }else {
            System.out.println("Enter Valid GPA");
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gpa=" + gpa +
                '}';
    }

    public boolean isStudentQualifiesForHonorRoll(Student student){
        return student.getGpa() >= 3.5;
    }
}
