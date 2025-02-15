package demo;

public class Student {

    private Integer studentId;
    private String name;
    private String address;

    public Student(){

    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void study(){
        System.out.println("Study.....");
    }

    public void takeExam(){
        System.out.println("Take Exam.....");
    }

    @Override
    public String toString(){
        return "Student ID : " + this.getStudentId() + "\n" +
                "Student Name :  " + this.getName() + "\nStudent Address : "
                + this.getAddress();
    }
}
