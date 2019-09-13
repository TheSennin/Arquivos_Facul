/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.univali.kob.poo1.controller;

import br.univali.kob.poo1.jogodamemoria.RankingRepository;
import br.univali.kob.poo1.jogodamemoria.JogoDaMemoria;
import br.univali.kob.poo1.jogodamemoria.Ranking;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author 6322875
 */
public class FXMLRankingSceneController implements Initializable {
    
    @FXML
    private Label lblName1;

    @FXML
    private Label lblPlays1;

    @FXML
    private Label lblTime1;

    @FXML
    private Label lblName2;

    @FXML
    private Label lblPlays2;

    @FXML
    private Label lblTime2;

    @FXML
    private Label lblName3;

    @FXML
    private Label lblPlays3;

    @FXML
    private Label lblTime3;
    
    @FXML
    private Button btnBack;
    
    @FXML
    private Button btnRefresh;
    
    private static ArrayList<Ranking> rank = new ArrayList();

    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            rank = RankingRepository.Read();
            load();
        } catch (IOException | ClassNotFoundException ex) {
            ex.getMessage();
        }
    }    

    @FXML
    void btnBackAction(ActionEvent event) {
        JogoDaMemoria.changeScreen("mainMenu");
    }
   
    public void load(){
        RankingRepository.sort();
        try {
            rank = RankingRepository.Read();
        } catch (IOException | ClassNotFoundException ex) {
            ex.getMessage();
        }
        if(rank.size()>0){
             lblName1.setText(rank.get(0).getName());
             lblPlays1.setText("       " + String.valueOf(rank.get(0).getMoveCount()));
             lblTime1.setText("   " + String.valueOf(rank.get(0).getMatchTime()) + " Sec");
             if(rank.size()>1){
                 lblName2.setText(rank.get(1).getName());
                 lblPlays2.setText("       " + String.valueOf(rank.get(1).getMoveCount()));
                 lblTime2.setText("   " + String.valueOf(rank.get(1).getMatchTime()) + " Sec");
                 if(rank.size()>2){
                     lblName3.setText(rank.get(2).getName());
                     lblPlays3.setText("       " + String.valueOf(rank.get(2).getMoveCount()));
                     lblTime3.setText("   " + String.valueOf(rank.get(2).getMatchTime()) + " Sec");
                 }
             }
         }
    }
    
     @FXML
    void btnRefreshAction(ActionEvent event) {
        load();
    }
    
}
