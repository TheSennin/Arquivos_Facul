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
public final class State implements Serializable{
    private final String name;
    private final String abbreviation;
    
    /**
     * @param name o nome do estado da união
     * @param abbreviation a sigla do estado
     * default constructor
     */
    public State(String name, String abbreviation){
        StringValidator val = new StringValidator();
        //name e abbreviation precisam ter, no mínimo, 1 palavra
        val.validateWordsCount(name, "Name", 1, 10);
        val.validateWordsCount(abbreviation, "Abbreviation", 1, 10);
        this.name = name;
        this.abbreviation = abbreviation;
    }
    /**
     * getter
     * @return o nome do estado
     */
    public String getName(){
        return name;
    }
    /**
     * getter
     * @return a abreviação do nome
     */
    public String getAbbreviation(){
        return abbreviation;
    }
    @Override
    public String toString(){
        StringBuilder output = new StringBuilder();
        output.append(this.getClass().getName() + " {" + AppConfig.NEW_LINE);
        output.append("State = " + name + AppConfig.NEW_LINE);
        output.append("Abbreviation = " + abbreviation + AppConfig.NEW_LINE);
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
        State state = (State)obj;
        // considerado que dateOfBirth nunca poderá ser null (validações)
        // note que estamos na classe Person, logo temos acesso também aos
        //atributos do outro objeto
        return
             (name == state.name || name.equals(state.name)) &&
             (abbreviation == state.abbreviation || abbreviation.equals(state.abbreviation));
    }
    
    @Override
    public int hashCode(){
        return name.hashCode() ^ abbreviation.hashCode();
    }
}
