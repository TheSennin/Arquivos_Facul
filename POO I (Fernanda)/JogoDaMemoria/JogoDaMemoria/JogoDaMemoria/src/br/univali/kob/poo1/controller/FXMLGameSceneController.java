/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.univali.kob.poo1.controller;

import br.univali.kob.poo1.jogodamemoria.Cronometer;
import br.univali.kob.poo1.jogodamemoria.Game;
import br.univali.kob.poo1.jogodamemoria.JogoDaMemoria;
import br.univali.kob.poo1.jogodamemoria.Ranking;
import br.univali.kob.poo1.jogodamemoria.RankingRepository;
import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextInputDialog;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author 6322875
 */
public class FXMLGameSceneController implements Initializable {
    
    
    @FXML
    private ImageView img1;

    @FXML
    private ImageView img2;

    @FXML
    private ImageView img3;

    @FXML
    private ImageView img4;

    @FXML
    private ImageView img5;

    @FXML
    private ImageView img6;

    @FXML
    private ImageView img7;

    @FXML
    private ImageView img8;

    @FXML
    private ImageView img9;

    @FXML
    private ImageView img10;

    @FXML
    private ImageView img11;

    @FXML
    private ImageView img12;

    @FXML
    private ImageView img13;

    @FXML
    private ImageView img14;

    @FXML
    private ImageView img15;

    @FXML
    private ImageView img16;

    @FXML
    private ImageView img17;

    @FXML
    private ImageView img18;

    @FXML
    private ImageView img19;

    @FXML
    private ImageView img20;

    @FXML
    private Button btnVoltar;
    
    @FXML
    private Button btnComecar;
    
    Game game;
    
    private String transparentCard = "/br/univali/kob/poo1/images/transparent-card.jpg";
    
    Ranking match;
            
    Thread t2;
    
    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //todo
    }    
    
    @FXML
    private void btnVoltarAction(ActionEvent event){
        JogoDaMemoria.changeScreen("mainMenu");
    }
    
    @FXML
    private void btnComecarAction(ActionEvent event){
        game = new Game(this);
        btnComecar.setText("Sort Again");
        Cronometer timer = new Cronometer(this, 5000);
        Thread t1 = new Thread(timer);
        match = new Ranking(game);
        t2 = new Thread(match);
        showAllCards();
        t1.start();
        t2.start();
    }
    
    @FXML
    void loadCard1(MouseEvent event) {
        if(!game.getSelectedCardByIndex(1).equals(transparentCard)){
            if(game.turnedCards()){
                loadCard1(game.getSelectedCardByIndex(1));
                game.setTurnedCards(game.getSelectedCardByIndex(1));
            }else{
                loadCard1(game.getDefaultCardByIndex(1));
            }
            if(game.endOfGame()){
                showRankingAlert();
            }
        }
    }
    
    @FXML
    void loadCard2(MouseEvent event) {
        if(!game.getSelectedCardByIndex(1).equals(transparentCard)){
            if(game.turnedCards()){
                loadCard2(game.getSelectedCardByIndex(2));
                game.setTurnedCards(game.getSelectedCardByIndex(2));
            }else{
                loadCard2(game.getDefaultCardByIndex(2));
            }
            if(game.endOfGame()){
                showRankingAlert();
            }
        }
    }
    
    @FXML
    void loadCard3(MouseEvent event) {
        if(!game.getSelectedCardByIndex(1).equals(transparentCard)){
            if(game.turnedCards()){
                loadCard3(game.getSelectedCardByIndex(3));
                game.setTurnedCards(game.getSelectedCardByIndex(3));
            }else{
                loadCard3(game.getDefaultCardByIndex(3));
            }
            if(game.endOfGame()){
                showRankingAlert();
            }
        }
    }
    
    @FXML
    void loadCard4(MouseEvent event) {
        if(!game.getSelectedCardByIndex(4).equals(transparentCard)){
            if(game.turnedCards()){
                loadCard4(game.getSelectedCardByIndex(4));
                game.setTurnedCards(game.getSelectedCardByIndex(4));
            }else{
                loadCard4(game.getDefaultCardByIndex(4));
            }
            if(game.endOfGame()){
                showRankingAlert();
            }
        }
    }
    
    @FXML
    void loadCard5(MouseEvent event) {
        if(!game.getSelectedCardByIndex(5).equals(transparentCard)){
            if(game.turnedCards()){
                loadCard5(game.getSelectedCardByIndex(5));
                game.setTurnedCards(game.getSelectedCardByIndex(5));
            }else{
                loadCard5(game.getDefaultCardByIndex(5));
            }
            if(game.endOfGame()){
                showRankingAlert();
            }
        }
    }
    
    @FXML
    void loadCard6(MouseEvent event) {
        if(!game.getSelectedCardByIndex(6).equals(transparentCard)){
            if(game.turnedCards()){
                loadCard6(game.getSelectedCardByIndex(6));
                game.setTurnedCards(game.getSelectedCardByIndex(6));
            }else{
                loadCard6(game.getDefaultCardByIndex(6));
            }
            if(game.endOfGame()){
                showRankingAlert();
            }
        }
    }
    
    @FXML
    void loadCard7(MouseEvent event) {
        if(!game.getSelectedCardByIndex(7).equals(transparentCard)){
            if(game.turnedCards()){
                loadCard7(game.getSelectedCardByIndex(7));
                game.setTurnedCards(game.getSelectedCardByIndex(7));
            }else{
                loadCard7(game.getDefaultCardByIndex(7));
            }
            if(game.endOfGame()){
                showRankingAlert();
            }
        }
    }
    
    @FXML
    void loadCard8(MouseEvent event) {
        if(!game.getSelectedCardByIndex(8).equals(transparentCard)){
            if(game.turnedCards()){
                loadCard8(game.getSelectedCardByIndex(8));
                game.setTurnedCards(game.getSelectedCardByIndex(8));
            }else{
                loadCard8(game.getDefaultCardByIndex(8));
            }
            if(game.endOfGame()){
                showRankingAlert();
            }
        }
    }
    
    @FXML
    void loadCard9(MouseEvent event) {
        if(!game.getSelectedCardByIndex(9).equals(transparentCard)){
            if(game.turnedCards()){
                loadCard9(game.getSelectedCardByIndex(9));
                game.setTurnedCards(game.getSelectedCardByIndex(9));
            }else{
                loadCard9(game.getDefaultCardByIndex(1));
            }
            if(game.endOfGame()){
                showRankingAlert();
            }
        }
    }
    
    @FXML
    void loadCard10(MouseEvent event) {
        if(!game.getSelectedCardByIndex(10).equals(transparentCard)){
            if(game.turnedCards()){
                loadCard10(game.getSelectedCardByIndex(10));
                game.setTurnedCards(game.getSelectedCardByIndex(10));
            }else{
                loadCard10(game.getDefaultCardByIndex(10));
            }
            if(game.endOfGame()){
                showRankingAlert();
            }
        }
    }
    
    @FXML
    void loadCard11(MouseEvent event) {
        if(!game.getSelectedCardByIndex(11).equals(transparentCard)){
            if(game.turnedCards()){
                loadCard11(game.getSelectedCardByIndex(11));
                game.setTurnedCards(game.getSelectedCardByIndex(11));
            }else{
                loadCard11(game.getDefaultCardByIndex(11));
            }
            if(game.endOfGame()){
                showRankingAlert();
            }
        }
    }
    
    @FXML
    void loadCard12(MouseEvent event) {
        if(!game.getSelectedCardByIndex(1).equals(transparentCard)){
            if(game.turnedCards()){
                loadCard12(game.getSelectedCardByIndex(12));
                game.setTurnedCards(game.getSelectedCardByIndex(12));
            }else{
                loadCard12(game.getDefaultCardByIndex(12));
            }
            if(game.endOfGame()){
                showRankingAlert();
            }
        }
    }
    
    @FXML
    void loadCard13(MouseEvent event) {
        if(!game.getSelectedCardByIndex(13).equals(transparentCard)){
            if(game.turnedCards()){
                loadCard13(game.getSelectedCardByIndex(13));
                game.setTurnedCards(game.getSelectedCardByIndex(13));
            }else{
                loadCard13(game.getDefaultCardByIndex(13));
            }
            if(game.endOfGame()){
                showRankingAlert();
            }
        }
    }
    
    @FXML
    void loadCard14(MouseEvent event) {
        if(!game.getSelectedCardByIndex(14).equals(transparentCard)){
            if(game.turnedCards()){
                loadCard14(game.getSelectedCardByIndex(14));
                game.setTurnedCards(game.getSelectedCardByIndex(14));
            }else{
                loadCard14(game.getDefaultCardByIndex(14));
            }
            if(game.endOfGame()){
                showRankingAlert();
            }
        }
    }
    
    @FXML
    void loadCard15(MouseEvent event) {
        if(!game.getSelectedCardByIndex(15).equals(transparentCard)){
            if(game.turnedCards()){
                loadCard15(game.getSelectedCardByIndex(15));
                game.setTurnedCards(game.getSelectedCardByIndex(15));
            }else{
                loadCard15(game.getDefaultCardByIndex(15));
            }
            if(game.endOfGame()){
                showRankingAlert();
            }
        }
    }
    
    @FXML
    void loadCard16(MouseEvent event) {
        if(!game.getSelectedCardByIndex(16).equals(transparentCard)){
            if(game.turnedCards()){
                loadCard16(game.getSelectedCardByIndex(16));
                game.setTurnedCards(game.getSelectedCardByIndex(16));
            }else{
                loadCard16(game.getDefaultCardByIndex(16));
            }
            if(game.endOfGame()){
                showRankingAlert();
            }
        }
    }
    
    @FXML
    void loadCard17(MouseEvent event) {
        if(!game.getSelectedCardByIndex(17).equals(transparentCard)){
            if(game.turnedCards()){
                loadCard17(game.getSelectedCardByIndex(17));
                game.setTurnedCards(game.getSelectedCardByIndex(17));
            }else{
                loadCard17(game.getDefaultCardByIndex(17));
            }
            if(game.endOfGame()){
                showRankingAlert();
            }
        }
    }
    
    @FXML
    void loadCard18(MouseEvent event) {
        if(!game.getSelectedCardByIndex(18).equals(transparentCard)){
            if(game.turnedCards()){
                loadCard18(game.getSelectedCardByIndex(18));
                game.setTurnedCards(game.getSelectedCardByIndex(18));
            }else{
                loadCard18(game.getDefaultCardByIndex(18));
            }
            if(game.endOfGame()){
                showRankingAlert();
            }
        }
    }
    
    @FXML
    void loadCard19(MouseEvent event) {
        if(!game.getSelectedCardByIndex(19).equals(transparentCard)){
            if(game.turnedCards()){
                loadCard19(game.getSelectedCardByIndex(19));
                game.setTurnedCards(game.getSelectedCardByIndex(19));
            }else{
                loadCard19(game.getDefaultCardByIndex(19));
            }
            if(game.endOfGame()){
                showRankingAlert();
            }
        }
    }
    
    @FXML
    void loadCard20(MouseEvent event) {
        if(!game.getSelectedCardByIndex(20).equals(transparentCard)){
            if(game.turnedCards()){
                loadCard20(game.getSelectedCardByIndex(20));
                game.setTurnedCards(game.getSelectedCardByIndex(20));
            }else{
                loadCard20(game.getDefaultCardByIndex(20));
            }
            if(game.endOfGame()){
                showRankingAlert();
            }
        }
    }
    
    private void loadCard1(String path){
        img1.setImage(new Image(path));
    }
    
    private void loadCard2(String path){
        img2.setImage(new Image(path));
    }
    
    private void loadCard3(String path){
        img3.setImage(new Image(path));
    }
    
    private void loadCard4(String path){
        img4.setImage(new Image(path));
    }
    
    private void loadCard5(String path){
        img5.setImage(new Image(path));
    }
    
    private void loadCard6(String path){
        img6.setImage(new Image(path));
    }
    
    private void loadCard7(String path){
        img7.setImage(new Image(path));
    }
    
    private void loadCard8(String path){
        img8.setImage(new Image(path));
    }
    
    private void loadCard9(String path){
        img9.setImage(new Image(path));
    }
    
    private void loadCard10(String path){
        img10.setImage(new Image(path));
    }
    
    private void loadCard11(String path){
        img11.setImage(new Image(path));
    }
    
    private void loadCard12(String path){
        img12.setImage(new Image(path));
    }
    
    private void loadCard13(String path){
        img13.setImage(new Image(path));
    }
    
    private void loadCard14(String path){
        img14.setImage(new Image(path));
    }
    
    private void loadCard15(String path){
        img15.setImage(new Image(path));
    }
    
    private void loadCard16(String path){
        img16.setImage(new Image(path));
    }
    
    private void loadCard17(String path){
        img17.setImage(new Image(path));
    }
    
    private void loadCard18(String path){
        img18.setImage(new Image(path));
    }
    
    private void loadCard19(String path){
        img19.setImage(new Image(path));
    }
    
    private void loadCard20(String path){
        img20.setImage(new Image(path));
    }
    
    public void showAllCards(){
        loadCard1(game.getSelectedCardByIndex(1));
        loadCard2(game.getSelectedCardByIndex(2));
        loadCard3(game.getSelectedCardByIndex(3));
        loadCard4(game.getSelectedCardByIndex(4));
        loadCard5(game.getSelectedCardByIndex(5));
        loadCard6(game.getSelectedCardByIndex(6));
        loadCard7(game.getSelectedCardByIndex(7));
        loadCard8(game.getSelectedCardByIndex(8));
        loadCard9(game.getSelectedCardByIndex(9));
        loadCard10(game.getSelectedCardByIndex(10));
        loadCard11(game.getSelectedCardByIndex(11));
        loadCard12(game.getSelectedCardByIndex(12));
        loadCard13(game.getSelectedCardByIndex(13));
        loadCard14(game.getSelectedCardByIndex(14));
        loadCard15(game.getSelectedCardByIndex(15));
        loadCard16(game.getSelectedCardByIndex(16));
        loadCard17(game.getSelectedCardByIndex(17));
        loadCard18(game.getSelectedCardByIndex(18));
        loadCard19(game.getSelectedCardByIndex(19));
        loadCard20(game.getSelectedCardByIndex(20)); 
    }
    
    public void loadImagesDefault(){
        loadCard1(game.getDefaultCardByIndex(1));
        loadCard2(game.getDefaultCardByIndex(2));
        loadCard3(game.getDefaultCardByIndex(3));
        loadCard4(game.getDefaultCardByIndex(4));
        loadCard5(game.getDefaultCardByIndex(5));
        loadCard6(game.getDefaultCardByIndex(6));
        loadCard7(game.getDefaultCardByIndex(7));
        loadCard8(game.getDefaultCardByIndex(8));
        loadCard9(game.getDefaultCardByIndex(9));
        loadCard10(game.getDefaultCardByIndex(10));
        loadCard11(game.getDefaultCardByIndex(11));
        loadCard12(game.getDefaultCardByIndex(12));
        loadCard13(game.getDefaultCardByIndex(13));
        loadCard14(game.getDefaultCardByIndex(14));
        loadCard15(game.getDefaultCardByIndex(15));
        loadCard16(game.getDefaultCardByIndex(16));
        loadCard17(game.getDefaultCardByIndex(17));
        loadCard18(game.getDefaultCardByIndex(18));
        loadCard19(game.getDefaultCardByIndex(19));
        loadCard20(game.getDefaultCardByIndex(20));
    }
    
    void showRankingAlert(){
        TextInputDialog dialog = new TextInputDialog();
        dialog.setGraphic(new ImageView(this.getClass().getResource("../images/ranking.png").toString()));
        dialog.setTitle("New Ranking!");
        dialog.setHeaderText("Congratulations!\nYour Stats: \nPlays: " + game.getMoveCount() + 
                             "\nMatchTime: " + match.getMatchTime() + " seconds");
        dialog.setContentText("Please enter your name:");

        Optional<String> result = dialog.showAndWait();
        
        String name = "";
        if (result.isPresent()){
            name = result.get();
        }
        
        Ranking r = new Ranking(name, match.getMoveCount(), match.getMatchTime());
        RankingRepository.Write(r);
        match.setName(name);
        match.showStats();
    }
    
    
}
