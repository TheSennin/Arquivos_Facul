/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.univali.kob.poo1.controller;

import br.univali.kob.poo1.jogodamemoria.JogoDaMemoria;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.event.ActionEvent;

/**
 * FXML Controller class
 *
 * @author 6322875
 */
public class FXMLMainMenuSceneController implements Initializable{
    @FXML
    private Button btnNewGame;

    @FXML
    private Button btnRanking;

    @FXML
    private Button btnQuitGame;

    @FXML
    private void btnNewGameAction(ActionEvent event){
        JogoDaMemoria.changeScreen("gameScene");
    }
    
    @FXML
    private void btnRankingAction(ActionEvent event){
        JogoDaMemoria.changeScreen("rankingScene");
    }
    
    @FXML
    private void btnQuitGameAction(ActionEvent action){
        System.exit(0);
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    
}
