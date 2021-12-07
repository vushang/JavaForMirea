package ru.mirea.prak_11and12;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.text.Text;

public class Controller {
    @FXML
    private Text input;
    @FXML
    private Text output;

    private long num1 = 0;
    private long num2 = 0;

    private boolean start = true;


    private String operator = "";
    private ModelCalc model = new ModelCalc();


    @FXML
    private void processNum(ActionEvent event) {
        if (start) {
            input.setText("");
            output.setText("");
            start = false;

        }
        String value = ((Button) event.getSource()).getText();
        input.setText(input.getText() + value);
    }

    @FXML
    private void processOperator(ActionEvent event) {
        String value = ((Button) event.getSource()).getText();
        if (!"=".equals(value)) {
            if (!operator.isEmpty() || start) return;
            operator = value;
            num1 = Long.parseLong(input.getText());
            input.setText("");
        } else {
            if (operator.isEmpty()) return;
            num2 = Long.parseLong(input.getText());
            output.setText(String.valueOf(model.calc(num1, num2, operator)));
            input.setText(model.MatExample(String.valueOf(num1), String.valueOf(num2), operator));
            operator = "";
            start = true;

        }

    }
}
