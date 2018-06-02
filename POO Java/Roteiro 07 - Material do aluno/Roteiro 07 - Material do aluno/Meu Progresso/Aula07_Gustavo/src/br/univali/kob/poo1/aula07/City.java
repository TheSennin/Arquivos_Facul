/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.univali.kob.poo1.aula07;

import java.io.Serializable;

/**
 *
 * @author Gustavo
 */
public class City implements Serializable{
    private final String name;
    private final State state;
    
    /**
     * default constructor
     * @param name o nome da cidade
     * @param state o estado da união da cidade
     */
    public City(String name, State state){
        this.name = name;
        this.state = state;
    }
    
    /**
     * getter
     * @return o nome da cidade
     */
    public String getName(){
        return name;
    }
    /**
     * getter
     * @return o estado da união
     */
    public State getState(){
        return state;
    }
    @Override
    public String toString(){
        StringBuilder output = new StringBuilder();
        output.append(this.getClass().getName() + " {" + AppConfig.NEW_LINE);
        output.append("City: " + name + AppConfig.NEW_LINE);
        output.append(state.toString());
        output.append(" }" + AppConfig.NEW_LINE);
        return output.toString();
    }
    @Override
    public boolean equals(Object obj){
        if (obj == this){
            return true;
        }
        if (obj == null || getClass() != obj.getClass()){
            return false;
        }
        City city = (City)obj;
        // considerado que dateOfBirth nunca poderá ser null (validações)
        // note que estamos na classe Person, logo temos acesso também aos
        //atributos do outro objeto
        return
             name == city.name &&
             (name == city.name || name.equals(city.name));
    }
    
    @Override
    public int hashCode(){
        return name.hashCode();
    }
}
