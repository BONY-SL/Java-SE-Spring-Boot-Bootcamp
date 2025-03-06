package Q_06;

public class StudentTest {

    public static void main(String[] args) {

        boolean isTrue = false;

        Student student1 = new Student();
        student1.setFirstName("amal");
        student1.setLastName("anjana");
        student1.setGpa(3.50);

        Student student2 = new Student();
        student2.setFirstName("kamal");
        student2.setLastName("bimsara");
        student2.setGpa(3.45);

        System.out.println(student1);
        System.out.println(student2);

        isTrue = student2.isStudentQualifiesForHonorRoll(student2);

        if(isTrue){
            System.out.println(student1.getFirstName() + "is Valid for Honor");
        }else {
            System.out.println("Not Valid For Honor");
        }


    }
}
