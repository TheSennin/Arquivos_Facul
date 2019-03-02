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
public class NaoAssegurado extends Paciente{
    /*
        Valor da consulta
    */
    private float valorConsulta;
    /*
        Código do banco
    */
    private int codBanco;
    /*
        numero do cheque
    */
    private int numCheque;

    public NaoAssegurado(String name, float valorConsulta, int codBanco, int numCheque) {
        super(name);
        setValorConsulta(valorConsulta);
        setCodBanco(codBanco);
        setNumCheque(numCheque);
    }
    public float getValorConsulta() {
        return valorConsulta;
    }

    public void setValorConsulta(float valorConsulta) {
        this.valorConsulta = valorConsulta;
    }

    public int getCodBanco() {
        return codBanco;
    }

    public void setCodBanco(int codBanco) {
        this.codBanco = codBanco;
    }

    public int getNumCheque() {
        return numCheque;
    }

    public void setNumCheque(int numCheque) {
        this.numCheque = numCheque;
    }

    public void mostra(){
        super.mostra();
        System.out.println(valorConsulta);
        System.out.println(codBanco);
        System.out.println(numCheque);
    }
}
