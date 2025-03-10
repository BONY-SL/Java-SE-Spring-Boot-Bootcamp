package org.jdbc.demo.jdbcdemo;

import org.jdbc.demo.jdbcdemo.model.Student;

import java.util.ArrayList;

public class StudentArray {

    private static final ArrayList<Student> students = new ArrayList<>();

    public static ArrayList<Student> getStudents() {
        return students;
    }
}
