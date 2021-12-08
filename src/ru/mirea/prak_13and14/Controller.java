package ru.mirea.prak_13and14;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.text.Text;

import java.util.ArrayList;

public class Controller {
    @FXML
    private Text buttonText0;
    @FXML
    private Text buttonText1;
    @FXML
    private Text buttonText2;
    @FXML
    private Text buttonText3;
    @FXML
    private Text buttonText4;
    @FXML
    private Text buttonText5;
    @FXML
    private Text buttonText6;
    @FXML
    private Text buttonText7;
    @FXML
    private Text buttonText8;
    @FXML
    private Text buttonText9;
    @FXML
    private Text buttonText10;
    @FXML
    private Text buttonText11;
    @FXML
    private Text buttonText12;
    @FXML
    private Text buttonText13;
    @FXML
    private Text buttonText14;
    @FXML
    private Text buttonText15;
    @FXML
    private Text loseText;
    @FXML
    private Text drawText;
    @FXML
    private Text winText;

    private boolean start = true; // Первый ходит X(крестик)
    private int index;
    private int result = -2;

    //private boolean start = true;
    ArrayList<Integer> arrayButton = new ArrayList<>();

    {
        for (int i = 0; i < 16; ++i) arrayButton.add(0);
    }

    private Model model = new Model();

    @FXML
    private void processSelection(ActionEvent event) {
        String value = ((Button) event.getSource()).getText();
        index = Integer.valueOf(value);
        // проверка на пустату в массиве и ввод в квадрат крестика или нолика
        if (start && arrayButton.get(index) == 0) {
            arrayButton.set(index, 1);
            addTextCross();
            start = false;

        } else if (start == false && arrayButton.get(index) == 0) {
            arrayButton.set(index, 2);
            addTextCircle();
            start = true;
        }
        checkArray();

        result = model.cheсkPlay(arrayButton);
        if (result == -1) {
            loseText.setText("LOSE");
        } else if (result == 0) {
            drawText.setText("DRAW");
        } else if (result == 1) {
            winText.setText("WIN");
        }
    }

    @FXML
    private void processReset() {
        for (int i = 0; i < 16; ++i) arrayButton.set(i, 0);
        loseText.setText("");
        drawText.setText("");
        winText.setText("");
        start = true;
        resetAddedText();
    }

    private void addTextCross() {
        switch (index) {
            case 0:
                buttonText0.setText("X");
                break;
            case 1:
                buttonText1.setText("X");
                break;
            case 2:
                buttonText2.setText("X");
                break;
            case 3:
                buttonText3.setText("X");
                break;
            case 4:
                buttonText4.setText("X");
                break;
            case 5:
                buttonText5.setText("X");
                break;
            case 6:
                buttonText6.setText("X");
                break;
            case 7:
                buttonText7.setText("X");
                break;
            case 8:
                buttonText8.setText("X");
                break;
            case 9:
                buttonText9.setText("X");
                break;
            case 10:
                buttonText10.setText("X");
                break;
            case 11:
                buttonText11.setText("X");
                break;
            case 12:
                buttonText12.setText("X");
                break;
            case 13:
                buttonText13.setText("X");
                break;
            case 14:
                buttonText14.setText("X");
                break;
            case 15:
                buttonText15.setText("X");
                break;


        }
    }

    private void addTextCircle() {
        switch (index) {
            case 0:
                buttonText0.setText("O");
                break;
            case 1:
                buttonText1.setText("O");
                break;
            case 2:
                buttonText2.setText("O");
                break;
            case 3:
                buttonText3.setText("O");
                break;
            case 4:
                buttonText4.setText("O");
                break;
            case 5:
                buttonText5.setText("O");
                break;
            case 6:
                buttonText6.setText("O");
                break;
            case 7:
                buttonText7.setText("O");
                break;
            case 8:
                buttonText8.setText("O");
                break;
            case 9:
                buttonText9.setText("O");
                break;
            case 10:
                buttonText10.setText("O");
                break;
            case 11:
                buttonText11.setText("O");
                break;
            case 12:
                buttonText12.setText("O");
                break;
            case 13:
                buttonText13.setText("O");
                break;
            case 14:
                buttonText14.setText("O");
                break;
            case 15:
                buttonText15.setText("O");
                break;

        }
    }

    private void resetAddedText() {
        buttonText0.setText("");
        buttonText1.setText("");
        buttonText2.setText("");
        buttonText3.setText("");
        buttonText4.setText("");
        buttonText5.setText("");
        buttonText6.setText("");
        buttonText7.setText("");
        buttonText8.setText("");
        buttonText9.setText("");
        buttonText10.setText("");
        buttonText11.setText("");
        buttonText12.setText("");
        buttonText13.setText("");
        buttonText14.setText("");
        buttonText15.setText("");
    }

    private void checkArray() {
        for (int i = 0; i < arrayButton.size(); ++i) {
            if (i == 3 || i == 7 || i == 11 || i == 15)
                System.out.println(arrayButton.get(i));
            else
                System.out.print(arrayButton.get(i) + " ");
        }
        System.out.println();

    }
}
