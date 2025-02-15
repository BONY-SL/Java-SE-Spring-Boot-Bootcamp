package day09;

import java.util.Scanner;

public class StudentDemoCode {

    public static void main(String[] args) {

        Student [] students = new Student[10];

        for (int i = 0; i < 10; i++) {

            Student student = new Student();

            System.out.print("Enter Student Id : ");
            student.setStudentId(new Scanner(System.in).nextInt());

            System.out.print("Enter Student Name : ");
            student.setName(new Scanner(System.in).nextLine());

            System.out.print("Enter Student Address : ");
            student.setHomeAddress(new Scanner(System.in).nextLine());

            students[i] = student;
        }

        for (Student student : students){

            System.out.print(student.getStudentId());
            System.out.print(student.getName());
            System.out.print(student.getHomeAddress());
            System.out.println();
        }
    }
}
