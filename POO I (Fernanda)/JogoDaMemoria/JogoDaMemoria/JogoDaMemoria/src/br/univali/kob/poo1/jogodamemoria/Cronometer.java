/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.univali.kob.poo1.jogodamemoria;

import br.univali.kob.poo1.controller.FXMLGameSceneController;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 6322875
 */
public class Cronometer implements Runnable{
  /**
   * Attribute to control the end of the count
   */
    
    FXMLGameSceneController fx;
    
    int time;
  
    public Cronometer(FXMLGameSceneController fx, int time){
      this.fx = fx;
      this.time = time;
    }

    @Override
    public void run(){
            try {
                Thread.sleep(time);
            }catch (InterruptedException e) {
                e.getMessage();
            }
            fx.loadImagesDefault();

    }
}
