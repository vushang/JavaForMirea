package ru.mirea.prak_11and12;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Calculator_FX extends Application{

    public static void main(String[] args) {

        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {


        Parent root = FXMLLoader.load(getClass().getResource("Sample.fxml"));
        stage.setTitle("Calculator");
        stage.setScene(new Scene(root, 300, 380));
        stage.show();
    }
}
