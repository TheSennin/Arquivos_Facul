package br.univali.kob.grafos;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class Main extends Application{
    private static Stage stage;
    private static Scene mainMenuScene;

        @Override
        public void start(Stage primaryStage) throws IOException {
                stage = primaryStage;

                primaryStage.setTitle("Graph Generator");

                Parent mainMenu = FXMLLoader.load(getClass().getResource("/br/univali/kob/GUI/GUI.fxml"));
                mainMenuScene = new Scene(mainMenu);

                primaryStage.setScene(mainMenuScene);
                primaryStage.show();
        }

        public static void main(String[] args) {
                launch(args);
        }
}

