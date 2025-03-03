package com.example.demo1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class CalController {

    @FXML
    private Label lblresultShow;

    @FXML
    private TextField numberOne;

    @FXML
    private TextField numberTwo;

    private Integer setResult;

    private String calculation;

    @FXML
    void addition(ActionEvent event) {

        calculation = "add";


    }

    @FXML
    void division(ActionEvent event) {
        calculation = "div";
    }

    @FXML
    void multification(ActionEvent event) {
        calculation = "mul";
    }

    @FXML
    void showResult(ActionEvent event) {

        if(this.calculation == null){
            lblresultShow.setText("Please Select Operation");
        } else if(this.calculation.equals("add")){
            this.setResult = Integer.parseInt(numberOne.getText()) + Integer.parseInt(numberTwo.getText());
            lblresultShow.setText(String.valueOf(this.setResult));
        } else if (this.calculation.equals("div")) {
            this.setResult = Integer.parseInt(numberOne.getText()) / Integer.parseInt(numberTwo.getText());
            lblresultShow.setText(String.valueOf(this.setResult));
        }else if (this.calculation.equals("mul")) {
            this.setResult = Integer.parseInt(numberOne.getText()) * Integer.parseInt(numberTwo.getText());
            lblresultShow.setText(String.valueOf(this.setResult));
        }else if (this.calculation.equals("sub")) {
            this.setResult = Integer.parseInt(numberOne.getText()) - Integer.parseInt(numberTwo.getText());
            lblresultShow.setText(String.valueOf(this.setResult));
        }
    }

    @FXML
    void substraction(ActionEvent event) {
        calculation = "sub";
    }
}
