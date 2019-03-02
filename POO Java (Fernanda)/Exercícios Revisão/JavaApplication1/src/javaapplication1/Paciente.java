/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author 6322875
 */
public abstract class Paciente {
    /*
        The Person's name
    */
    private String name;
    /*
        default constructor
    */ 
    public Paciente(String name){
        this.name = name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void mostra(){
        System.out.println(name);
    }
}
