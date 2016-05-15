/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package armycalculator;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Greg
 */
public class ArmyCalculator extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Button btn = new Button();
        Button load_btn = new Button();
        btn.setText("Create an army");
        load_btn.setText("Load an army");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });
        
        StackPane root = new StackPane();
        StackPane load = new StackPane();
        root.getChildren().add(btn);
        load.getChildren().add(load_btn);
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Army Calculator");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
