/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.univali.kob.poo1.jogodamemoria;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author 6322875
 */
public class Ranking implements Runnable, Serializable{
    
    private String name;
    private int moveCount;
    private int matchTime;
    
    Game game;
    
    public Ranking(Game game){
        this.game = game;
    }
    
    public Ranking(String name, int moveCount, int matchTime){
        this.name = name;
        this.moveCount = moveCount;
        this.matchTime = matchTime;
    }

    @Override
    public void run() {
        do{
            try {
                Thread.sleep(1000);
                matchTime++;
            }catch (InterruptedException e) {
                e.getMessage();
            }            
        }while(!game.endOfGame());
        this.moveCount = game.getMoveCount();
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getName(){
        return this.name;
    }
    
    public int getMoveCount(){
        return this.moveCount;
    }
        
    public int getMatchTime(){
        return this.matchTime;
    }
    
    
    public void showStats(){
        System.out.println("Game Over. Stats: ");
        System.out.println("\nName: " + this.name);
        System.out.println("Match Time: " + this.matchTime + " seconds");
        System.out.println("Move Count: " + this.moveCount);
    }

    
    
    
    
    
    
    
    
    
}
