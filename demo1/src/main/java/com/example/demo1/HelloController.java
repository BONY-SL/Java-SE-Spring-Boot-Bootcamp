package com.example.demo1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    private TextField txtGetName;

    @FXML
    private Label showName;

    @FXML
    protected void printUserName(ActionEvent actionEvent) {

        String name = txtGetName.getText();
        showName.setText("Welcome "+name);

        System.out.println("Welcome "+name);

    }
}