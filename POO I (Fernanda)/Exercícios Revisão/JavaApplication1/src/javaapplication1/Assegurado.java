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
public class Assegurado extends Paciente{
    /*
        Nome da seguradora
    */
    private String nomeSeguradora;
    /*
        Numero do seguro
    */
    private int numSeguro;
    
    /*
      Constructor   
    */
    public Assegurado(String name, String nomeSeguradora, int numSeguro) {
        super(name);
        this.nomeSeguradora = nomeSeguradora;
        this.numSeguro = numSeguro;
        
    }
    
    /*
        Seta o nome da seguradora
    */
    public void setNomeSeguradora(String nomeSeguradora){
        this.nomeSeguradora = nomeSeguradora;
    }
    
    /*
        Pega o nome da seguradora
    */
    public String getNomeSeguradora(){
        return this.nomeSeguradora;
    }
    
    /*
        Seta o numero do seguro
    */
    public void setNumSeguro(int numSeguro){
        this.numSeguro = numSeguro;
    }
    /*
        Pega o numero do seguro
    */
    public int getNumSeguro(){
        return this.numSeguro;
    }
    
    /*
        Mostra todos os conteudos
    */
    public void mostra(){
        super.mostra();
        System.out.println(nomeSeguradora);
        System.out.println(numSeguro);    
    }
}
