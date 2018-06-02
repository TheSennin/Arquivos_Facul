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
public class Address implements Serializable {
    //attributes
    private final String streetLine1;
    private final String streetLine2;
    private final String zipCode;
    private final City city;

    /**
     * default constructor
     * @param streetLine1
     * @param streetLine2
     * @param city
     * @param zipCode 
     */
    public Address(String streetLine1, String streetLine2, City city, String zipCode){
        this.streetLine1 = streetLine1;
        this.streetLine2 = streetLine2;
        this.zipCode = zipCode;
        this.city = city;
    }
    
    /**
     * getter
     * @return streetline1
     */
    public String getStreetLine1(){
        return streetLine1;
    }
    
    /**
     * getter
     * @return streetline2
     */
    public String getStreetLine2(){
        return streetLine2;
    }
    /**
     * getter
     * @return city
     */
    public City getCity(){
        return city;
    }
    /**
     * getter
     * @return zipcode
     */
    public String getZipCode(){
        return zipCode;
    }
    
    @Override
    public String toString(){
      StringBuilder output = new StringBuilder();
      output.append(this.getClass().getName() + " {" + AppConfig.NEW_LINE);
      output.append("Street = " + streetLine1 + AppConfig.NEW_LINE);
      output.append("Complemento = " + streetLine2 + AppConfig.NEW_LINE);
      output.append("Zip Code = " + zipCode + AppConfig.NEW_LINE);
      output.append("City = " + city.toString() + AppConfig.NEW_LINE);
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
        Address address = (Address)obj;
        // considerado que dateOfBirth nunca poderá ser null (validações)
        // note que estamos na classe Person, logo temos acesso também aos
        //atributos do outro objeto
        return
             streetLine1 == address.streetLine1 &&
             (streetLine2 == address.streetLine2 || streetLine2.equals(address.streetLine2)) &&
             (zipCode == address.zipCode || zipCode.equals(address.zipCode));
    }
    
    @Override
    public int hashCode(){
        return (streetLine1.hashCode()) ^ (streetLine2.hashCode()) ^ (zipCode.hashCode());
    }
}
