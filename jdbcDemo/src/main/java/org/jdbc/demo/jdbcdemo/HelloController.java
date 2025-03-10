package org.jdbc.demo.jdbcdemo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import org.jdbc.demo.jdbcdemo.model.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class HelloController {

    @FXML
    private TextField txtAddress;

    @FXML
    private TextField txtAge;

    @FXML
    private TextField txtContact;

    @FXML
    private TextField txtGetName;

    @FXML
    void addStudent(ActionEvent event) {

        Student student = new Student();
        student.setName(txtGetName.getText());
        student.setAddress(txtAddress.getText());
        student.setContact(txtContact.getText());
        student.setAge(Integer.parseInt(txtAge.getText()));

        DatabaseConnection db = DatabaseConnection.getInstance();
        Connection connection = db.getConnection();

        try {
            PreparedStatement insertStudent = connection.prepareStatement
                    ("INSERT INTO Student(Name,Address,ContactNumber,Age)" +
                    "VALUES (?,?,?,?)");

            insertStudent.setString(1,student.getName());
            insertStudent.setString(2,student.getAddress());
            insertStudent.setString(3,student.getContact());
            insertStudent.setInt(4,student.getAge());

            int rowCount = insertStudent.executeUpdate();

            if(rowCount > 0){
                System.out.println("Student Record Added Successfully");
                DatabaseConnection.closeConnection();
            }else {
                System.out.println("Not Inserted Record");
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}