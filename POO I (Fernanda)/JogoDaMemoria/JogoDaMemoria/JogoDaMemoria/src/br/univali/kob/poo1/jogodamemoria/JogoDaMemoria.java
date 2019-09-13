/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.univali.kob.poo1.jogodamemoria;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 *
 * @author 6322875
 */
public class JogoDaMemoria extends Application{

    private static Stage stage;
    private static Scene mainMenuScene;
    private static Scene gameScene;
    private static Scene rankingScene;
    
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        stage = primaryStage;
        
        primaryStage.setTitle("Jogo da Memória");
        
        Parent mainMenu = FXMLLoader.load(getClass().getResource("/br/univali/kob/poo1/view/FXMLMainMenuScene.fxml"));
        mainMenuScene = new Scene(mainMenu);
        
        Parent game = FXMLLoader.load(getClass().getResource("/br/univali/kob/poo1/view/FXMLGameScene.fxml"));
        gameScene = new Scene(game);
        
        Parent ranking = FXMLLoader.load(getClass().getResource("/br/univali/kob/poo1/view/FXMLRankingScene.fxml"));
        rankingScene = new Scene(ranking);
        
        
        primaryStage.setScene(mainMenuScene);
        primaryStage.show();
    }
    
    public static void changeScreen(String scr){
        switch(scr){
            case "mainMenu":
                stage.setScene(mainMenuScene);
                break;
            case "gameScene":
                stage.setScene(gameScene);
                break;
            case "rankingScene":
                stage.setScene(rankingScene);
                break;    
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
