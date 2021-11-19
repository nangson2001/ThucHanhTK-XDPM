package com.example.aimssystem;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.DateCell;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.IOException;

public class HocJavaFX extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("home-screen.fxml"));
        Scene scene = new Scene(loader.load(), 1366, 768);
//        scene.getStylesheets().add(getClass().getResource("home-screen.css").toExternalForm());
        primaryStage.setTitle("Hello app!!!!!!!!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
