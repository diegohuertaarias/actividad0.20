package com.example.demo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class BitwiseDemo extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Bitwise Operators Demo");

        GridPane grid = new GridPane();

        Label label1 = new Label("Enter first number:");
        TextField textField1 = new TextField();
        Label label2 = new Label("Enter second number:");
        TextField textField2 = new TextField();

        Button button = new Button("Compute");

        Label andResult = new Label("AND Result: ");
        Label orResult = new Label("OR Result: ");
        Label xorResult = new Label("XOR Result: ");
        Label notResult1 = new Label("NOT First Number: ");
        Label notResult2 = new Label("NOT Second Number: ");

        button.setOnAction(e -> {
            int num1 = Integer.parseInt(textField1.getText());
            int num2 = Integer.parseInt(textField2.getText());

            andResult.setText("AND Result: " + (num1 & num2));
            orResult.setText("OR Result: " + (num1 | num2));
            xorResult.setText("XOR Result: " + (num1 ^ num2));
            notResult1.setText("NOT First Number: " + ~num1);
            notResult2.setText("NOT Second Number: " + ~num2);
        });

        grid.add(label1, 0, 0);
        grid.add(textField1, 1, 0);
        grid.add(label2, 0, 1);
        grid.add(textField2, 1, 1);
        grid.add(button, 1, 2);
        grid.add(andResult, 0, 3, 2, 1);
        grid.add(orResult, 0, 4, 2, 1);
        grid.add(xorResult, 0, 5, 2, 1);
        grid.add(notResult1, 0, 6, 2, 1);
        grid.add(notResult2, 0, 7, 2, 1);

        Scene scene = new Scene(grid, 400, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
