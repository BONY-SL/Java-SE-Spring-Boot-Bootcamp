package com.example.demo1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class AddValueController {

    @FXML
    private TextField numberOne;

    @FXML
    private TextField numberTwo;

    @FXML
    private Label showResult;

    @FXML
    public void showResultMethod(ActionEvent actionEvent){

        String number1 = numberOne.getText();
        String number2 = numberTwo.getText();

        int num1 = Integer.parseInt(number1);
        int num2 = Integer.parseInt(number2);

        int result = num1 + num2;

        showResult.setText(String.valueOf(result));

    }
}
