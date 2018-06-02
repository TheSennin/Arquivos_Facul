/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.univali.kob.poo1.aula07;

/**
 *
 * @author Gustavo
 */
public class StringValidator {
    
    public void validateWordsCount(String s1, String s2, int min, int max){
        String[]word = s1.split(" ");
        if(word.length < min || word.length > max){
            throw new IllegalArgumentException("Name: " + s1 + "if out of range [" + 
                    min + ".." + max +"] of words!");
        }
    }
}
