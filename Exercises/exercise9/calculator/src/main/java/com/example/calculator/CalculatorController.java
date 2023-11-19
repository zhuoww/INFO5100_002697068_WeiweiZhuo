package Exercises.exercise9.calculator.src.main.java.com.example.calculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.fxml.Initializable;
import java.net.URL;
import java.util.ResourceBundle;

public class CalculatorController implements Initializable {
    @FXML
    private TextField leftTextField;
    @FXML
    private TextField rightTextField;
    @FXML
    private TextField resultTextField;
    @FXML
    private Button plusButton;
    @FXML
    private Button minusButton;
    @FXML
    private Button multipleButton;
    @FXML
    private Button divisionButton;

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }
    @FXML
    private void operatorButtonAction(ActionEvent event) {
        double left = 0.0;
        double right = 0.0;
        double res = 0;

        if (leftTextField.getText().equals("") || rightTextField.getText().equals("")) {
            left = 0.0;
            right = 0.0;
        }else {
            left = Double.parseDouble(leftTextField.getText());
            right = Double.parseDouble(rightTextField.getText());
        }

        if (event.getSource() == plusButton) {
            res = left + right;
            resultTextField.setText(Double.toString(res));
        }else if (event.getSource() == minusButton) {
            res = left - right;
            resultTextField.setText(Double.toString(res));
        }else if (event.getSource() == multipleButton) {
            res = left * right;
            resultTextField.setText(Double.toString(res));
        }else if (event.getSource() == divisionButton) {
            res = left / right;
            resultTextField.setText(Double.toString(res));
        }
    }
    @FXML
    public void clearButtonAction(ActionEvent event) {
        leftTextField.setText("");
        rightTextField.setText("");
        resultTextField.setText("");
    }
}