/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.univali.kob.poo1.aula07;

import java.util.Comparator;

/**
 *
 * @author Gustavo
 */
public class ContactableNameComparator implements Comparator<Contactable>{
    @Override
    public int compare(Contactable c1, Contactable c2){
        return c1.getName().compareTo(c2.getName());
    }
    
}
    
   
