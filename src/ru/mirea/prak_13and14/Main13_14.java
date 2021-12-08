package ru.mirea.prak_13and14;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;



public class Main13_14 extends Application{

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {


        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        stage.setTitle("TicTacToe");
        stage.setScene(new Scene(root, 300, 375));
        stage.show();
    }
}
