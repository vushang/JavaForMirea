package ru.mirea.prak_11and12;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class HelloWorldJavaFX extends Application {
    public static void main(String[] args) {

        launch(args);
    }

    public void start(Stage stage) {
        Text text = new Text("Hello World!");
        text.setLayoutY(80);
        text.setLayoutX(120);

        Group group = new Group(text);

        Scene scene = new Scene(group);
        stage.setScene(scene);
        stage.setTitle("HelloWorld Application");
        stage.setWidth(310);
        stage.setHeight(200);
        stage.show();
    }
}
