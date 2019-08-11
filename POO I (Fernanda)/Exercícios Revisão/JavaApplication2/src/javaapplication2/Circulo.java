/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author 6322875
 */
public class Circulo {
    /*
    Raio do circulo
    */
    private double raio;
    
    /*
       Construtor Default
    */
    public Circulo(double raio){
        setRaio(raio);
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
    
    /*
        Cálculo da área do círuclo
    */
    public double getArea(double raio){
        double pi = 3.14;
        return pi*raio*raio;
    }
    /*
        Cálculo do perímetro do círculo
    */
    public double getPerimetro(double raio){
        double pi = 3.14;
        return 2*pi*raio;
    }

}
