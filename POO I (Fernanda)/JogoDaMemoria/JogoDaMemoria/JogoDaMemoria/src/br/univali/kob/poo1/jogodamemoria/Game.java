/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.univali.kob.poo1.jogodamemoria;

import br.univali.kob.poo1.controller.FXMLGameSceneController;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author 6322875
 */
public class Game {
    
    /**
     * vector that holds the card's path;
     */
    private final String cards[]={"/br/univali/kob/poo1/images/naruto.jpg",
                            "/br/univali/kob/poo1/images/kakashi.jpg",
                            "/br/univali/kob/poo1/images/minato.jpg",
                            "/br/univali/kob/poo1/images/zabuza.jpg",
                            "/br/univali/kob/poo1/images/gaara.jpg",
                            "/br/univali/kob/poo1/images/itachi.jpg",
                            "/br/univali/kob/poo1/images/madara.jpg",
                            "/br/univali/kob/poo1/images/sakura.jpg",
                            "/br/univali/kob/poo1/images/sasuke.jpg",
                            "/br/univali/kob/poo1/images/jiraya.jpg"};
    
    private ArrayList<String> usedCards = new ArrayList();
    
    private ArrayList<String> defaultCards = new ArrayList();
    
    private boolean isTurned;
    
    private int turnedCards;
    
    private int moveCount;
    
    private String cardOneTurned;
    
    private String cardTwoTurned;
    
    private FXMLGameSceneController fx;
    
    private Cronometer refresh;
    
    private Thread systemRefresh;

    
    /**
     * Default constructor
     * @param fx
     */
    public Game(FXMLGameSceneController fx){
        this.fx = fx;
        moveCount = 0;
        turnedCards = 0;
        cardOneTurned = null;
        cardTwoTurned = null;
        generateCards();
        generateDefaultCards();
    }
    
    /**
     * Method used for generate cards in the moment of the instance of game class
     */
    public final void generateCards(){
        usedCards.clear();
        Random rand = new Random();
        for(int i=0;i<20;i++){    
            int index;
            do{
                index = rand.nextInt(10);
            }while(isRepeated(cards[index]));
            usedCards.add(cards[index]);
        }
        System.out.println("Generated random cards...");
    }
    
    public void generateDefaultCards(){
        for(int i=0;i<20;i++){
            defaultCards.add("/br/univali/kob/poo1/images/turned-card.jpg");
        }
        System.out.println("Generated default cards...");
    }

    
    public ArrayList getSelectedCards(){
        return usedCards;
    }
    
    public String getSelectedCardByIndex(int i){
        i = i-1;
        return usedCards.get(i);
    }
    
    public String getDefaultCardByIndex(int i){
        i = i-1;
        return defaultCards.get(i);
    }
    
    public int getMoveCount(){
        return moveCount;
    }
    
    public boolean turnedCards(){
        turnedCards++;
        System.out.println("Turned cards: " + turnedCards);
        if(turnedCards == 1){
            return true;
        }else
            if(turnedCards==2){
                moveCount++;
                return true;
            }
        return false;
    }
    
    public int getNumberOfTurnedCards(){
        return turnedCards;
    }
    
    public void setTurnedCards(String card){
        if(turnedCards == 1){
            cardOneTurned = card;
            System.out.println("Card one Turned: " + cardOneTurned);
        }else
            if(turnedCards == 2){
                cardTwoTurned = card;
                System.out.println("Card two Turned: " + cardOneTurned);
                checkSameCards();
                turnedCards=0;
                refresh(); //Refresh the cards to a new state
        }
    }
    
    public boolean checkSameCards(){
        try{
            System.out.println("Checking cards...");
            if(cardOneTurned.equals(cardTwoTurned)){
                System.out.println("Two same cards turned, blanking...");
                blankCards();
                return true;
            }
        }catch(NullPointerException e){
            System.out.println("Both or one of the cards are null!");
        }
        System.out.println("Different cards, turning...");
        return false;
    }
    
    /**
     * 
     * @param card the card selected in the randomic generator in getCard().
     * @return true if is repeated more than 2 times
     */
    public boolean isRepeated(String card){
        int i;
        int counter = 0;
        for(i=0;i<usedCards.size();i++){
            if(usedCards.get(i).equals(card)){
                counter++;
            }
        }
        return counter>=2;
    }
    
    public void blankCards(){
        for(int i=0;i<20;i++){
            if(usedCards.get(i).equals(cardOneTurned)){
                usedCards.set(i, "/br/univali/kob/poo1/images/transparent-card.png");
                defaultCards.set(i, "/br/univali/kob/poo1/images/transparent-card.png");
        }else 
            if(usedCards.get(i).equals(cardTwoTurned)){
                usedCards.set(i, "/br/univali/kob/poo1/images/transparent-card.png");
                defaultCards.set(i, "/br/univali/kob/poo1/images/transparent-card.png");
            }
        }
    }
    
    public boolean endOfGame(){
        int counter = 0;
        for(int i=0;i<20;i++){
            if(usedCards.get(i).equals("/br/univali/kob/poo1/images/transparent-card.png"))
                counter++;
        }
        return counter>=20;
    }
    
    /**
     * Refresh the cards in game menu
     */
    public void refresh(){
        Cronometer refresh = new Cronometer(this.fx, 500);
        Thread systemRefresh = new Thread(refresh);
        
        systemRefresh.start();
    }
    
    
    
    
    
    
    
    
}
