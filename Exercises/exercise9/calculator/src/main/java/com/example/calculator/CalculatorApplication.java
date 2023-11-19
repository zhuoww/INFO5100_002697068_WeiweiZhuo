package Exercises.exercise9.calculator.src.main.java.com.example.calculator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Parent;

import java.io.IOException;
import java.util.Objects;

public class CalculatorApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Parent parent = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("calculator-view.fxml")));
        Scene scene = new Scene(parent);
        stage.setTitle("Calculator");
        stage.setScene(scene);
        stage.centerOnScreen();
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}