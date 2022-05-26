/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.cefsa.projeto;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

/**
 *
 * @author sanch
 */
public class FuncionarioTela extends Application {

    private static Stage stage;

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/Funcionario.fxml"));

        Image applicationIcon = new Image(getClass().getResourceAsStream("/icons/Logo.png"));
        stage.getIcons().add(applicationIcon);

        Scene scene = new Scene(root);
        scene.getStylesheets().add("/styles/Funcionario.css");

        stage.setTitle(" Two Wheels Workshop ");
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
        setStage(stage);
    }

    public static Stage getStage() {
        return stage;
    }

    public static void setStage(Stage stage) {
        FuncionarioTela.stage = stage;
    }

    public static void main(String[] args) {
        launch(args);
    }
}