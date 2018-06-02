/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.univali.kob.poo1.aula07;

import java.io.Serializable;
import java.time.LocalDate;

/**
 *
 * @author Gustavo
 */
public class Company implements Contactable, Serializable{
    /**
     * the companys's name and email
     */
    private String name, email;
    /**
     * the company's date of establishment
     */
    private LocalDate dateOfEstablishment;
    
    /**
     * Default Constructor
     * @param name
     * @param email
     * @param dateOfEstablishment
     */
    public Company(String name, String email, LocalDate dateOfEstablishment){
        setName(name);
        setEmail(email);
        setDateOfEstablishment(dateOfEstablishment);
    }
    
     /**
     * Default Constructor
     * @param name
     * @param email
     * @param dateOfEstablishment
     */
    public Company(String name, String email, String dateOfEstablishment){
        setName(name);
        setEmail(email);
        setDateOfEstablishment(LocalDate.parse(dateOfEstablishment, AppConfig.DATE_FORMAT));
    }
    
    /**
     * 
     * @param name 
     */   
    public void setName(String name){
        this.name = name;
    }
    
    /**
     * 
     * @param email 
     */
    
    public void setEmail(String email){
        this.email = email;
    }
    
    /**
     * 
     * @param dateOfEstablishment 
     */
    public void setDateOfEstablishment(LocalDate dateOfEstablishment){
        this.dateOfEstablishment = dateOfEstablishment;
    }
    
    /**
     * 
     * @return name
     */
    public String getName(){
        return name;
    }
    
    /**
     * 
     * @return email
     */
    public String getEmail(){
        return email;
    }
    
    /**
     * 
     * @return date of establishment 
     */
    public LocalDate getDateOfEstablishment(){
        return dateOfEstablishment;
    }
    
    /**
     * Monta uma String com todos os atributos e seus respectivos valores.
     * O formato retornado é:
     * 
     * <pre>
     * {@code 
     * Nome_da_Classe_Completo{
     *   Atributo = valor
     *   Atributo = valor
     *   ...
     * }}
     * </pre>
     *  
     * @return  o estado (atributos e respectivos valores) do objeto
     */
    @Override
    public String toString(){
      StringBuilder output = new StringBuilder();
      output.append(this.getClass().getName() + " {" + AppConfig.NEW_LINE);
      output.append("  // Company" + AppConfig.NEW_LINE);
      output.append("  name = " + name + AppConfig.NEW_LINE);
      output.append("  email = " + email + AppConfig.NEW_LINE);
      output.append("  dateOfEstablishment = " +
              dateOfEstablishment.format(AppConfig.DATE_FORMAT) + AppConfig.NEW_LINE);
      output.append("}" + AppConfig.NEW_LINE);
      return output.toString();      
    }
    
    @Override
    /**
     * @param obj o objeto a ser comparado
     * @return true quando os objetos tem o mesmo estado, false o contrário
     */
    public boolean equals(Object obj){
        if (obj == this){
            return true;
        }
        if (obj == null || getClass() != obj.getClass()){
            return false;
        }
        Company company = (Company)obj;
        // considerado que dateOfBirth nunca poderá ser null (validações)
        // note que estamos na classe Person, logo temos acesso também aos
        //atributos do outro objeto
        return
             (name == company.name || name.equals(company.name)) &&
             (email == company.email || email.equals(company.email)) &&   
             (dateOfEstablishment == company.dateOfEstablishment || dateOfEstablishment.equals(company.dateOfEstablishment));
    }
    
    @Override
    public int hashCode(){
        return (name.hashCode() ^ email.hashCode()) ^ (dateOfEstablishment.hashCode());
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
