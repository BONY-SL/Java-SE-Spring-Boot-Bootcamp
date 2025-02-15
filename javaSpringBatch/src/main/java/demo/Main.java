package demo;

public class Main {
    // psvm shortcut for the main method
    public static void main(String[] args) {

        Student student = new Student();

        student.setStudentId(100);
        student.setName("Dilshan");
        student.setAddress("135/E Badanagodagama Beruwala");

        System.out.println(student);
        student.study();
        student.takeExam();

    }
}
