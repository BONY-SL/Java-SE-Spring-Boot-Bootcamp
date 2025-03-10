package org.jdbc.demo.jdbcdemo.model;

public class Student {

    private String name;
    private String address;
    private String contact;
    private int age;

    public Student() {
    }

    public Student(String name, String address, String contact, int age) {
        this.name = name;
        this.address = address;
        this.contact = contact;
        this.age = age;
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

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", contact='" + contact + '\'' +
                ", age=" + age +
                '}';
    }
}
