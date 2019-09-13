/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.univali.kob.poo1.jogodamemoria;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Gustavo
 */
public class RankingRepository implements Serializable {
    
    private static ArrayList<Ranking> rank = new ArrayList();
    
    
    public static void Write(Ranking r){
        rank.add(r);
        try{
            FileOutputStream arq = new FileOutputStream("RankingRepository");
            ObjectOutputStream obj = new ObjectOutputStream(arq);
            obj.writeObject(rank);
            obj.flush();
            obj.close();
            System.out.println("File saved succesfully!");
        }catch(IOException e){
            System.out.println("Error: could not write file.");
        }
    }
    
    public static void Write(){
        try{
            FileOutputStream arq = new FileOutputStream("RankingRepository");
            ObjectOutputStream obj = new ObjectOutputStream(arq);
            obj.writeObject(rank);
            obj.flush();
            obj.close();
            System.out.println("File saved succesfully!");
        }catch(IOException e){
            System.out.println("Error: could not write file.");
        }
    }
    
    public static ArrayList Read() throws FileNotFoundException, IOException, ClassNotFoundException{
        try{
            FileInputStream arq = new FileInputStream("RankingRepository");
            ObjectInputStream obj = new ObjectInputStream(arq);
            rank = (ArrayList)obj.readObject();
            obj.close();
            System.out.println("File readed succesfully!");
        }catch(FileNotFoundException e){
            System.out.println("Error: file not found.");
        }
        return rank;
    }
    
    public static void sort(){
        for(int j=0;j<rank.size();j++){
            for(int i=j+1;i<rank.size();i++){
                if(rank.get(j).getMatchTime() > rank.get(i).getMatchTime()){
                    Ranking t = rank.get(j);
                    rank.set(j,rank.get(i));
                    rank.set(i,t);
                }
            }
        }
        for(int j=0;j<rank.size();j++){
            for(int i=j+1;i<rank.size();i++){
                if(rank.get(j).getMoveCount() > rank.get(i).getMoveCount()){
                    Ranking t = rank.get(i);
                    rank.set(i,rank.get(j));
                    rank.set(j,t);
                }
            }
        }
        Write();
    }
}
